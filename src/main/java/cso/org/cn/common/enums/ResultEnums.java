package cso.org.cn.common.enums;


/**
 * @program: CSO-Portal-Platform
 * @description:  ResultEnums
 * @organization: Charity-Software-Organization
 * @author: jinyubo
 * @create: 2021-02-28 09:49
 */
public enum  ResultEnums  {
    SUCCESS(0,"请求成功"),
    ERROR(1,"请求失败"),
    NULLERROR(2, "null"),
    NOT_FOUND(404, "未找到该资源!"),
    INTERNAL_SERVER_ERROR(500, "服务器内部错误!"),
    SERVER_BUSY(503,"服务器正忙，请稍后再试!"),
    NEEDAUTHORITIES(000,"需要认证！"),
    LOGOUT_SUCCESS(100,"登录注销成功！"),
    LOGIN_SUCCESS(200,"登录认证成功！"),
    NOAUTHORITIES(300, "无权限访问！"),
    LOGIN_ERROR(400,"登录认证失败！"),
    LOGIN_TIMEOUT(401,"登录超时！"),
    LOGIN_UNKNOWERROR(402,"登录认证未知错误！");


    private int code;
    private String msg;

    ResultEnums(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
 