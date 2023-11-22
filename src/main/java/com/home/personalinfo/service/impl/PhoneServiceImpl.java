package com.home.personalinfo.service.impl;

import com.home.dtos.phone.PhoneDTO;
import com.home.personalinfo.entities.phone.Phone;
import com.home.personalinfo.repository.PhoneRepository;
import com.home.personalinfo.service.PhoneService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhoneServiceImpl implements PhoneService {
    @Autowired
    private PhoneRepository phoneRepository;
    @Autowired
    private ModelMapper modelMapper;
    @Override
    public PhoneDTO save(PhoneDTO phoneDTO) {
        Phone phone = modelMapper.map(phoneDTO, Phone.class);
        return modelMapper.map(phoneRepository.save(phone), PhoneDTO.class);
    }
}
