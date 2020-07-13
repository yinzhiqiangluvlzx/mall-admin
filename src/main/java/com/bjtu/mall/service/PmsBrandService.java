package com.bjtu.mall.service;

import com.bjtu.mall.model.PmsBrand;

import java.util.List;

/**
 * @author yinzhiqiang
 * @date 2020/7/4 10:38
 */
public interface PmsBrandService {
    /**
     * 获取所有的品牌列表
     *
     * @return List<PmsBrand>
     */
    List<PmsBrand> listAllBrand();

    /**
     * 根据ID查询指定品牌
     *
     * @param id 待查询品牌
     * @return PmsBrand
     */
    PmsBrand getBrand(Long id);

    /**
     * 分页查询品牌列表
     *
     * @param pageNum  页码
     * @param pageSize 每页多少条数据
     * @return List<PmsBrand>
     */
    List<PmsBrand> listBrand(int pageNum, int pageSize);

    /**
     * 删除指定ID品牌
     *
     * @param id 待删除品牌ID
     * @return int 成功返回1，失败返回0
     */
    int deleteBrand(Long id);

    /**
     * 更新指定ID品牌
     *
     * @param id    待更新品牌ID
     * @param brand 待更新品牌
     * @return int 成功返回1，失败返回0
     */
    int updateBrand(Long id, PmsBrand brand);

    /**
     * 添加品牌
     *
     * @param brand 待创建的品牌
     * @return int 成功返回1，失败返回0
     */
    int createBrand(PmsBrand brand);
}
