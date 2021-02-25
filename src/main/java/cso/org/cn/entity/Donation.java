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
 * 捐赠实体类
 */
public class Donation {

    // 主键id
    private int id;

    // 捐赠机构名称
    private String donationOrgName;

    // 捐赠项目名称
    private String donationProjectName;

    // 捐赠金额
    private double donationPrice;

    // 捐赠类型（1.线上 2.线下）
    private int donationType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDonationOrgName() {
        return donationOrgName;
    }

    public void setDonationOrgName(String donationOrgName) {
        this.donationOrgName = donationOrgName;
    }

    public String getDonationProjectName() {
        return donationProjectName;
    }

    public void setDonationProjectName(String donationProjectName) {
        this.donationProjectName = donationProjectName;
    }

    public double getDonationPrice() {
        return donationPrice;
    }

    public void setDonationPrice(double donationPrice) {
        this.donationPrice = donationPrice;
    }

    public int getDonationType() {
        return donationType;
    }

    public void setDonationType(int donationType) {
        this.donationType = donationType;
    }
}