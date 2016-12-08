package ex1basics

import spock.lang.Specification

class BasicSpockTest_2_GivenWhenThenFlow extends Specification {
    def "sample test example 2 - introducing basic given-when-then flow"() {

        given:
            int i1 = 10
            int i2 = 20

        when:
            int observedSum        = i1 + i2
            int observedProduction = i1 * i2

        then:
            observedSum == 30
            observedProduction == 200
    }
}
