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
package cso.org.cn.serviceimpl;

import cso.org.cn.entity.Organization;
import cso.org.cn.mapper.OrganizationMapper;
import cso.org.cn.service.OrganizationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Organization Service层接口
 */
@Service
public class OrganizationServiceImpl implements OrganizationService {

    @Resource
    private OrganizationMapper organizationMapper;

    @Override
    public Organization queryOrganizationInfo() {
        return organizationMapper.queryOrganizationInfo();
    }
}
