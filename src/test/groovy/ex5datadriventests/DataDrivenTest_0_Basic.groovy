package ex5datadriventests

import spock.lang.Specification

class DataDrivenTest_0_Basic extends Specification {
    def "computing maximum of two numbers"() {
        expect:
            Math.max(a,b) == c
        where:
            a << [5, 3]
            b << [1, 9]
            c << [5, 9]
    }
}
