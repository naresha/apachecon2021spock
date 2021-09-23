package com.nareshak.demo

import spock.lang.Specification
import spock.lang.Unroll

class DataDrivenSpec extends Specification {

    @Unroll
    void "#a + #b should be #expectedSum"() {
        when:
        def sum = a + b

        then:
        sum == expectedSum

        where:
        a  | b  | expectedSum
        10 | 10 | 20
        20 | 20 | 40
    }
}
