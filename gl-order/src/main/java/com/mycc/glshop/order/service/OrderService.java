package com.mycc.glshop.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mycc.common.utils.PageUtils;
import com.mycc.glshop.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author mycc
 * @email 
 * @date 2022-04-20 11:08:52
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

