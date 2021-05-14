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

package com.pamirs.tro.entity.domain.vo.scenemanage;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassName SceneManageVO
 * @Description
 * @Author qianshui
 * @Date 2020/4/17 下午4:43
 */
@Data
@ApiModel(value = "SceneManageVO", description = "场景基本信息")
public class SceneManageVO implements Serializable {

    private static final long serialVersionUID = 8025167061737917751L;

    @ApiModelProperty(name = "sceneName", value = "压测场景名称")
    private String sceneName;

}
