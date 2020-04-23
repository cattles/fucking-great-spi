package com.example.fg.sms;

/**
 * @author cattle -  稻草鸟人
 * @date 2020/4/23 下午12:49
 */
public interface MessageServiceProvider {

    /**
     *  发送短息
     * @param message 短信内容
     */
    void sendMessage(String message);

}
