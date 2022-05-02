package com.phoenix.licences.service;

import com.phoenix.licences.config.ServiceConfig;
import com.phoenix.licences.model.License;
import com.phoenix.licences.repository.LicenseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class LicenseService {

    private final LicenseRepository licenseRepository;
    private final ServiceConfig config;

    /*
      기관 아이디와 라이센스 아이디로 단건 라이센스 조회
     */
    public License getLicense(String organizationId, String licenseId){
        License license = licenseRepository.findLicenseByOrganizationIdAndLicenseId(organizationId, licenseId);
        return license.withComment(config.getExampleProperty());
    }
    /*
      기관 아이디로 라이센스 리스트 조회
     */
    public List<License> getLicensesByOrg(String organizationId){
        return licenseRepository.findLicenseByOrganizationId(organizationId);
    }
    /*
      라이센스 저장
     */
    public void saveLicense(License license){
        license.withId(UUID.randomUUID().toString()); // 왜 setId 로 바로 접근하지 않았을까?
        licenseRepository.save(license);
    }

    /*
       라이센스 수정
     */
    public void updateLicense(License license){
        licenseRepository.save(license);
    }
    /*
      라이센스 삭제
     */
    public void deleteLicense(License license){
        licenseRepository.delete(license);
    }

}
