package com.wenfee.onlinemall.member.dao;

import com.wenfee.onlinemall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author Mr.Wenfee
 * @email mr_wenfee@163.com
 * @date 2021-03-15 17:01:42
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
