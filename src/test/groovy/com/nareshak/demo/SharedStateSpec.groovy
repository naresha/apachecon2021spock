package com.nareshak.demo

import spock.lang.Shared
import spock.lang.Specification

class SharedStateSpec extends Specification{

    @Shared
    private StateHolder stateHolder

    void setupSpec() {
        stateHolder = new StateHolder()
    }

    void "spec 1"() {
        println stateHolder
        expect:
        true
    }

    void "spec 2"() {
        println stateHolder
        expect:
        true
    }
}
