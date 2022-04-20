package com.mycc.glshop.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mycc.common.utils.PageUtils;
import com.mycc.glshop.coupon.entity.HomeAdvEntity;

import java.util.Map;

/**
 * 首页轮播广告
 *
 * @author mycc
 * @email 
 * @date 2022-04-20 11:02:02
 */
public interface HomeAdvService extends IService<HomeAdvEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

