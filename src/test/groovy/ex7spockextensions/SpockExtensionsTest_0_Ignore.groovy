package ex7spockextensions

import spock.lang.Ignore
import spock.lang.Specification


class SpockExtensionsTest_0_Ignore extends Specification {
    def "I'll run"() {
        setup:
            println "running"
    }

    @Ignore
    def "I'll be ignored"() {
        setup:
            println "ignored"
    }
}
