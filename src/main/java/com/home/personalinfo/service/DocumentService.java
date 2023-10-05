package com.home.personalinfo.service;

import com.home.dtos.document.DocumentDTO;

import java.util.List;

public interface DocumentService {
    DocumentDTO save(DocumentDTO documentDTO);
    List<DocumentDTO> saveAll(List<DocumentDTO> documentDTOList);
}
