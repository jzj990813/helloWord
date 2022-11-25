package com.jian.utils.Controller;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jianzhongjun
 */
@RestController
@RequestMapping("/redis")
public class UtilsController {

    private final RedisTemplate redisTemplate;

    public UtilsController(RedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    @RequestMapping("/save")
    public void save(String key, String value) {
        redisTemplate.opsForValue().set("now", "20221123");
        System.out.println(redisTemplate.opsForValue().get("now"));
    }
}
