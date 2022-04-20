package com.mycc.glshop.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mycc.common.utils.PageUtils;
import com.mycc.glshop.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author mycc
 * @email 
 * @date 2022-04-18 22:13:10
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

