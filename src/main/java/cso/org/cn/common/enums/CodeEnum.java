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
package cso.org.cn.common.enums;

/*
 * 响应状态码枚举说明
 */
public enum CodeEnum {

    // 基本状态码
    SUCCESS(0, "成功！"),
    ERROR(1, "失败，未知错误！"),
    NULLERROR(2, "失败，空指针！"),
    // 登录状态码
    NEEDAUTHORITIES(000,"需要认证！"),
    LOGOUT_SUCCESS(100,"登录注销成功！"),
    LOGIN_SUCCESS(200,"登录认证成功！"),
    NOAUTHORITIES(300, "无权限访问！"),
    LOGIN_ERROR(400,"登录认证失败！"),
    LOGIN_TIMEOUT(401,"登录超时！"),
    LOGIN_UNKNOWERROR(402,"登录认证未知错误！"),
    // 数据状态码
    DATA_NULLERROR(500,"失败，查询不到对应的数据！"),;

    /**
     * 响应状态码
     */
    private final int code;

    /**
     * 响应提示
     */
    private final String msg;

    CodeEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
