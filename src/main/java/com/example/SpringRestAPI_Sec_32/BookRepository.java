package com.example.SpringRestAPI_Sec_32;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookRepository extends JpaRepository<Book1, Integer>{

}
