package com.ssafy.db.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "recruit")
public class Recruit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "recruit_no")
    private Long recruitNo;

    @Column(name = "recruit_title")
    private String recruitTitle;

    @Column(name = "std_name")
    private String stdName;

    @Column(name = "std_detail")
    private String stdDetail;

    @Column(name = "std_img")
    private String stdImg;

    @Enumerated(EnumType.STRING)
    @Column(name = "std_type")
    private StdType stdType;

    @Column(name = "com_name")
    private String comName;

    @Column(name = "start_date")
    private String startDate;

    @Column(name = "end_date")
    private String endDate;

    @Column(name = "std_day")
    private String stdDay;

    @Column(name = "std_limit")
    private int stdLimit;

    @OneToMany(mappedBy = "recruit")
    private List<Apply> applies = new ArrayList<>();

}
