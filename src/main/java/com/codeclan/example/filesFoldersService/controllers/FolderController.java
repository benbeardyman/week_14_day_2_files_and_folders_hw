package com.codeclan.example.filesFoldersService.controllers;

import com.codeclan.example.filesFoldersService.models.Folder;
import com.codeclan.example.filesFoldersService.repositories.FolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FolderController {
    @Autowired
    FolderRepository folderRepository;

    @GetMapping(value = "/folders")
    public List<Folder>getAllFolders(){
        return folderRepository.findAll();
    }
}
