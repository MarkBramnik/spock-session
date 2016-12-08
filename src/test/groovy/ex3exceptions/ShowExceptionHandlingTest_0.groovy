package ex3exceptions

import samples.Counter
import spock.lang.Specification


class ShowExceptionHandlingTest_0 extends Specification {

    def "show exception handling"() {
        given:
            Counter counter = new Counter()

        when:
            counter.increase()
            counter.decrease()
            counter.decrease()

        then:
            thrown(IllegalStateException)
            counter.value == 0
    }

    def "show exception handling with message"() {
        given:
            Counter counter = new Counter()

        when:
            counter.decrease()

        then: "More readable syntax, like: 'an IllegalStateException is thrown'"
            IllegalStateException e = thrown()
            e.message == 'Value cannot be negative' // this cannot be easily done in JUnit

            counter.value == 0
    }

    def "check that IllegalStateException is not thrown"() {
        given:
            Counter counter = new Counter()

        when:
            counter.increase()

        then:
            notThrown(IllegalStateException)
    }

    def "check that no exception is thrown at all"() {
        given:
            Counter counter = new Counter()

        when:
            counter.increase()

        then:
            noExceptionThrown()

    }
}
