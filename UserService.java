package com.training.junit;

public class UserService {
    private EmailService emailService;

    public UserService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void notifyUser(String email) {
        emailService.sendEmail(email, "Welcome!");
    }
}

interface EmailService {
    void sendEmail(String email, String message);
}
