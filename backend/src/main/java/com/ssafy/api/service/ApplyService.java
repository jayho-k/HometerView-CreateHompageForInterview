package com.ssafy.api.service;

import com.ssafy.db.entity.ApplyType;
import com.ssafy.db.entity.Recruit;

import java.util.List;

public interface ApplyService {

    int applyRecruit(Long userNo, Long recruitNo, ApplyType applyType);

    int deleteApply(Long userNo, Long recruitNo);

    long[] getApplyCounts(List<Recruit> recruits);

    long getApplyCount(Recruit recruit);

}