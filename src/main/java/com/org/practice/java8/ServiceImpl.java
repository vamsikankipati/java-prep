package com.org.practice.java8;

import com.org.practice.pojo.Task;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements ServiceInterface {
    @Override
    public void toDo(Task task) {
        // implementation
    }

    // default methods need not be implemented
}
