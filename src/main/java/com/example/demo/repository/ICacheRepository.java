package com.example.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import redis.clients.jedis.JedisPooled;
import com.example.demo.services.RedisDetailsConfig;

public interface ICacheRepository {

    void createCacheEntity(String key, String value);

    String getCacheEntity(String key);

    void updateCacheEntity(String key, String value);

    Boolean isKeyExist(String key);

    void removeKey(String key);

}