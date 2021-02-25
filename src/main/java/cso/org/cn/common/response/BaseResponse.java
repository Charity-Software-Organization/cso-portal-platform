/*
 * Copyright 2021 CharitySoftware.org.cn, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance
 * with the License. A copy of the License is located at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package cso.org.cn.common.response;


import cso.org.cn.common.enums.CodeEnum;

/*
 * 基本响应封装类
 */
public class BaseResponse {
    /**
     * 响应码
     */
    private int code;

    /**
     * 响应消息
     */
    private String msg;

    protected BaseResponse() {}

    protected BaseResponse(CodeEnum code) {
        this.code = code.getCode();
        this.msg = code.getMsg();
    }

    public static BaseResponse out(CodeEnum code) {
        return new BaseResponse(code);
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
