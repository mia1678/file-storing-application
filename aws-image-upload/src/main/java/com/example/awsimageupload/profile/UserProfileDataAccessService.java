package com.example.awsimageupload.profile;

import com.example.awsimageupload.datastore.FakeUserProfileDateStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public class UserProfileDataAccessService {
    private final FakeUserProfileDateStore fakeUserProfileDateStore;

    @Autowired
    public UserProfileDataAccessService(FakeUserProfileDateStore fakeUserProfileDateStore) {
        this.fakeUserProfileDateStore = fakeUserProfileDateStore;
    }

    List<UserProfile> getUserProfiles() {
        return fakeUserProfileDateStore.getUserProfiles();
    }

//    UserProfile getUserProfile(UUID userProfileId) {
//        return fakeUserProfileDateStore.getUserProfile();
//    }

}
