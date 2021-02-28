package cso.org.cn.common.response;

import  cso.org.cn.common.enums.ResultEnums;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @program: CSO-Portal-Platform
 * @description: 统一API响应结果封装
 * @organization: Charity-Software-Organization
 * @author: jinyubo
 * @create: 2021-02-28 09:49
 */
@Data  //所有属性的get和set方法 toString 方法    hashCode方法  equals方法
@NoArgsConstructor //无参构造
public class ResponseData<T> implements Serializable {
    private int code;

    private String msg;

    private T data;


    public ResponseData(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ResponseData(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResponseData(ResultEnums resultEnums) {
        this.code = resultEnums.getCode();
        this.msg = resultEnums.getMsg();
    }

    public ResponseData(ResultEnums resultEnums, T data) {
        this.code = resultEnums.getCode();
        this.msg = resultEnums.getMsg();
        this.data = data;
    }


}
 