package com.example.awsimageupload.datastore;

import com.example.awsimageupload.profile.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository("postgres")
public class UserProfileDataStore {

    @Autowired
    private final JdbcTemplate jdbcTemplate;

    public UserProfileDataStore(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<UserProfile> getUserNames() {
        final String sql = "SELECT * FROM user";
        List<UserProfile> user = jdbcTemplate.query(sql, ((resultSet, i) -> {
            return new UserProfile(
                    UUID.fromString(resultSet.getString("id")),
                    resultSet.getString("name"),
                    resultSet.getString("link")
            );
        }));
        return user;
//        return jdbcTemplate.query(sql);
    }

    public static List<UserProfile> getUserProfiles() {
        final String sql = "SELECT * FROM user";
        return;
    }


}
