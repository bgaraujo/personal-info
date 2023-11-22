package com.home.personalinfo.repository;

import com.home.personalinfo.entities.phone.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneRepository extends JpaRepository<Phone, Long> {
}
