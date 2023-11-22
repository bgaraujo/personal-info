package com.home.personalinfo.controller.phone;

import com.home.dtos.phone.PhoneDTO;
import com.home.personalinfo.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Phone implements PhoneEndpoint{
    @Autowired
    private PhoneService phoneService;
    @Override
    public ResponseEntity<PhoneDTO> save(PhoneDTO phoneDTO) {
        return ResponseEntity.ok(phoneService.save(phoneDTO));
    }
}
