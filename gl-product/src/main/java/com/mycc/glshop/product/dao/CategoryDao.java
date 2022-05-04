package com.mycc.glshop.product.dao;

import com.mycc.glshop.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author mycc
 * @email 
 * @date 2022-05-03 22:02:51
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
