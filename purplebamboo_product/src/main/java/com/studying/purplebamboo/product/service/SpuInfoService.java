package com.studying.purplebamboo.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.studying.common.utils.PageUtils;
import com.studying.purplebamboo.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author purplebamboo
 * @email purplebamboo@gmail.com
 * @date 2021-03-31 23:08:35
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

