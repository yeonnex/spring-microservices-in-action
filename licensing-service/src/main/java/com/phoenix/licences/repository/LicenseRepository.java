package com.phoenix.licences.repository;

import com.phoenix.licences.model.License;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LicenseRepository extends CrudRepository<License, String> {
    List<License> findLicenseByOrganizationId(String id);
    License findLicenseByOrganizationIdAndLicenseId(String organizationId, String licenseId);
}
가