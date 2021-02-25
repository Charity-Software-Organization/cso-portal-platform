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

public class DataResponse<T> extends BaseResponse {

    private T data;

    private long count;

    private DataResponse() {}

    private DataResponse(CodeEnum code, T data, long count) {
        super(code);
        this.data = data;
        this.count = count;
    }

    public static <T> DataResponse<T> response(CodeEnum code, T data, long count) {
        return new DataResponse<T>(code, data, count);
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

}
