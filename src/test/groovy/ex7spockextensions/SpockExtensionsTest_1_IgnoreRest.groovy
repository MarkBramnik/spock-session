package ex7spockextensions

import spock.lang.IgnoreRest
import spock.lang.Specification

class SpockExtensionsTest_1_IgnoreRest extends Specification{
    def "I'll be ignored"()  {
        setup:
            println "I'll be ignored"
    }

    @IgnoreRest // only this test will run, the rest will be ignored
    def "I'll run"() {
        setup:
            println "I'll be running"
    }

    def "I'll be ignored as well"() {
        setup:
            println "I'll be ignored as well"
    }
}
