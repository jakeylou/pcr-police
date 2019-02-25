package com.lly.pcrpolice.pojo.pcr;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @author Louly
 * @version 1.0.0, 2019/2/22
 */
@Data
@Entity
@Table(name = "boss")
public class Boss {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private int order;
    @Column(name = "name",length = 255,nullable = false)
    private String name;
    @Column
    private long hp;
    @Column(name = "totalhp")
    private long totalHp;
    @Column
    private int turn;
    @Column
    private String time;



}
