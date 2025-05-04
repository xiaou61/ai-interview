package com.xiaou.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xiaou.mapper.InterviewerMapper;
import com.xiaou.pojo.Interviewer;
import com.xiaou.req.InterviewerReq;
import com.xiaou.service.InterviewService;
import jakarta.annotation.Resource;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class InterviewServiceImpl implements InterviewService {

    @Resource
    private InterviewerMapper interviewerMapper;

    @Override
    public void createOrUpdate(InterviewerReq req) {
        Interviewer interviewer = new Interviewer();
        BeanUtils.copyProperties(req, interviewer);
        interviewer.setUpdatedTime(LocalDateTime.now());
        if (StringUtils.isBlank(interviewer.getId())) {
            interviewer.setCreateTime(LocalDateTime.now());
            interviewerMapper.insert(interviewer);
        } else {
            interviewerMapper.updateById(interviewer);
        }
    }

    @Override
    public List<Interviewer> queryAll() {
        return interviewerMapper.selectList(new QueryWrapper<Interviewer>().orderByDesc("updated_time"));
    }

    @Override
    public void delete(String id) {
        interviewerMapper.deleteById(id);
    }
}
