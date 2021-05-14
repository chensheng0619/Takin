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

package io.shulie.tro.web.data.dao.application.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.shulie.tro.web.data.dao.application.ShadowJobConfigDAO;
import io.shulie.tro.web.data.mapper.mysql.ShadowJobConfigMapper;
import io.shulie.tro.web.data.model.mysql.ShadowJobConfigEntity;
import io.shulie.tro.web.data.util.MPUtil;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liuchuan
 * @date 2021/4/8 10:51 上午
 */
@Service
public class ShadowJobConfigDAOImpl
        extends ServiceImpl<ShadowJobConfigMapper, ShadowJobConfigEntity>
        implements ShadowJobConfigDAO, MPUtil<ShadowJobConfigEntity> {

    @Override
    public List<ShadowJobConfigEntity> listByApplicationId(Long applicationId) {
        return this.list(this.getLQW().eq(ShadowJobConfigEntity::getApplicationId, applicationId));
    }

}
