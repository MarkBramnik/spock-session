package ex7spockextensions

import spock.lang.Narrative
import spock.lang.Specification

// @Title the same as Narrative but only for single line.
// Both are used in spock-reports project
@Narrative("""
    As a developer I want to be sure
    that the array of numbers is of size 10
""")
class SpockExtensionsTest_5_Narrative extends Specification {
    def "ensure that the array is of size 10"() {
        setup:
            def arr = (0..9).collect{it}
        expect:
            arr.size() == 10
    }
}
