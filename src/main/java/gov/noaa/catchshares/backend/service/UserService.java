package gov.noaa.catchshares.backend.service;

import gov.noaa.catchshares.backend.domain.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}