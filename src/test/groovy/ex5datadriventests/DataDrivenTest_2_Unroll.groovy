package ex5datadriventests

import spock.lang.Specification
import spock.lang.Unroll

class DataDrivenTest_2_Unroll extends Specification{

    @Unroll
    def "computing maximum of two numbers"() {
        expect:
           Math.max(a,b) == c
        where:
            a   |  b  |   c
            5   |  1  |   5
            3   |  9  |   9
            4   |  4  |   4    // TODO: Change here 4 to 5 at c column and see why 'unroll' does come handy here
    }
}
