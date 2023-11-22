package com.home.personalinfo.controller.phone;

import com.home.dtos.phone.PhoneDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/contact")
public interface PhoneEndpoint {

    @PostMapping("/phone")
    ResponseEntity<PhoneDTO> save(@RequestBody PhoneDTO phoneDTO);

}
