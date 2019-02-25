package com.lly.pcrpolice.repository;

import com.lly.pcrpolice.pojo.pcr.Boss;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * @author Louly
 * @version 1.0.0, 2019/2/22
 */
@Transactional
public interface BossInfoRepository extends JpaRepository<Boss,Long>{
    @Select("select * from boss b where b.time = '#{time}' and b.hp>#{hp} ")
    List<Boss> getBossByTimeAndHpGreaterThan(@Param("time") String time, @Param("hp")long hp);
}
