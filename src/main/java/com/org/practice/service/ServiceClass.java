package com.org.practice.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ServiceClass {

    @Transactional
    public void transactionalMethod() {
        // Database Operation
    }
}
