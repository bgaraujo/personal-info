package com.home.personalinfo.service.impl;

import com.home.dtos.document.DocumentDTO;
import com.home.personalinfo.entities.document.Document;
import com.home.personalinfo.repository.DocumentRepository;
import com.home.personalinfo.service.DocumentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentServiceImpl implements DocumentService {
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private DocumentRepository documentRepository;

    @Override
    public DocumentDTO save(DocumentDTO documentDTO) {
        Document document = documentRepository.save(modelMapper.map(documentDTO, Document.class));
        return modelMapper.map(document,DocumentDTO.class);
    }

    @Override
    public List<DocumentDTO> saveAll(List<DocumentDTO> documentDTOList) {
        documentDTOList.forEach(documentDTO -> documentDTO.setId(documentRepository.save(modelMapper.map(documentDTO, Document.class)).getId()));
        return documentDTOList;
    }
}
