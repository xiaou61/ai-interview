package com.xiaou.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 数字人面试官表
 * </p>
 *
 * @author xiaou
 * @since 2025-05-03
 */
@Data
@TableName("interviewer")
public class Interviewer implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId
    private String id;

    /**
     * 数字人面试官的名称
     */
    private String aiName;

    /**
     * 数字人形象图照片
     */
    private String image;

    private LocalDateTime createTime;

    private LocalDateTime updatedTime;

}
