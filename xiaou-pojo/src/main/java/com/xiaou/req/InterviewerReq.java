package com.xiaou.req;

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

    /**
     * 数字人面试官的名称
     */
    private String aiName;

    /**
     * 数字人形象图照片
     */
    private String image;


}
