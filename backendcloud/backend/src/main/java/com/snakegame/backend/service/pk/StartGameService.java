package com.snakegame.backend.controller.record.service.pk;

import org.springframework.stereotype.Service;

@Service
public interface StartGameService {
    String startGame(Integer aId, Integer aBotId, Integer bId, Integer bBotId);
}
