package cso.org.cn.aop;

import eu.bitwalker.useragentutils.UserAgent;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.util.Arrays;

/**
 * @program: CSO-Portal-Platform
 * @description: aop输入日志信息
 * @organization: Charity-Software-Organization
 * @author: jinyubo
 * @create: 2021-02-28 10:04
 */

@Aspect
@Component
@Slf4j
public class WebLogAspect {
    //private Logger log = LoggerFactory.getLogger(this.getClass());
    /**
     * 进入方法时间戳
     */
    private Long startTime;
    /**
     * 方法结束时间戳(计时)
     */
    private Long endTime;

    public WebLogAspect() {
    }

    /**
     *@Description:   定义一个切入点. ~ 第一个 * 代表任意修饰符及任意返回值.~ 第二个 * 任意包名 ~ 第三个 * 代表任意方法. ~ 第四个 * 定义在web包或者子包 ~ 第五个 * 任意方法 ~ .. 匹配任意数量的参数.
     *@Param: []
     *@return: void
     *@organization: Charity-Software-Organization
     *@Author: jinyubo
     *@date: 2021/2/28
     */
    @Pointcut("execution(public * cso.org.cn.controller.*.*(..))")
    public void webLogPointcut() {

    }

    /**
     *@Description: 前置通知
     *@Param: [joinPoint]
     *@return: void
     *@organization: Charity-Software-Organization
     *@Author: jinyubo
     *@date: 2021/2/28
     */
    @Before("webLogPointcut()")
    public void doBefore(JoinPoint joinPoint) {
        // 接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        //获取请求头中的User-Agent
         UserAgent userAgent = UserAgent.parseUserAgentString(request.getHeader("User-Agent"));
        //打印请求的内容
        startTime = System.currentTimeMillis();
        log.info("请求开始时间：{}" + LocalDateTime.now());
        log.info("请求Url : {}" + request.getRequestURL().toString());
        log.info("请求方式 : {}" + request.getMethod());
        log.info("请求ip : {}" + request.getRemoteAddr());
        log.info("请求方法 : " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        log.info("请求参数 : {}" + Arrays.toString(joinPoint.getArgs()));
        // 系统信息
        log.info("浏览器：{}", userAgent.getBrowser().toString());
        log.info("浏览器版本：{}", userAgent.getBrowserVersion());
        log.info("操作系统: {}", userAgent.getOperatingSystem().toString());
    }


    /**
     *@Description: 返回通知 1. 在目标方法正常结束之后执行 2. 在返回通知中补充请求日志信息，如返回时间，方法耗时，返回值，并且保存日志信息
     *@Param: [ret]
     *@return: void
     *@organization: Charity-Software-Organization
     *@Author: jinyubo
     *@date: 2021/2/28
     */
    @AfterReturning(returning = "ret", pointcut = "webLogPointcut()")
    public void doAfterReturning(Object ret) throws Throwable {

        endTime = System.currentTimeMillis();
        log.info("请求结束时间：{}" + LocalDateTime.now());
        log.info("请求耗时：{}" + (endTime - startTime));
        // 处理完请求，返回内容
        log.info("请求返回 : {}" + ret);
    }

    /**
     *@Description: 异常通知 1. 在目标方法非正常结束，发生异常或者抛出异常时执行 2. 在异常通知中设置异常信息，并将其保存
     *@Param: [throwable]
     *@return: void
     *@organization: Charity-Software-Organization
     *@Author: jinyubo
     *@date: 2021/2/28
     */
    @AfterThrowing(value = "webLogPointcut()", throwing = "throwable")
    public void doAfterThrowing(Throwable throwable) {
        // 保存异常日志记录
        log.error("发生异常时间：{}" + LocalDateTime.now());
        log.error("抛出异常：{}" + throwable.getMessage());
    }
}