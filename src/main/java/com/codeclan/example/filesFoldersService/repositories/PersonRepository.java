package com.codeclan.example.filesFoldersService.repositories;

import com.codeclan.example.filesFoldersService.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
