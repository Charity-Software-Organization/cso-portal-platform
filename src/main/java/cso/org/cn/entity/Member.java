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
package cso.org.cn.entity;

import lombok.Data;

/**
 * 成员实体信息
 */
@Data
public class Member {

    // 主键id
    private String id;

    // 成员名称
    private String memberName;

    // 成员性别（这里对应DB存取的是 男女字符串 不是数字01表示）
    private String memberSex;

    // 成员生日（对应DB是字符串保存日期 不是date datetime）
    private String memberBirthday;

    // 成员个人信息
    private String memberProfileInfo;

    // 成员照片（url地址）
    private String memberPhoto;


}
