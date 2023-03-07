package com.snakegame.backend.service.impl.pk;

import com.snakegame.backend.consumer.WebSocketServer;
import com.snakegame.backend.service.pk.StartGameService;
import org.springframework.stereotype.Service;

import java.sql.SQLOutput;

@Service
public class StartGameServiceImpl implements StartGameService {
    @Override
    public String startGame(Integer aId, Integer bId) {
        System.out.println("start game: " + aId + " " + bId);
        WebSocketServer.startGame(aId, bId);
        return "start game success";
    }
}
