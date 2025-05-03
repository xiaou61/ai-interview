package com.xiaou.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiaou.pojo.Job;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 职位信息表 Mapper 接口
 * </p>
 *
 * @author xiaou
 * @since 2025-05-03
 */
@Mapper
public interface JobMapper extends BaseMapper<Job> {

}
