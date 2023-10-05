package com.home.personalinfo.controller.document;

import com.home.dtos.document.DocumentDTO;
import com.home.dtos.enums.DocumentType;
import com.home.personalinfo.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class Document implements DocumentEndpoint{
    @Autowired
    private DocumentService documentService;
    @Override
    public ResponseEntity<DocumentDTO> save(DocumentDTO documentDTO) {
        return ResponseEntity.ok(documentService.save(documentDTO));
    }

    @Override
    public ResponseEntity<List<DocumentDTO>> save(List<DocumentDTO> documentDTOList) {
        return ResponseEntity.ok(documentService.saveAll(documentDTOList));
    }

    @Override
    public ResponseEntity<List<DocumentType>> getDocumentType() {
        return ResponseEntity.ok( Arrays.stream(DocumentType.values()).toList() );
    }
}
