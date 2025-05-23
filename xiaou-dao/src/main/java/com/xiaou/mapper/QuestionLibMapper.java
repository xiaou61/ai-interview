package com.xiaou.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiaou.pojo.QuestionLib;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 面试题库表（每个数字人面试官都会对应一些面试题） Mapper 接口
 * </p>
 *
 * @author xiaou
 * @since 2025-05-03
 */
@Mapper
public interface QuestionLibMapper extends BaseMapper<QuestionLib> {

}
