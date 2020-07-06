package com.bjtu.mall.dao;

import com.bjtu.mall.model.PmsBrand;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author yinzhiqiang
 * @date 2020/7/5 16:10
 */
@Mapper
public interface PmsBrandDao {
    /**
     * 获取所有的品牌列表
     *
     * @return List<PmsBrand>
     */
    @Select("select * from pms_brand")
    List<PmsBrand> listAllBrand();
}
