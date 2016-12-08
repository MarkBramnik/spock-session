package ex1basics

import spock.lang.Specification

class BasicSpockTest_6_CleanupSection extends Specification {

    def "test intentional failure with cleanup method"() {
        given:
            int x = 5
        expect:
            x == 4 + 1 // TODO: Change something here to fail and ensure that cleanup is called
        cleanup: // this is the place to clean resources per test even the test fails
            println "cleaning up in any case"

    }

}
