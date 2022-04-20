package com.mycc.glshop.member.dao;

import com.mycc.glshop.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author mycc
 * @email 
 * @date 2022-04-20 11:08:13
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
