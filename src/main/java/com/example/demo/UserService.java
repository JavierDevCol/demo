package com.example.demo;

public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean isUserValid(String userId) {
        User user = userRepository.findUserById(userId);
        return user != null && ValidationUtils.isNotNullOrEmpty(user.getName());
    }
}
