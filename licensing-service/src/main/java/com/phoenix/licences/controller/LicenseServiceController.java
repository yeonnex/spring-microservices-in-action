package com.phoenix.licences.controller;

import com.phoenix.licences.config.ServiceConfig;
import com.phoenix.licences.model.License;
import com.phoenix.licences.service.LicenseService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1/organizations/{organizationId}/licenses")
public class LicenseServiceController {

    private final LicenseService licenseService;
    private final ServiceConfig config;

    /**
        기관 아이디로 라이센스 리스트 조회
     */
    @GetMapping("/")
    public List<License> getLicenses(@PathVariable("organizationId") String organizationId){
        return licenseService.getLicensesByOrg(organizationId);
    }

    /**
        기관 아이디와 라이센스 아이디로 단건 라이센스 조회
     */
    @GetMapping("/{licenseId}")
    public License getLicense(@PathVariable("organizationId") String organizationId, @PathVariable("licenseId")String licenseId){
        return licenseService.getLicense(organizationId, licenseId);
    }

    /**
     * 라이센스 저장
     */
    @PostMapping("/")
    public void saveLicense(@RequestBody License license){
        licenseService.saveLicense(license);
    }
    /*
        라이센스 수정
     */
    @PutMapping("/{licenseId}")
    public String updateLicense(@PathVariable("licenseId") String licenseId){
        return "This is the PUT! Update License!";
    }

    @DeleteMapping("/{licenseId}")
    public String deleteLicense(@PathVariable("licenseId") String licenseId){
        return "This is DELETE! Delete License!";
    }

}
