package com.org.practice.java8;

import com.org.practice.pojo.Task;

public interface ServiceInterface {
    void toDo(Task task);

    default void defaultMethod() {

    }
}
