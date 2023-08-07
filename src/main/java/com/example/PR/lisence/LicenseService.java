package com.example.PR.lisence;

import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class LicenseService {

    private final LicenseRepository licenseRepository;

    public Page<License> getLicenses(int page) {
        Pageable pageable = PageRequest.of(page-1, 10);
        return licenseRepository.findAll(pageable);
    }
}
