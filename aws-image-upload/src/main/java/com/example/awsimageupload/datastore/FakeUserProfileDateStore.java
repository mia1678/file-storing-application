package com.example.awsimageupload.datastore;

import com.example.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class FakeUserProfileDateStore {
    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();
    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("44ddb736-8eaa-4e1d-9d9d-4c6196f848e6"), "miali", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("12145e01-934d-48ce-b7f2-445a3ca33581"), "miali2", null));
//        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "miali", null));
//        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "miali2", null));
    }

    public static List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }

//    public static Optional<UserProfile> getUserProfile(UUID userProfileId) {
//
//        return Optional.ofNullable(USER_PROFILES.forEach(userProfile -> {
//            if (userProfile.getUserProfileId().equals(userProfileId))
//                return userProfile;
//        }));
//    }


}
