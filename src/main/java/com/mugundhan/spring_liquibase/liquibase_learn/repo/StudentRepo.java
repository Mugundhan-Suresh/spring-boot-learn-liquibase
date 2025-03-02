package com.mugundhan.spring_liquibase.liquibase_learn.repo;

import com.mugundhan.spring_liquibase.liquibase_learn.model.Student;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {


}
