package com.wenfee.onlinemall.product;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wenfee.onlinemall.product.entity.BrandEntity;
import com.wenfee.onlinemall.product.service.BrandService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@Slf4j
@SpringBootTest
public class ProductServiceApplicationTests {

    @Autowired
    private BrandService brandService;

    @Test
    public void saveTest() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("华为");
        brandService.save(brandEntity);
    }

    @Test
    public void updateTest() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setDescript("中华有为");
        brandEntity.setBrandId(1L);
        brandService.updateById(brandEntity);
    }

    @Test
    public void queryTest() {
        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("name", "华为"));
        list.forEach((item) -> {
            log.info("<=== " + item);
        });
    }

}
