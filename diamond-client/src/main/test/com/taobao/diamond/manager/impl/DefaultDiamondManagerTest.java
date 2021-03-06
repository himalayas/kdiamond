package com.taobao.diamond.manager.impl;

import com.taobao.diamond.manager.DiamondManager;
import com.taobao.diamond.manager.ManagerListener;
import org.junit.Test;

import java.util.concurrent.Executor;

public class DefaultDiamondManagerTest {

    @Test
    public void testGetConfigureInfomation() throws Exception {
        DiamondManager manager = new DefaultDiamondManager("testg", "test-1", new ManagerListener() {
            @Override
            public Executor getExecutor() {
                return null;
            }

            public void receiveConfigInfo(String configInfo) {
                System.out.println(configInfo);
            }

        });
    }
}