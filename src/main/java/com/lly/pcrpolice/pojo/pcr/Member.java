package com.lly.pcrpolice.pojo.pcr;

import lombok.Data;

import javax.persistence.*;

/**
 * @author Louly
 * @version 1.0.0, 2019/2/22
 */
@Data
@Entity
@Table(name = "member")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String userId;
    @Column(name = "username")
    private String userName;
    @Column(name = "count")
    private int count;
    @Column(name = "attack")
    private long attack;
}
