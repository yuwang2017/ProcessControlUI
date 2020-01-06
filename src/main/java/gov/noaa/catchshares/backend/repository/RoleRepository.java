package gov.noaa.catchshares.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import gov.noaa.catchshares.backend.domain.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}