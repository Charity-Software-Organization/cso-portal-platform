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
 * 合作机构实体信息
 */
@Data
public class CooperationOrganization {

    // 主键id
    private int id;

    // 合作机构名称
    private String coOrgName;

    // 合作机构详细信息
    private String coOrgProfileInfo;

}
