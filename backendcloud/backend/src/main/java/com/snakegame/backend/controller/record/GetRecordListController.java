package com.snakegame.backend.controller.record;

import com.alibaba.fastjson.JSONObject;
import com.snakegame.backend.controller.record.service.record.GetRecordListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetRecordListController {

    @Autowired
    private GetRecordListService getRecordListService;

    @GetMapping("/record/getlist/")
    public JSONObject getList(@RequestParam MultiValueMap<String, String> data) {
        Integer page = Integer.parseInt(data.getFirst("page"));
        return getRecordListService.getList(page);
    }
}
