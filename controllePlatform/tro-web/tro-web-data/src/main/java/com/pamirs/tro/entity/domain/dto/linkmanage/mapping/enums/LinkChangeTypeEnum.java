/*
 * Copyright 2021 Shulie Technology, Co.Ltd
 * Email: shulie@shulie.io
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.pamirs.tro.entity.domain.dto.linkmanage.mapping.enums;

import lombok.Getter;

/**
 * @Auther: vernon
 * @Date: 2019/12/23 22:31
 * @Description:
 */
@Getter
public enum LinkChangeTypeEnum {

    /*  NO_FLOW_("1", "无调用流量通知"),
      ADD_LINK_("2", "添加调用关系通知");*/
    NO_FLOW_("1", "入口变更"),
    ADD_LINK_("2", "关联链路变更");

    private String code;
    private String desc;

    LinkChangeTypeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
