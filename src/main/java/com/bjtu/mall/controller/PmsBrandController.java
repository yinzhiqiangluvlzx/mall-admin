package com.bjtu.mall.controller;

import com.bjtu.mall.common.api.CommonResult;
import com.bjtu.mall.model.PmsBrand;
import com.bjtu.mall.service.PmsBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author yinzhiqiang
 * @date 2020/7/4 10:36
 */
@RestController
@RequestMapping("/brand")
public class PmsBrandController {
    @Autowired
    private PmsBrandService pmsBrandService;

    @GetMapping("listAll")
    public CommonResult<List<PmsBrand>> getBrandList() {
        return CommonResult.success(pmsBrandService.listAllBrand());
    }

}
