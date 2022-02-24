package az.developia.springboot.service.impl;

import az.developia.springboot.model.User;
import az.developia.springboot.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceMock implements UserService {
    @Override
    public User getUserById(long id) {
        return new User(id,"Tom","tom@email.com");
    }
}
