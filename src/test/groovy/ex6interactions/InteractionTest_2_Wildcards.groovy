package ex6interactions

import samples.UserRepository
import samples.UserService
import spock.lang.Specification


class InteractionTest_2_Wildcards extends Specification {

    def "test user Logged in all users starting with J"() {

        setup:
            UserRepository mockUserRepo = Mock()
            UserService userService = new UserService(mockUserRepo)

        when:
            String helloString1  = userService.login 'John'
            String helloString2  = userService.login 'Jack'
            String helloString3  = userService.login 'George'

        then:
            helloString1  == 'Welcome, John'
            helloString2  == 'Welcome, Jack'
            helloString3  == 'Unauthorized, George'
        // I don't care how many times the hasUser was called, but the name must start with J
        _ * mockUserRepo.hasUser({it ==~ /J.*/})  >> true

        _ * mockUserRepo.hasUser({it ==~ /^J.*/})  >> false
    }
}
