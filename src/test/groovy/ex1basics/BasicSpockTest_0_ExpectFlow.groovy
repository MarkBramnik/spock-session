package ex1basics

import spock.lang.Specification

class BasicSpockTest_0_ExpectFlow extends Specification {

    def "check Math.max method and show 'expect' style"() {

        expect:

            Math.max(30,40) == 40

    }

}
