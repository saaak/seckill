package org.seckill.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.dto.Exposer;
import org.seckill.dto.SeckillExecution;
import org.seckill.entity.Seckill;
import org.seckill.service.SeckillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:springDao.xml","classpath:SpringService.xml"})
public class SeckillServiceImplTest {
    @Autowired
    private SeckillService seckillService;

    @Test
    public void getSeckillList() {
        List<Seckill> seckills = seckillService.getSeckillList();
        for(Seckill seckill:seckills){
            System.out.println(seckill);
        }
    }

    @Test
    public void getSeckillById() {
        Seckill seckill = seckillService.getSeckillById(1000);
        System.out.println(seckill);
    }

    @Test
    public void exportSeckillUrl() {
        Exposer exposer = seckillService.exportSeckillUrl(1000);
        System.out.println(exposer);
    }

    @Test
    public void executeSeckill() {
        Exposer exposer = seckillService.exportSeckillUrl(1000);
        SeckillExecution seckillExecution = seckillService.executeSeckill(1000,18752916926l,exposer.getMd5());
        System.out.println(seckillExecution);
    }
}
