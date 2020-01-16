package com.bespalov.project.mapper;

import com.bespalov.project.domain.Profile;
import com.bespalov.project.dto.ProfileDTO;

public interface ProfileMapper extends EntityMapper<ProfileDTO, Profile> {

    ProfileDTO toDto(Profile profile);

    Profile toEntity(ProfileDTO profileDTO);
}
