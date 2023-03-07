package com.snakegame.matchingsystem.service;

import org.springframework.stereotype.Service;

public interface MatchingService {
    String addPlayer(Integer userId, Integer rating);
    String removePlayer(Integer userId);
}
