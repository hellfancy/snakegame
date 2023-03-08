package com.snakegame.backend.controller.record.service.record;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Service;

@Service
public interface GetRecordListService {
    JSONObject getList(Integer page);
}
