package com.xiaou.req;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class InterviewerReq {

    private String id;

    @NotBlank(message = "面试官名称不能为空")
    /**
     * 数字人面试官的名称
     */
    private String aiName;

    @NotBlank(message = "图片不能为空")
    /**
     * 数字人形象图照片
     */
    private String image;


}
