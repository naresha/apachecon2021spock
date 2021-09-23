package com.nareshak.demo;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class SampleSharedStateTest {

    private static StateHolder stateHolder;

    @BeforeAll
    static void beforeAll() {
        stateHolder = new StateHolder();
    }

    @Test
    void test1() {
        // use shared stateHolder
        System.out.println(stateHolder);
    }

    @Test
    void test2() {
        // use shared stateHodler
        System.out.println(stateHolder);

    }
}
