package org.example;

public class ProfileService {
    private UserService userService = new UserService();

    public void loadUserProfile(String userId) {
        System.out.println("Loading profile for user: " + userId);
        // 🚨 NullPointerException if userId is null
        String profile = userService.getUserProfile(userId);
        System.out.println("Profile loaded: " + profile);
    }
}