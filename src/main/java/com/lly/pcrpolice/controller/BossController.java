package com.lly.pcrpolice.controller;

import com.lly.pcrpolice.pojo.pcr.Boss;
import com.lly.pcrpolice.repository.BossInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author Louly
 * @version 1.0.0, 2019/2/22
 */
@RestController
public class BossController {

    @Autowired
    BossInfoRepository bossInfoRepository;

    /**
     * 获取当前Boss
     * @return
     */
    @RequestMapping(value = "/pcr/getCurrent", method = RequestMethod.GET)
    public String getCurrentBoss(){
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
        Boss boss = getCurrentBossByTime(sdf.format(now));
        System.out.println( "当前为" + boss.getOrder() + "号Boss:" + boss.getName() + ",当前HP:" + boss.getHp() + "/" + boss.getTotalHp());
        return "当前为" + boss.getOrder() + "号Boss:" + boss.getName() + ",当前HP:" + boss.getHp() + "/" + boss.getTotalHp();
    }

    private Boss getCurrentBossByTime(String time){
        List<Boss> boss = bossInfoRepository.getBossByTimeAndHpGreaterThan(time,0);
        return boss.get(0);
    }
}
