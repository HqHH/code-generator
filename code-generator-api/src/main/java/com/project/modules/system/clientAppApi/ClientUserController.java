package com.project.modules.system.clientAppApi;

import com.alibaba.fastjson.JSONObject;
import com.project.modules.common.dto.output.ApiResult;
import com.project.modules.system.dto.input.CommonObjParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("clientApi/user")
public class ClientUserController {

    @RequestMapping("/login")
    public ApiResult a(@RequestBody CommonObjParam param){
        HashMap hashMap = JSONObject.parseObject(JSONObject.toJSONString(param.getData()), HashMap.class);

        return ApiResult.ok(200, "获取当前登录用户信息成功", hashMap);
    }
}
