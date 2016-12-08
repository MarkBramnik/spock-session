package ex4lifecycle

import spock.lang.Shared
import spock.lang.Specification

class Lifecycle_Test_1_State extends Specification {
    def counter = 0

    // Note, unlike in JUnit, no statics here
    @Shared def sharedCounter = 0

    def "test counter addition"() {
        expect: "modify the data field"
           ++counter == 1

        and: "modify the shared data field" // just a syntactic sugar for better expressiveness
           ++sharedCounter == 1
    }

    def "test another counter addition"() {
        expect: "data fields get initialized between tests. @Shared fields won't be initialized twice"
        ++counter == 1

        and: "shared data fields are 'shared' between tests"
        ++sharedCounter == 2
    }
}
