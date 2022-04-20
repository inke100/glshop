package com.mycc.glshop.order.dao;

import com.mycc.glshop.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author mycc
 * @email 
 * @date 2022-04-20 11:08:52
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
