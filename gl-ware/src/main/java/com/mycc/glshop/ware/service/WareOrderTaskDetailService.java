package com.mycc.glshop.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mycc.common.utils.PageUtils;
import com.mycc.glshop.ware.entity.WareOrderTaskDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author mycc
 * @email 
 * @date 2022-04-20 11:21:27
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

