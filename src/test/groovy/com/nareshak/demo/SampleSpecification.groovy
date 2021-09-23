package com.nareshak.demo


import spock.lang.Specification

class SampleSpecification extends Specification {

    void "This test should pass if project is setup properly"() {
        expect:
        true
    }

    void "list assertion example"() {
        given:
        List<Integer> numbers = [1, 2, 3]

        when:
        //List<Integer> result = numbers.collect { it * 2}
        List<Integer> result = [2, 2, 6]

        then:
        result == [2, 4, 6]
    }

    void "list contains expected element"() {
        expect:
        10 in [2, 4, 6]
    }

    void "assert all"() {
        expect:
        verifyAll {
            10 in [2, 4, 6]
            12 in [2, 4, 6]
        }
    }

    void "assert with containsAll"() {
        when:
        List<Integer> numbers = [2, 4, 6]

        then:
        numbers.containsAll([10, 12])
    }


    void "assert object by extracting field"() {
        when:
        List<Person> authors = [new Person(firstName: 'James', lastName: 'Gosling'),
                                new Person(firstName: 'Kent', lastName: 'Beck')]

        then:
        authors*.lastName == ['Gosling', 'Beck ']
    }
}
