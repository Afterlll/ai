package com.jxy.manager;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author wangkeyao
 */
@SpringBootTest
class AiManagerTest {

    @Resource
    private AiManager aiManager;

    @Test
    void doRequest() {
        System.out.println(aiManager.doSyncUnStableRequest("使用系统默认", "作为一名营销专家，请为智谱开放平台创作一个吸引人的slogan"));
    }
}