package com.bjtu.mall.controller;

import com.bjtu.mall.common.api.CommonPage;
import com.bjtu.mall.common.api.CommonResult;
import com.bjtu.mall.dto.PmsBrandDto;
import com.bjtu.mall.model.PmsBrand;
import com.bjtu.mall.service.PmsBrandService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * @author yinzhiqiang
 * @date 2020/7/4 10:36
 */
@Api(tags = "PmsBrandController", description = "商品品牌管理")
@RestController
@RequestMapping("/brand")
public class PmsBrandController {
    @Autowired
    private PmsBrandService pmsBrandService;
    private static final Logger logger = LoggerFactory.getLogger(PmsBrandController.class);

    @ApiOperation(value = "获取所有品牌列表")
    @GetMapping(value = "listAll")
    public CommonResult<List<PmsBrand>> getBrandList() {
        return CommonResult.success(pmsBrandService.listAllBrand());
    }

    @ApiOperation(value = "获取指定id品牌")
    @GetMapping(value = "/{id}")
    public CommonResult<PmsBrand> brand(@PathVariable("id") Long id) {
        return CommonResult.success(pmsBrandService.getBrand(id));
    }

    @ApiOperation("分页查询品牌列表")
    @GetMapping(value = "/list")
    @ResponseBody
    public CommonResult<CommonPage<PmsBrand>> listBrand(@RequestParam(value = "pageNum", defaultValue = "1")
                                                        @ApiParam("页码") Integer pageNum,
                                                        @RequestParam(value = "pageSize", defaultValue = "3")
                                                        @ApiParam("每页数量") Integer pageSize) {
        List<PmsBrand> brandList = pmsBrandService.listBrand(pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(brandList));
    }

    @ApiOperation("删除指定id的品牌")
    @GetMapping(value = "/delete/{id}")
    public CommonResult deleteBrand(@PathVariable("id") Long id) {
        int count = pmsBrandService.deleteBrand(id);
        if (count == 1) {
            logger.debug("deleteBrand success :id={}", id);
            return CommonResult.success(null);
        } else {
            logger.debug("deleteBrand failed :id={}", id);
            return CommonResult.failed("操作失败");
        }
    }

    @ApiOperation("更新指定id品牌信息")
    @PostMapping(value = "/update/{id}")
    public CommonResult updateBrand(@PathVariable("id") Long id, @RequestBody PmsBrandDto pmsBrandDto) {
        CommonResult commonResult;
        int count = pmsBrandService.updateBrand(id, pmsBrandDto);
        if (count == 1) {
            commonResult = CommonResult.success(pmsBrandDto);
            logger.debug("updateBrand success:{}", pmsBrandDto);
        } else {
            commonResult = CommonResult.failed("操作失败");
            logger.debug("updateBrand failed:{}", pmsBrandDto);
        }
        return commonResult;
    }


    @ApiOperation("添加品牌")
    @PostMapping(value = "/create")
    public CommonResult createBrand(@RequestBody PmsBrandDto pmsBrandDto) {
        CommonResult commonResult;
        int count = pmsBrandService.createBrand(pmsBrandDto);
        if (count == 1) {
            commonResult = CommonResult.success(pmsBrandDto);
            logger.debug("createBrand success:{}", pmsBrandDto);
        } else {
            commonResult = CommonResult.failed("操作失败");
            logger.debug("createBrand failed:{}", pmsBrandDto);
        }
        return commonResult;
    }
}
