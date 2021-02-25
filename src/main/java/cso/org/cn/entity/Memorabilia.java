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
 * 大事记 实体信息
 */
public class Memorabilia {

    // 主键id
    private int id;

    // 大事记标题
    private String memorabiliaTitle;

    // 大事记具体信息
    private String memorabiliaInfo;

    // 大事记创建日期 （数据库为String 类型）
    private String memorabiliaDate;

    // 大事记类型（1.对组织内，2.对组织外）
    private int memorabiliaType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMemorabiliaTitle() {
        return memorabiliaTitle;
    }

    public void setMemorabiliaTitle(String memorabiliaTitle) {
        this.memorabiliaTitle = memorabiliaTitle;
    }

    public String getMemorabiliaInfo() {
        return memorabiliaInfo;
    }

    public void setMemorabiliaInfo(String memorabiliaInfo) {
        this.memorabiliaInfo = memorabiliaInfo;
    }

    public String getMemorabiliaDate() {
        return memorabiliaDate;
    }

    public void setMemorabiliaDate(String memorabiliaDate) {
        this.memorabiliaDate = memorabiliaDate;
    }

    public int getMemorabiliaType() {
        return memorabiliaType;
    }

    public void setMemorabiliaType(int memorabiliaType) {
        this.memorabiliaType = memorabiliaType;
    }
}
