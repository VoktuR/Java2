package auth;

import java.util.Optional;
import entity.User;

public interface AuthenticationService {
    Optional<User> doAuth(String login, String password);
}
