package com.example.fg.sms;

/**
 * @author cattle -  稻草鸟人
 * @date 2020/4/23 下午12:57
 */
public class DefaultMessageServiceProvider implements MessageServiceProvider {
    @Override
    public void sendMessage(String message) {
        System.out.println("default:::" + message);
    }
}
