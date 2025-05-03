package com.xiaou.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiaou.pojo.Candidate;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 应聘者表 Mapper 接口
 * </p>
 *
 * @author xiaou
 * @since 2025-05-03
 */
@Mapper
public interface CandidateMapper extends BaseMapper<Candidate> {

}
