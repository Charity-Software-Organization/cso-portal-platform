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

/**
 * 组织实体信息
 */
public class Organization {

    // 主键ID
    private int id;

    // 组织简介
    private String orgProfileInfo;

    // 组织创建日期
    private String orgCreatedate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        id = id;
    }

    public String getOrgProfileInfo() {
        return orgProfileInfo;
    }

    public void setOrgProfileInfo(String orgProfileInfo) {
        this.orgProfileInfo = orgProfileInfo;
    }

    public String getOrgCreatedate() {
        return orgCreatedate;
    }

    public void setOrgCreatedate(String orgCreatedate) {
        this.orgCreatedate = orgCreatedate;
    }
}
