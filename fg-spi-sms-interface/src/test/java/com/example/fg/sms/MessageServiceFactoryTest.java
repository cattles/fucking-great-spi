package com.example.fg.sms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MessageServiceFactoryTest {

    @Test
    void sendMessage() {
        MessageServiceFactory factory = new MessageServiceFactory();
        factory.sendMessage("hello spi");
    }
}