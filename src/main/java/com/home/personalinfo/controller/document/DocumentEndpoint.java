package com.home.personalinfo.controller.document;

import com.home.dtos.document.DocumentDTO;
import com.home.dtos.enums.DocumentType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/document")
public interface DocumentEndpoint {
    @PostMapping
    ResponseEntity<DocumentDTO> save(@RequestBody DocumentDTO documentDTO);

    @PostMapping("/list")
    ResponseEntity<List<DocumentDTO>> save(@RequestBody List<DocumentDTO> documentDTOList);

    @GetMapping("/types")
    ResponseEntity<List<DocumentType>> getDocumentType();
}
