package ex7spockextensions

import spock.lang.Issue
import spock.lang.Specification

@Issue("http://myissuetracker/BUG-001")
class SpockExtensionsTest_6_Issue extends Specification{
    def "check that bug-001 was fixed"() {
        setup:
            println 'bug-001 fixed'
    }
}
