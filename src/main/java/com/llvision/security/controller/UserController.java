package com.llvision.security.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangwt on 2019/1/12.
 */
@RestController("/admin/user")
public class UserController {

    /**
     * 用户管理
     * @return
     */
    @RequestMapping("/list")
    @ResponseBody
    public String list(){
        return "user_list";
    }
}
