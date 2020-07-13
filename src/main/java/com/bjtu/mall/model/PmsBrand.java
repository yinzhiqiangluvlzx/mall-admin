package com.bjtu.mall.model;

import io.swagger.annotations.ApiModelProperty;
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
    @ApiModelProperty(value = "名称")
    private String name;
    @ApiModelProperty(value = "首字母")
    private String firstLetter;
    @ApiModelProperty(value = "排序")
    private Integer sort;
    @ApiModelProperty(value = "是否为品牌制造商：0->不是；1->是")
    private Integer factoryStatus;
    @ApiModelProperty(value = "是否显示")
    private Integer showStatus;
    @ApiModelProperty(value = "产品")
    private Integer productCount;
    @ApiModelProperty(value = "产品评论数量")
    private Integer productCommentCount;
    @ApiModelProperty(value = "品牌logo")
    private String logo;
    @ApiModelProperty(value = "专区大图")
    private String bigPic;
    @ApiModelProperty(value = "品牌故事")
    private String brandStory;
}
