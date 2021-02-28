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
package cso.org.cn.controller;

import cso.org.cn.common.response.ResponseData;
import cso.org.cn.common.response.ResultData;
import cso.org.cn.entity.Organization;
import cso.org.cn.service.OrganizationService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Organization 前端交互接口
 */
@RestController
@Api(value = "组织接口类")
@RequestMapping(value = "/org")
public class OrganizationController {

    @Autowired
    private OrganizationService organizationService;

    @RequestMapping(value = "/queryOrgInfo", method = RequestMethod.GET)
    public ResponseData queryOrgInfo(){
        Organization organizationData = organizationService.queryOrganizationInfo();
        return ResultData.buildSuccess(organizationData);
    }
}
