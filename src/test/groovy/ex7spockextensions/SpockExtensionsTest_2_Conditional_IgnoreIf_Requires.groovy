package ex7spockextensions

import spock.lang.IgnoreIf
import spock.lang.Requires
import spock.lang.Specification

class SpockExtensionsTest_2_Conditional_IgnoreIf_Requires extends Specification {
    @IgnoreIf({os.windows})
    def "run me anywhere but on windows" () {
        setup:
            println "You won't see this on windows machines"
    }

    @Requires({os.windows})
    def "this test will run only on windows"() {
        setup:
            println "This runs only on windows"

    }
}
