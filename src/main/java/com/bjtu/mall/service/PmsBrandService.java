package com.bjtu.mall.service;

import com.bjtu.mall.model.PmsBrand;

import java.util.List;

/**
 * 品牌管理类
 *
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
}
