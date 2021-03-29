package com.wenfee.onlinemall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.wenfee.onlinemall.common.utils.PageUtils;
import com.wenfee.onlinemall.product.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author Mr.Wenfee
 * @email mr_wenfee@163.com
 * @date 2021-03-15 12:42:07
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

