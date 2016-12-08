package ex1basics

import spock.lang.Specification

/**
 * Created by bramnik on 30/12/2015.
 */
class BasicSpockTest_1_GivenExpectFlow extends Specification {


    def "sample test example 1 - introducing basic flow"() {

        given:
            int i1 = 5
            int i2 = 10

        expect:
            i1 + i2 == 15
    }


}
