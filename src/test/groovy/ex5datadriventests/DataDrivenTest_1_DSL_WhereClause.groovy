package ex5datadriventests

import spock.lang.Specification

class DataDrivenTest_1_DSL_WhereClause extends Specification {
    def "computing maximum of two numbers"() {
        expect:
           Math.max(a,b) == c
        where:
            a   |  b  |    c
            5   |  1  |    5
            3   |  9  |    9
            4   |  4  |    4
    }
}
