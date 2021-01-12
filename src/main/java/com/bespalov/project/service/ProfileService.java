package com.bespalov.project.service;

import com.bespalov.project.domain.Profile;
import com.bespalov.project.dto.ProfileDTO;
import com.bespalov.project.mapper.impl.ProfileMapperImpl;
import com.bespalov.project.repository.ProfileRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ProfileService {
    private Logger log = LoggerFactory.getLogger(ProfileService.class);
    private final ProfileRepository profileRepository;

    private final ProfileMapperImpl profileMapper;

    public ProfileService(ProfileRepository profileRepository, ProfileMapperImpl profileMapper) {
        this.profileRepository = profileRepository;
        this.profileMapper = profileMapper;
    }

    @Transactional
    public ProfileDTO save(ProfileDTO profileDTO) {
        Profile profile = profileMapper.toEntity(profileDTO);
        profile = profileRepository.save(profile);
        ProfileDTO result = profileMapper.toDto(profile);
        return result;
    }

    public void addControlQuestion(String question, String answer, String login) {
        Profile profile = findByUserLogin(login);
        profile.setControlQuestionValue(question);
        profile.setControlQuestionAnswer(answer);
        profileRepository.save(profile);
    }

    /**
     * Save a profile.
     *
     * @return the persisted entity.
     */
    @Transactional
    public void save(Profile profile) {
        log.debug("Request to save Profile : {}", profile);
        profile = profileRepository.save(profile);
    }

    @Transactional(readOnly = true)
    public Page<ProfileDTO> findAll(Pageable pageable) {
        log.debug("Request to get all Profiles");
        return profileRepository.findAll(pageable)
                .map(profileMapper::toDto);
    }

    @Transactional(readOnly = true)
    public Optional<ProfileDTO> findOne(Long id) {
        log.debug("Request to get Profile : {}", id);
        return profileRepository.findById(id)
                .map(profileMapper::toDto);
    }


    @Transactional(readOnly = true)
    public Profile getProfile(Long id) {
        log.debug("Request to get Profile : {}", id);
        Optional<Profile> profile = profileRepository.findById(id);
        return profile.orElseGet(null);
    }

    public void delete(Long id) {
        log.debug("Request to delete Profile : {}", id);
        profileRepository.deleteById(id);
    }

    @Transactional(readOnly = true)
    public Profile findByUserLogin(String userLogin) {
        if (userLogin == null || userLogin.trim().isEmpty()) {
            return null;
        }
        Profile profile = profileRepository.findByUserLogin(userLogin)
                .orElse(null);
        return profile;
    }


}
