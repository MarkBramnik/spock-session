package ex7spockextensions

import spock.lang.Specification
import spock.lang.Stepwise

@Stepwise
class SpockExtensionsTest_3_Stepwise extends Specification {
    def "I'll always run first"() {
        setup:
            println 'first'
    }
    def "I'll always run second"() {
        setup:
            println 'second'
    }
}
