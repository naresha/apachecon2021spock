package com.nareshak.demo

import spock.lang.Specification
import spock.lang.Stepwise

@Stepwise
class OrderedSpecification extends Specification {

    void "test 1"() {
        expect:
        true
    }

    void "test 2"() {
        expect:
        false
    }

    void "test 3"() {
        expect:
        true
    }

}
