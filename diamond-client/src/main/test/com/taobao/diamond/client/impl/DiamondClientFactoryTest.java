package com.taobao.diamond.client.impl;

import com.taobao.diamond.client.DiamondConfigure;
import com.taobao.diamond.client.DiamondSubscriber;
import com.taobao.diamond.client.SubscriberListener;
import junit.framework.Assert;
import org.junit.Test;

import java.util.concurrent.Executor;

import static org.junit.Assert.*;

public class DiamondClientFactoryTest {

    @Test
    public void testGetSingletonDiamondSubscriber() throws Exception {
        DiamondSubscriber ds=DiamondClientFactory.getSingletonDiamondSubscriber();
        DiamondConfigure diamondConfigure=new DiamondConfigure();
        diamondConfigure.setConfigServerAddress("192.168.3.203");

        diamondConfigure.setConfigServerPort(8080);
        ds.addDataId("test-1", "testg");
        ds.setDiamondConfigure(diamondConfigure);
        SubscriberListener sl= ds.getSubscriberListener();
        Executor executor=sl.getExecutor();
        Assert.assertNotNull(ds);
    }
}