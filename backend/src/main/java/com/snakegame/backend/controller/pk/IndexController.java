package com.snakegame.backend.controller.pk;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pk/")
public class IndexController {

    // 前后端不分离写法
    @RequestMapping("index/")
    public String index() {
        return "pk/index.html";
    }
}
