package com.codeclan.example.filesFoldersService.repositories;

import com.codeclan.example.filesFoldersService.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
