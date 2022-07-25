package com.ssafy.api.service;

import com.ssafy.api.request.RecruitReq;
import com.ssafy.db.entity.Recruit;

import java.util.List;
import java.util.Optional;

public interface RecruitService {

    void writeRecruit(RecruitReq recruitReq);

    List<Recruit> getList();

    List<Recruit> getRecruitingList();

    Recruit getByRecruitNo(Long recruitNo);

    void updateRecruit(Recruit recruit, RecruitReq recruitReq);

    int deleteRecruit(Long recruitNo);

}
