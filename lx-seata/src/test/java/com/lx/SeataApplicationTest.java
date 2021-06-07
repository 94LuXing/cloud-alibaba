package com.lx;

import com.lx.business.entity.SaleContract;
import com.lx.business.mapper.SaleContractMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Unit test for simple App.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class SeataApplicationTest {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private SaleContractMapper saleContractMapper;


    @Test
    public void testRedis() {
        String lx = stringRedisTemplate.opsForValue().get("ZCF");
        System.out.println(lx);
    }

    @Test
    public void testQuery(){
        SaleContract saleContract = saleContractMapper.selectById("05d6b89506d54bf586c07d0f89d66b6b");
        System.out.println(saleContract.toString());
    }


}
