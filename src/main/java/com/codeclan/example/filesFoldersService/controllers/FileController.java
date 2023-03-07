package com.codeclan.example.filesFoldersService.controllers;

import com.codeclan.example.filesFoldersService.models.File;
import com.codeclan.example.filesFoldersService.repositories.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FileController {

    @Autowired
    FileRepository fileRepository;

    @GetMapping(value = "/files")
    public List<File>getAllFiles(){
        return fileRepository.findAll();
    }
}
