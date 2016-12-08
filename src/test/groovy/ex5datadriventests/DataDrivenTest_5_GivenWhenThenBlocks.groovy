package ex5datadriventests

import samples.Counter
import spock.lang.Specification
import spock.lang.Unroll

class DataDrivenTest_5_GivenWhenThenBlocks extends Specification {

    @Unroll
    def "check counter increase in #a and decrease in #b gives #c"() {
        given:
            Counter counter = new Counter()
        when:
            a.times {
                counter.increase()
            }
            b.times {
              counter.decrease()
            }
        then:
            counter.value == c
        where:
            a | b | c
            5 | 4 | 1
            9 | 6 | 3
            8 | 8 | 0
            7 | 1 | 6

    }
}
