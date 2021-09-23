package com.nareshak.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SampleTest {
    private StateHolder stateHolder = new StateHolder();

    @BeforeEach
    private void setup() {
        stateHolder = new StateHolder();
    }

    @Test
    void test1() {
        // use stateHolder
    }

    @Test
    void test2() {
        // use stateHodler
    }
}
