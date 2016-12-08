package ex1basics

import spock.lang.Specification

class BasicSpockTest_3_LabelsInGivenWhenThenFlow extends Specification {

    def "sample test example 3 - show labels in given-when-then flow"() {

        given: "two arbitrary numbers 10 and 20"
            int i1 = 10
            int i2 = 20

        when:  "calculating a sum and production of two numbers"
            int observedSum        = i1 + i2
            int observedProduction = i1 * i2

        then:  "checking the sum and production of two numbers"
            observedSum == 30
            observedProduction == 200
    }
}
