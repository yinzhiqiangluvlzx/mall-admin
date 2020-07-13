package com.bjtu.mall.service.impl;

import com.bjtu.mall.dao.PmsBrandDao;
import com.bjtu.mall.model.PmsBrand;
import com.bjtu.mall.service.PmsBrandService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * PmsBrandService实现类
 *
 * @author yinzhiqiang
 * @date 2020/7/5 16:07
 */
@Service
public class PmsBrandServiceImpl implements PmsBrandService {
    @Autowired
    private PmsBrandDao pmsBrandDao;

    @Override
    public List<PmsBrand> listAllBrand() {
        return pmsBrandDao.listAllBrand();
    }

    @Override
    public PmsBrand getBrand(Long id) {
        return pmsBrandDao.getPointBrand(id);
    }

    @Override
    public List<PmsBrand> listBrand(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return pmsBrandDao.listAllBrand();
    }

    @Override
    public int deleteBrand(Long id) {
        return pmsBrandDao.deletePointBrand(id);
    }

    @Override
    public int updateBrand(Long id, PmsBrand brand) {
        brand.setId(id);
        return pmsBrandDao.updatePointBrand(brand);
    }

    @Override
    public int createBrand(PmsBrand brand) {
        return pmsBrandDao.saveBrand(brand);
    }
}
