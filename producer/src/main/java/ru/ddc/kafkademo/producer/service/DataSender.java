package ru.ddc.kafkademo.producer.service;


import ru.ddc.kafkademo.producer.model.StringValue;

public interface DataSender {
    void send(StringValue value);
}
