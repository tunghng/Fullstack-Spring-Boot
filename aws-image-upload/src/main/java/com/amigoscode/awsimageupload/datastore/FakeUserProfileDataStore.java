package com.amigoscode.awsimageupload.datastore;

import com.amigoscode.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {
    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();
    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("d7202f36-a69c-47ad-8820-977ae9cef599"), "janetjones", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("94951c2a-ff92-41ad-b703-934003961186"), "antoniojunior", null));
    }
    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}
