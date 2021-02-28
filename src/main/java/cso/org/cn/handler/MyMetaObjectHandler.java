package cso.org.cn.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @program: CSO-Portal-Platform
 * @description:  insert update时自动添加 开始时间 修改时间
 * @organization: Charity-Software-Organization
 * @author: jinyubo
 * @create: 2021-02-27 23:37
 */
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {
    /**
     * @描述 填充开始时间
     * @参数 [metaObject]
     * @返回值 void
     * @创建人 166768601@qq.com
     * @创建时间
     */
    @Override
    public void insertFill(MetaObject metaObject) {
        this.setFieldValByName("createTime", new Date(), metaObject);
        this.setFieldValByName("updateTime", new Date(), metaObject);

    }

    /**
     * @描述 填充修改时间
     * @参数 [metaObject]
     * @返回值 void
     * @创建人 166768601@qq.com
     * @创建时间
     */
    @Override
    public void updateFill(MetaObject metaObject) {
        this.setFieldValByName("updateTime", new Date(), metaObject);
    }
}