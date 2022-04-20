package com.mycc.glshop.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mycc.common.utils.PageUtils;
import com.mycc.glshop.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author mycc
 * @email 
 * @date 2022-04-20 11:21:27
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

