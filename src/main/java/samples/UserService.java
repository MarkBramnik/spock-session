package samples;

public class UserService {

    private UserRepository userRepo;

    public UserService(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    public String login(String name) {
        if(userRepo.hasUser(name)) {
            return "Welcome, " + name;
        }
        else {
            return "Unauthorized, " + name;
        }
    }
}
