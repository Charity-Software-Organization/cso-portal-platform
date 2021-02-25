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

import com.alibaba.fastjson.JSON;
import cso.org.cn.common.enums.CodeEnum;
import cso.org.cn.common.response.DataResponse;
import cso.org.cn.entity.Organization;
import cso.org.cn.service.OrganizationService;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Organization 前端交互接口
 */
@RestController
@Api(value = "组织接口类")
@RequestMapping(value = "/org")
public class OrganizationController {

    private Logger log = LoggerFactory.getLogger(OrganizationController.class);

    @Autowired
    private OrganizationService organizationService;

    @RequestMapping(value = "/queryOrgInfo", method = RequestMethod.GET)
    @ResponseBody
    private String queryOrgInfo(){
        DataResponse<Organization> response = null;
        log.info("请求查询组织信息接口开始...");
        try {
            Organization organizationData = organizationService.queryOrganizationInfo();
            // 这里由于分页后面要传long类型的分页数量 我这个controller暂不需要分页所以随便传一个
            long pageNull = 0L;
            response = DataResponse.response(CodeEnum.SUCCESS, organizationData, pageNull);
            return JSON.toJSONString(response);
        }catch (Exception e){
            log.error("请求查询组织信息接口异常, 异常信息{}", e.getMessage());
            e.printStackTrace();
            return e.getMessage();
        }finally {
            log.info("请求查询组织信息接口结束...");
        }
    }
}
