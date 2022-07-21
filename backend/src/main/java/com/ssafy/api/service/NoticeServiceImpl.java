package com.ssafy.api.service;

import com.ssafy.api.request.NoticeWritePostReq;
import com.ssafy.db.entity.Notice;
import com.ssafy.db.repository.NoticeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class NoticeServiceImpl implements NoticeService{

    @Autowired
    NoticeRepository noticeRepository;

    @Override
    public Notice writeNotice(NoticeWritePostReq noticeWritePostReq) {
        Notice notice = new Notice();
        notice.setNoticeTitle(noticeWritePostReq.getNoticeTitle());
        notice.setNoticeContents(noticeWritePostReq.getNoticeContents());

        // 작성일자
        SimpleDateFormat dataFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date now = new Date();
        notice.setWriteDate(dataFormat.format(now));
        noticeRepository.save(notice);

        return notice;
    }

//    @Override
//    public List<Notice> NoticeList(){
//        return noticeRepository.findAll();
//    }
//
//    @Override
//    public Notice detailNotice(long noticeNo){
//
//    }
//
//    @Override
//    public Notice updateNotice(Notice notice){
//
//         ;
//    }
//    @Override
//    public void deleteNotice(long noticeNo){
//
//    }

}
