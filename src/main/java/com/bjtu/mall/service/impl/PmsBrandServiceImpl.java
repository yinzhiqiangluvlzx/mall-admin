package com.bjtu.mall.service.impl;

import com.bjtu.mall.dao.PmsBrandDao;
import com.bjtu.mall.model.PmsBrand;
import com.bjtu.mall.service.PmsBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
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
}
