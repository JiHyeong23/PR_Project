package com.example.PR.lisence;

import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/License")
@AllArgsConstructor
public class LicenseController {

    private LicenseService licenseService;

//    @PostMapping
//    public void setLicenses(@RequestBody LicenseDto licensesDto) {
//        licenseService.getLicenses();
//    }

    @GetMapping
    public ResponseEntity getLicenses(@RequestParam int page) {
        Page<License> licenses = licenseService.getLicenses(page);
        return ResponseEntity.ok().body(licenses);
    }
}
