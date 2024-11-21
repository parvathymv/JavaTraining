package com.training.junit;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class UserServiceTest {
    @Test
    void testNotifyUser() {
        EmailService mockEmailService = mock(EmailService.class);
        UserService userService = new UserService(mockEmailService);

        userService.notifyUser("test@example.com");

        verify(mockEmailService).sendEmail("test@example.com", "Welcome!"); // Verify interaction
    }
}
