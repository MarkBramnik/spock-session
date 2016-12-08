package ex5datadriventests

import spock.lang.Specification
import spock.lang.Unroll


class DataDrivenTest_4_DataFromGenerator extends Specification {
    @Unroll
    def "computing maximum of two numbers: max. of #a and #b should give #c"() {

        expect:
           Math.max(a,b) == c

        where:
           [a,b,c] << generator()
    }

    def generator() { // List of lists of values
        [
          [5,1,5],
          [3,9,9],
          [4,4,4]
        ]
    }
}
