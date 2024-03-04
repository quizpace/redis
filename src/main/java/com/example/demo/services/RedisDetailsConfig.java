package com.example.demo.services;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.ConstructorBinding;

//@ConstructorBinding
@ConfigurationProperties("redis")
public class RedisDetailsConfig {
    public String getHost() {
        return host;
    }

    public int getPort() {
        return port;
    }

    public long getTtl() {
        return ttl;
    }

    protected String host;

    protected int port;

    protected long ttl;

    public RedisDetailsConfig(String host, int port, long ttl) {
        this.host = host;
        this.port = port;
        this.ttl = ttl;
    }
}
