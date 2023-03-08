package com.snakegame.backend.controller.record.service.ranklist;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Service;

@Service
public interface GetRankListService {
    JSONObject getList(Integer page);
}
