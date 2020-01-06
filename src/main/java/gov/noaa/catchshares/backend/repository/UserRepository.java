package gov.noaa.catchshares.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import gov.noaa.catchshares.backend.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}