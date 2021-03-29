package com.wenfee.onlinemall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wenfee.onlinemall.common.utils.PageUtils;
import com.wenfee.onlinemall.member.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author Mr.Wenfee
 * @email mr_wenfee@163.com
 * @date 2021-03-15 17:01:42
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

