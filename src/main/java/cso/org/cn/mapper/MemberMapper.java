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
package cso.org.cn.mapper;

import cso.org.cn.entity.Member;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/*
 * MemberMapper
 * 描述: 成员 Dao层接口
 */
public interface MemberMapper {

    List<Member> queryMemberInfoByList(Member member);

    int insertMemberInfo (Member member);

    int updateMemberInfoById (@Param("id") int id);

    int deleteMemberInfoById (@Param("id") int id);
}
