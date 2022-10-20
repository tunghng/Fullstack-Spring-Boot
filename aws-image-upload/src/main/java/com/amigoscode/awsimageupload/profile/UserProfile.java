package com.amigoscode.awsimageupload.profile;

import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

public class UserProfile {
    private final UUID userprofileId;
    private final String username;
    private String userProfileImageLink;



    public UserProfile(UUID userprofileId, String username, String userProfileImageLink) {
        this.userprofileId = userprofileId;
        this.username = username;
        this.userProfileImageLink = userProfileImageLink;
    }
    public UUID getUserprofileId() {
        return userprofileId;
    }

    public String getUsername() {
        return username;
    }

    public Optional<String> getUserProfileImageLink() {
        return Optional.ofNullable(userProfileImageLink);
    }


    public void setUserProfileImageLink(String userProfileImageLink) {
        this.userProfileImageLink = userProfileImageLink;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserProfile that = (UserProfile) o;
        return Objects.equals(userprofileId, that.userprofileId) &&
                Objects.equals(username, that.username) &&
                Objects.equals(userProfileImageLink, that.userProfileImageLink);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userprofileId, username, userProfileImageLink);
    }
}
