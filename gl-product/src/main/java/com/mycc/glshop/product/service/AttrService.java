package com.mycc.glshop.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mycc.common.utils.PageUtils;
import com.mycc.glshop.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author mycc
 * @email 
 * @date 2022-04-18 22:13:10
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

