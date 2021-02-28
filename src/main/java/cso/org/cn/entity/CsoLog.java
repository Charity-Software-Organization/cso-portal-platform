package cso.org.cn.entity;

import lombok.Data;

/**
 * @program: CSO-Portal-Platform
 * @description:
 * @organization: Charity-Software-Organization
 * @author: jinyubo
 * @create: 2021-02-28 10:23
 */
@Data
public class CsoLog {
    private long id;
    /**
     * 请求地址
     */
    private String url;
    /**
     * 请求IP
     */
    private String ip;
    /**
     * 请求方式
     */
    private String httpMethod;
    /**
     * 请求类，方法
     */
    private String classMethod;
    /**
     * 方法参数
     */
    private String args;
    /**
     * 请求参数
     */
    private String reqParams;
    /**
     * 响应参数
     */
    private String respParams;
    /**
     * 响应时间
     */
    private long spendTime;
    /**
     * 日志类型（web、service）
     */
    private String logType;


}