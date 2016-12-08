package ex2old

import samples.Counter
import spock.lang.Specification

class ShowOldFeatureTest_0 extends Specification{
    def "check the 'increase' method of the Counter"() {

        // Note, the Counter is a java class
        given:
            Counter counter = new Counter()

        when:
            counter.increase()

        then: "old contains a reference to the object before then when clause has been applied"
            counter.getValue() == old(counter.getValue()) + 1

    }
}
