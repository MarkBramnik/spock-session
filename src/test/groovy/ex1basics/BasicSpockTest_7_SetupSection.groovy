package ex1basics

import spock.lang.Specification

class BasicSpockTest_7_SetupSection extends Specification {

    def "sometimes setup section is more expressive than given"() {

        setup: "setup database connection"
           int connection = 0

        expect: "connection established"
           connection == 0

    }

}
