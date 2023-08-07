package com.example.PR.experience;

import com.example.PR.experience.Dto.ExperienceDto;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/experience")
@AllArgsConstructor
public class ExperienceController {
    private final ExperienceService experienceService;
    private final ExperienceMapper experienceMapper;

    @PostMapping
    public void setExperienceService(@RequestBody ExperienceDto experienceDto) {
        experienceService.setExperienceRepository(experienceDto);
    }

    @GetMapping
    public ResponseEntity getExperience(@RequestParam int page) {
        Page<Experience> experiences = experienceService.getExperiences(page);
        return ResponseEntity.ok().body(experiences);
    }
}
