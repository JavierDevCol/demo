package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

public class UserServiceTest {
    private UserRepository userRepository;
    private UserService userService;

    @BeforeEach
    public void setUp() {
        userRepository = mock(UserRepository.class);
        userService = new UserService(userRepository);
    }

    @Test
    public void givenExistingUser_whenIsUserValid_thenTrue() {
        User user = new User("1", "John Doe");
        when(userRepository.findUserById("1")).thenReturn(user);

        assertTrue(userService.isUserValid("1"));
        verify(userRepository, times(1)).findUserById("1");
    }

    @Test
    public void givenNonExistingUser_whenIsUserValid_thenFalse() {
        when(userRepository.findUserById("1")).thenReturn(null);

        assertFalse(userService.isUserValid("1"));
        verify(userRepository, times(1)).findUserById("1");
    }

    @Test
    public void givenUserWithEmptyName_whenIsUserValid_thenFalse() {
        User user = new User("1", "");
        when(userRepository.findUserById("1")).thenReturn(user);

        assertFalse(userService.isUserValid("1"));
        verify(userRepository, times(1)).findUserById("1");
    }

    @Test
    public void givenUserWithNullName_whenIsUserValid_thenFalse() {
        User user = new User("1", null);
        when(userRepository.findUserById("1")).thenReturn(user);

        assertFalse(userService.isUserValid("1"));
        verify(userRepository, times(1)).findUserById("1");
    }
}
