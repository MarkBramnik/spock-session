package ex6interactions

import samples.UserRepository
import samples.UserService
import spock.lang.Specification


class InteractionTest_1_ManyLoginAttempts extends Specification{
    def "test user Logged in method"() {

        setup:
            UserRepository mockUserRepo = Mock()
            UserService userService = new UserService(mockUserRepo)

        when:
            String helloJohnString1  = userService.login 'John'
            String helloJohnString2  = userService.login 'John'
            String helloJohnString3  = userService.login 'John'

        then:
            helloJohnString1  == 'Welcome, John'
            helloJohnString2  == 'Welcome, John'
            helloJohnString3  == 'Unauthorized, John'

            2 * mockUserRepo.hasUser('John')  >> true
            1 * mockUserRepo.hasUser('John')  >> false
    }
}
