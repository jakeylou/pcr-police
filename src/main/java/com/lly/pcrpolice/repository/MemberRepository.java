package com.lly.pcrpolice.repository;

import com.lly.pcrpolice.pojo.pcr.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Louly
 * @version 1.0.0, 2019/2/22
 */
@Transactional
public interface MemberRepository extends JpaRepository<Member,Long>{
}
