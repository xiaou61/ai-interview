package com.xiaou.service;

import com.xiaou.pojo.Interviewer;
import com.xiaou.req.InterviewerReq;

import java.util.List;

public interface InterviewService {
    void createOrUpdate(InterviewerReq req);

    List<Interviewer> queryAll();

    void delete(String id);
}
