package org.example;



public class App {
    public static void main(String[] args) {
        ProfileService profileService = new ProfileService();
        profileService.loadUserProfile(null); // 💥 Null userId
    }
}
