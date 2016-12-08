package ex1basics

import spock.lang.Specification

class BasicSpockTest_5_FailingAssertions extends Specification {

    def "show failing assertions"() {
        given:
            def arr = [1,2,3] // TODO: change something in array and see how it fails :)

        expect: "the sum of array must be 6"
            arr.sum() ==  1 + 2 + 3
    }

}
