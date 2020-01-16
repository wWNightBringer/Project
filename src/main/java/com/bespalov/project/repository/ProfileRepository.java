package com.bespalov.project.repository;

import com.bespalov.project.domain.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long> {

    Optional<Profile> findByFirstName(String firstName);

    Optional<Profile> findByUserLogin(String login);

}
