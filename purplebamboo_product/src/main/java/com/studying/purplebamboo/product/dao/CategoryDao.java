package com.studying.purplebamboo.product.dao;

import com.studying.purplebamboo.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author purplebamboo
 * @email purplebamboo@gmail.com
 * @date 2021-03-31 23:08:35
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
