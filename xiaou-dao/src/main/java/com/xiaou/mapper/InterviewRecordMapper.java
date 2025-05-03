package com.xiaou.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiaou.pojo.InterviewRecord;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 面试记录表 Mapper 接口
 * </p>
 *
 * @author xiaou
 * @since 2025-05-03
 */
@Mapper
public interface InterviewRecordMapper extends BaseMapper<InterviewRecord> {

}
