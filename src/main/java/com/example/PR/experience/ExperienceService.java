package com.example.PR.experience;

import com.example.PR.experience.Dto.ExperienceDto;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ExperienceService {

    private final ExperienceRepository experienceRepository;
    private final ExperienceMapper experienceMapper;

    public void setExperienceRepository(ExperienceDto experienceDto) {
        experienceRepository.save(experienceMapper.experienceDtoToExperience(experienceDto));
    }

    public Page<Experience> getExperiences(int page) {
        Pageable pageable = PageRequest.of(page-1, 10);
        return experienceRepository.findAll(pageable);
    }
}
