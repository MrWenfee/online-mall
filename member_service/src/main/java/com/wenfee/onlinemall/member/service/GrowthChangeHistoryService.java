package com.wenfee.onlinemall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wenfee.onlinemall.common.utils.PageUtils;
import com.wenfee.onlinemall.member.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author Mr.Wenfee
 * @email mr_wenfee@163.com
 * @date 2021-03-15 17:01:42
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

