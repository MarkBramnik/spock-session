package ex6interactions

import samples.UserRepository
import samples.UserService
import spock.lang.Specification

class InteractionTest_0_Basic extends Specification{

    def "test user Logged in method"() {
        setup:
            // Mocking by interface, no need for cglib
            UserRepository mockUserRepo = Mock(UserRepository)
            // alternative 1 :
            // def mockUserRepo = Mock(UserRepository)
            // alternative 2 :
            // UserRepository mockUserRepo = Mock()
            UserService userService = new UserService(mockUserRepo)
        when:
            String helloJohnString  = userService.login 'John'
            String helloAliceString = userService.login 'Alice'
        then:
            helloJohnString  == 'Welcome, John'
            helloAliceString == 'Unauthorized, Alice'

            mockUserRepo.hasUser('John')  >> true
            mockUserRepo.hasUser('Alice') >> false
    }
}
