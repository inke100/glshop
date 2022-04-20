package com.mycc.glshop.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mycc.common.utils.PageUtils;
import com.mycc.glshop.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * 专题商品
 *
 * @author mycc
 * @email 
 * @date 2022-04-20 11:02:02
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

