package com.studying.purplebamboo.product.dao;

import com.studying.purplebamboo.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author purplebamboo
 * @email purplebamboo@gmail.com
 * @date 2021-03-31 23:08:35
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
