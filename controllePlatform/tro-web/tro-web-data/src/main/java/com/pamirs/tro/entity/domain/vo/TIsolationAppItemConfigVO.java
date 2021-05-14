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

package com.pamirs.tro.entity.domain.vo;

import java.util.List;

import com.pamirs.tro.entity.domain.entity.TIsolationAppItemConfig;

public class TIsolationAppItemConfigVO extends TIsolationAppItemConfig {

    private List<Long> applicationIds;

    private List<Long> keyIds;

    public List<Long> getApplicationIds() {
        return applicationIds;
    }

    public void setApplicationIds(List<Long> applicationIds) {
        this.applicationIds = applicationIds;
    }

    public List<Long> getKeyIds() {
        return keyIds;
    }

    public void setKeyIds(List<Long> keyIds) {
        this.keyIds = keyIds;
    }
}
