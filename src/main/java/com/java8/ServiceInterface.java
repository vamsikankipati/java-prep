package com.java8;

import com.pojo.Task;

public interface ServiceInterface {
    void toDo(Task task);

    default void defaultMethod() {

    }
}
