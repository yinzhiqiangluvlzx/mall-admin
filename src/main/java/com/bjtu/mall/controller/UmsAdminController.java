package com.bjtu.mall.controller;

import com.bjtu.mall.common.api.CommonResult;
import com.bjtu.mall.dto.UmsAdminLoginParam;
import com.bjtu.mall.model.UmsAdmin;
import com.bjtu.mall.model.UmsPermission;
import com.bjtu.mall.service.UmsAdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author yinzhiqiang
 * @date 2020/7/19 17:26
 */
@Api(tags = "UmsAdminController", description = "后台用户管理")
@RequestMapping("/admin")
@RestController
public class UmsAdminController {
    @Autowired
    private UmsAdminService umsAdminService;
    @Value("${jwt.tokenHeader}")
    private String tokenHeader;
    @Value("${jwt.tokenHead}")
    private String tokenHead;
    private static final Logger logger = LoggerFactory.getLogger(UmsAdminController.class);

    @ApiOperation(value = "用户注册")
    @PostMapping(value = "/register")
    public CommonResult<UmsAdmin> register(@RequestBody UmsAdmin umsAdminParam) {
        UmsAdmin umsAdmin = umsAdminService.register(umsAdminParam);
        if (umsAdmin == null) {
            logger.debug("register failed :{}", umsAdminParam);
            return CommonResult.failed("注册失败！");
        }
        return CommonResult.success(umsAdmin);
    }

    @ApiOperation(value = "登录以后返回token")
    @PostMapping(value = "/login")
    public CommonResult login(@RequestBody UmsAdminLoginParam umsAdminLoginParam) {
        String token = umsAdminService.login(umsAdminLoginParam.getUsername(), umsAdminLoginParam.getPassword());
        if (token == null) {
            return CommonResult.validateFailed("用户名或密码错误");
        }
        Map<String, String> tokenMap = new HashMap<>();
        tokenMap.put("token", token);
        tokenMap.put("tokenHead", tokenHead);
        return CommonResult.success(tokenMap);
    }

    @ApiOperation("获取用户所有权限（包括+-权限）")
    @GetMapping(value = "/permission/{adminId}")
    public CommonResult<List<UmsPermission>> getPermissionList(@PathVariable Long adminId) {
        List<UmsPermission> permissionList = umsAdminService.getPermissionList(adminId);
        return CommonResult.success(permissionList);
    }

}
