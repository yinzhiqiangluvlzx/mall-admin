package com.bjtu.mall.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author yinzhiqiang
 * @date 2020/7/4 10:26
 */
@Data
public class PmsBrand implements Serializable {
    private static final long serialVersionUID = -7916306597823538396L;
    private Long id;
    private String name;
    private String firstLetter;
    private Integer sort;
    private Integer factoryStatus;
    private Integer showStatus;
    private Integer productCount;
    private Integer productCommentCount;
    private String logo;
    private String bigPic;
    private String brandStory;

}
