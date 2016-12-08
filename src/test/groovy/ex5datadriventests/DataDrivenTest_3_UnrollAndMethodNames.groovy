package ex5datadriventests

import spock.lang.Specification
import spock.lang.Unroll

class DataDrivenTest_3_UnrollAndMethodNames extends Specification {

    // Method name with variables from 'where' part work only for data driven tests annotated with @Unroll
    @Unroll
    def "computing maximum of two numbers: max. of #a and #b should give #c"() {

        expect:
            Math.max(a,b) == c
        where:
            a   |  b  |  c
            5   |  1  |  5
            3   |  9  |  9
            4   |  4  |  4
    }

}
