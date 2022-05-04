package com.mycc.glshop.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mycc.common.utils.PageUtils;
import com.mycc.glshop.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author mycc
 * @email 
 * @date 2022-05-03 22:02:51
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
    //tree形式展示列表
    List<CategoryEntity> listWithTree();
}

