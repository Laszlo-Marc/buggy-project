package org.example;

public class UserService {
    public String getUserProfile(String userId) {
        // 🚨 Missing null check
        if (userId.isEmpty()) {
            throw new IllegalArgumentException("User ID cannot be empty");
        }
        // Simulate fetching user profile
        return "Profile data for user " + userId;
    }
}