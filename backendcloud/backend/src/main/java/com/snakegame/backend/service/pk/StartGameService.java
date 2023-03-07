package com.snakegame.backend.service.pk;

import org.springframework.stereotype.Service;

@Service
public interface StartGameService {
    String startGame(Integer aId, Integer bId);
}
