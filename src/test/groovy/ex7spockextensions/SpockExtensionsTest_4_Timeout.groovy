package ex7spockextensions

import spock.lang.Specification
import spock.lang.Timeout

class SpockExtensionsTest_4_Timeout extends Specification {
    @Timeout(5)
    def "fail this after 5 seconds"() {
        setup:
            println "start the test ${new Date()}"
        when:
            Thread.sleep 3000 // TODO: Change this to 10000 and see what happens
        then:
            println "The test has been sleeping"
        cleanup:
            println "stop  the test ${new Date()}"
    }
}
