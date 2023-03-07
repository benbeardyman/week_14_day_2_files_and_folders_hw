package com.codeclan.example.filesFoldersService.components;

import com.codeclan.example.filesFoldersService.models.File;
import com.codeclan.example.filesFoldersService.models.Folder;
import com.codeclan.example.filesFoldersService.models.Person;
import com.codeclan.example.filesFoldersService.repositories.FileRepository;
import com.codeclan.example.filesFoldersService.repositories.FolderRepository;
import com.codeclan.example.filesFoldersService.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!test")
@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    PersonRepository personRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {
        Person rob = new Person("Rob");
        personRepository.save(rob);

        Folder photos = new Folder("Photos", rob);
        folderRepository.save(photos);

        Folder docs = new Folder("Docs", rob);
        folderRepository.save(docs);

        File dsc132564 = new File("dsc132564", ".jpg", 500, photos);
        fileRepository.save(dsc132564);

        File dsc897634 = new File("dsc897634", ".jpg", 730, photos);
        fileRepository.save(dsc897634);

        File cv = new File("cv", ".doc", 65, docs);
        fileRepository.save(cv);

    }
}
