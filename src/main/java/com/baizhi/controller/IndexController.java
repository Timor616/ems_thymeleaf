package com.baizhi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author: timor
 * @date: 2020/7/16 16:16
 */
@Controller
public class IndexController {

    @GetMapping("/index")
    public String toIndex() {
        return "ems/login";
    }

    @GetMapping("/toRegister")
    public String toRegister() {
        return "/ems/regist";
    }
}
