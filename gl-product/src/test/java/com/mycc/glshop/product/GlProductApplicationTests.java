package com.mycc.glshop.product;

import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import com.mycc.glshop.product.entity.BrandEntity;
import com.mycc.glshop.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GlProductApplicationTests {
    @Autowired
    BrandService brandService;
    @Test
    void contextLoads() {
      /*  BrandEntity entity =new BrandEntity();
        entity.setDescript("test3");
        entity.setName("testName3");
        brandService.save(entity);*/
       List<BrandEntity> list = brandService.list();
       /*  list.forEach((item)->{
            System.out.println(item);
        });*/
        for (int i = 0; i < list.size(); i++) {
            BrandEntity brandEntity = list.get(i);
            System.out.println(brandEntity);
        }


    }

}
