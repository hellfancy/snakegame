package com.snakegame.backend.consumer.utils;

import com.snakegame.backend.utils.JwtUtil;
import io.jsonwebtoken.Claims;

public class JwtAuthentication {
    public static Integer getUserId(String token) {
        Integer userid = -1; // 表示不存在
        try {
            Claims claims = JwtUtil.parseJWT(token);
            userid = Integer.parseInt(claims.getSubject());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return userid;
    }
}
