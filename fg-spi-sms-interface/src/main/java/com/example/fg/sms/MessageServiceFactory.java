package com.example.fg.sms;

import java.util.ServiceLoader;

/**
 * @author cattle -  稻草鸟人
 * @date 2020/4/23 下午12:52
 */
public class MessageServiceFactory {

    private ServiceLoader<MessageServiceProvider> serviceProviders = ServiceLoader.load(MessageServiceProvider.class);

    public void sendMessage(String message) {

        for (MessageServiceProvider serviceProvider : serviceProviders) {
            serviceProvider.sendMessage(message);
        }

    }
}
