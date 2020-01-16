package com.bespalov.project.mapper.impl;

import com.bespalov.project.domain.Profile;
import com.bespalov.project.dto.ProfileDTO;
import com.bespalov.project.mapper.ProfileMapper;
import org.springframework.stereotype.Component;

@Component
public class ProfileMapperImpl implements ProfileMapper {
    @Override
    public ProfileDTO toDto(Profile profile) {
        ProfileDTO profileDTO = new ProfileDTO();
        profileDTO.setId(profile.getId());
        profileDTO.setFirstName(profile.getFirstName());
        profileDTO.setLastName(profile.getLastName());
        profileDTO.setPatronymic(profile.getPatronymic());
        profileDTO.setDateOfBirthday(profile.getBirthDate());
        profileDTO.setInn(profile.getInn());
        profileDTO.setPassportSeries(profile.getPassportSeries());
        profileDTO.setPassportNumber(profile.getPassportNumber());
        profileDTO.setPassportIssuer(profile.getPassportIssuer());
        profileDTO.setPassportIssueDate(profile.getPassportIssueDate());
        profileDTO.setFamilyMembersAmount(profile.getFamilyMembersAmount());
        profileDTO.setControlQuestionValue(profile.getControlQuestionValue());
        return profileDTO;
    }

    @Override
    public Profile toEntity(ProfileDTO profileDTO) {
        Profile profile = new Profile();
        profile.setFirstName(profileDTO.getFirstName());
        profile.setLastName(profileDTO.getLastName());
        profile.setPatronymic(profileDTO.getPatronymic());
        profile.setBirthDate(profileDTO.getDateOfBirthday());
        profile.setInn(profileDTO.getInn());
        profile.setPassportSeries(profileDTO.getPassportSeries());
        profile.setPassportNumber(profileDTO.getPassportNumber());
        profile.setPassportIssuer(profileDTO.getPassportIssuer());
        profile.setPassportIssueDate(profileDTO.getPassportIssueDate());
        profile.setFamilyMembersAmount(profileDTO.getFamilyMembersAmount());
        profile.setControlQuestionValue(profileDTO.getControlQuestionValue());
        return profile;
    }
}
