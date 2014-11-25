package com.taobao.diamond.manager.impl;

import com.taobao.diamond.client.DiamondConfigure;
import com.taobao.diamond.manager.DiamondManager;
import com.taobao.diamond.manager.ManagerListener;
import org.junit.Test;

import java.util.concurrent.Executor;

import static org.junit.Assert.*;

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
        DiamondConfigure diamondConfigure=new DiamondConfigure();
//        manager.setDiamondConfigure(diamondConfigure);
        System.out.println(manager.getDiamondConfigure().getDomainNameList().get(0));
        System.out.println(manager.getDiamondConfigure().getFilePath());
        System.out.println(manager.getDiamondConfigure().getConfigServerPort());
        System.out.println(manager.getAvailableConfigureInfomation(10));
    }
}