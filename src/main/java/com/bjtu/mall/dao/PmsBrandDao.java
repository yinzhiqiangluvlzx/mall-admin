package com.bjtu.mall.dao;

import com.bjtu.mall.model.PmsBrand;
import org.apache.ibatis.annotations.*;

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

    /**
     * 获取指定id的品牌
     *
     * @param id 待查询品牌ID
     * @return PmsBrand
     */
    @Select("select * from pms_brand  where id= #{id}")
    PmsBrand getPointBrand(Long id);

    /**
     * 删除指定id的品牌
     *
     * @param id 待删除品牌ID
     * @return int
     */
    @Delete("delete from pms_brand where id = #{id}")
    int deletePointBrand(Long id);

    /**
     * 更新指定id的品牌
     *
     * @param
     * @param brand 待更新品牌
     * @return int
     */
    int updatePointBrand(PmsBrand brand);

    /**
     * 保存新增品牌
     *
     * @param brand 待保存品牌
     * @return int
     */
    @Insert("insert into pms_brand(id,name,first_letter,sort,factory_status,show_status,product_count,product_comment_count,logo,big_pic,brand_story)values(#{id},#{name},#{firstLetter},#{sort},#{factoryStatus},#{showStatus},#{productCount},#{productCommentCount},#{logo},#{bigPic},#{brandStory})")
    int saveBrand(PmsBrand brand);
}
