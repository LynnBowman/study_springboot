package com.studying.purplebamboo.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.studying.common.utils.PageUtils;
import com.studying.purplebamboo.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author purplebamboo
 * @email purplebamboo@gmail.com
 * @date 2021-03-31 23:08:35
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

