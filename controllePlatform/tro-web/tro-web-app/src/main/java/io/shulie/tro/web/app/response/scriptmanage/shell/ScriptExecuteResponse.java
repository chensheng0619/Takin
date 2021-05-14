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

package io.shulie.tro.web.app.response.scriptmanage.shell;

import lombok.Data;

/**
* @Package io.shulie.tro.web.data.model.mysql
* @author 无涯
* @description:
* @date 2020/12/11 2:54 下午
*/
@Data
public class ScriptExecuteResponse {

    private Long id;
    /**
     * 实例id
     */
    private Long scripDeployId;

    private Integer scriptVersion;
    /**
     * 创建时间
     */
    private String gmtCreate;

    /**
     * 执行人
     */
    private String executor;

    /**
     * 执行结果
     */
    private Boolean success;

    /**
     * 是否停止
     */
    private Boolean isStop;

    /**
     * 执行结果
     */
    private String result;

}
