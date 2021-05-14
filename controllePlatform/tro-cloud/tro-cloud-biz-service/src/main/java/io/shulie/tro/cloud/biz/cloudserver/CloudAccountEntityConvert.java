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

package io.shulie.tro.cloud.biz.cloudserver;

import java.util.List;

import com.pamirs.tro.entity.domain.entity.cloudserver.CloudAccount;
import com.pamirs.tro.entity.domain.vo.cloudserver.CloudAccountVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * @Author: mubai
 * @Date: 2020-05-09 21:24
 * @Description:
 */

@Mapper
public interface CloudAccountEntityConvert {
    CloudAccountEntityConvert INSTAMCE = Mappers.getMapper(CloudAccountEntityConvert.class);

    @Mappings({
        @Mapping(source = "gmtCreate", target = "gmtCreate", dateFormat = "yyyy-MM-dd HH:mm:ss"),
        @Mapping(source = "gmtUpdate", target = "gmtUpdate", dateFormat = "yyyy-MM-dd HH:mm:ss"),
    })
    CloudAccountVO of(CloudAccount cloudAccount);

    List<CloudAccountVO> ofs(List<CloudAccount> cloudPlatforms);

}
