package com.codeclan.example.filesFoldersService.controllers;

import com.codeclan.example.filesFoldersService.models.File;
import com.codeclan.example.filesFoldersService.repositories.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class FileController {

    @Autowired
    FileRepository fileRepository;

    @GetMapping(value = "/files")
    public List<File>getAllFiles(){
        return fileRepository.findAll();
    }

    @GetMapping(value = "/files/{id}")
    public ResponseEntity<Optional<File>> getFile(@PathVariable Long id){
        Optional <File> optionalFile = fileRepository.findById(id);
        if (optionalFile.isPresent()){
            return new ResponseEntity<>(fileRepository.findById(id), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(optionalFile, HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping(value = "/files")
    public ResponseEntity<File>postFile(@RequestBody File file){
        fileRepository.save(file);
        return new ResponseEntity<>(file, HttpStatus.CREATED);
    }
}
