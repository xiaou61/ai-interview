package com.xiaou.web.controller;

import com.xiaou.common.utils.R;
import com.xiaou.req.InterviewerReq;
import com.xiaou.service.InterviewService;
import jakarta.annotation.Resource;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/interviewer")
public class InterviewerController {


    @Resource
    private InterviewService interviewService;

    /**
     * 创建或更新
     *
     * @param req
     * @return
     */
    @PostMapping("/createOrUpdate")
    private R createOrUpdate(@Valid @RequestBody InterviewerReq req) {
        interviewService.createOrUpdate(req);
        return R.ok("操作成功");
    }
}
