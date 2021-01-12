package com.bespalov.project.resource;

import com.bespalov.project.annotation.JsonSerialize;
import com.bespalov.project.dto.ProfileDTO;
import com.bespalov.project.service.ProfileService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.Principal;

@RestController
@RequestMapping("/profile")
public class ProfileResource {
    private final Logger log = LoggerFactory.getLogger(ProfileResource.class);

    private final ProfileService profileService;

    public ProfileResource(ProfileService profileService) {
        this.profileService = profileService;
    }

    @PostMapping("/create")
    public ResponseEntity createProfile(@Valid @RequestBody ProfileDTO profileDTO) throws URISyntaxException {
        log.debug("REST request to save Profile : {}", profileDTO);
        if (profileDTO.getId() != null) {
            return ResponseEntity.badRequest().body("Invalid data");
        }
        ProfileDTO result = profileService.save(profileDTO);
        return ResponseEntity.created(new URI("/api/profiles/" + result.getId()))
                .body(result);
    }

    @PutMapping("/update-question")
    public ResponseEntity<?> addControlQuestion(@RequestParam(value = "question") String question,
                                                @RequestParam(value = "answer") String answer,
                                                Principal principal) {
        try {
            profileService.addControlQuestion(question, answer, principal.getName());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
        return ResponseEntity.ok().body("");
    }

    @GetMapping("/all")
    public ResponseEntity<Page<ProfileDTO>> getAllProfiles(Pageable pageable) {
        log.debug("REST request to get a page of Profiles");
        Page<ProfileDTO> profiles = profileService.findAll(pageable);
        return ResponseEntity.ok().body(profiles);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProfile(@PathVariable Long id) {
        log.debug("REST request to delete Profile : {}", id);
        profileService.delete(id);
        return ResponseEntity.noContent()
                .build();
    }
}
