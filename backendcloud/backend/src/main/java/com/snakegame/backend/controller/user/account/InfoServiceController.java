package com.snakegame.backend.controller.user.account;

import com.snakegame.backend.controller.record.service.user.account.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class InfoServiceController {
    @Autowired
    private InfoService infoService;

    @GetMapping("/user/account/getinfo/")
    public Map<String, String> getinfo() {
        return infoService.getinfo();
    }
}
