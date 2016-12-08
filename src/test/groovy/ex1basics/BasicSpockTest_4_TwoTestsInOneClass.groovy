package ex1basics

import spock.lang.Specification

class BasicSpockTest_4_TwoTestsInOneClass extends Specification {
    def "sample test example 4.1 - the first method" () {

        given:
            int i1 = 2
            int i2 = 10

        expect:
            i1 + i2 == 12

    }

    def "sample test example 4.2 - the second method" () {

        given:
            int i1 = 5
            int i2 = 3

        expect:
            i1 + i2 == 8
    }
}
