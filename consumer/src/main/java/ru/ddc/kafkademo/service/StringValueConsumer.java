package ru.ddc.kafkademo.service;


import ru.ddc.kafkademo.model.StringValue;

import java.util.List;

public interface StringValueConsumer {

    void accept(List<StringValue> value);
}
