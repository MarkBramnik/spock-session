package ex4lifecycle

import spock.lang.Specification

/**
 * Created by bramnik on 30/12/2015.
 */
class Lifecycle_Test_0_FixtureMethods extends Specification {
    def setupSpec() {
        println 'called once per specification before startup'
    }
    def cleanupSpec() {
        println 'called once per specification after teardown'
    }
    def setup() {
        println 'setting up the environment'
    }
    def cleanup() {
        println 'cleaning up the environment'
    }

    def "test 1"() {
        given:
            println "test 1"
        expect:
            2 == 1 + 1
    }

    def "test 2"() {
        given:
            println "test 2"
        expect:
            0 == 4 - 5 + 1
    }
}
