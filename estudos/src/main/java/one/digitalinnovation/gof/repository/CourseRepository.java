package one.digitalinnovation.gof.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import one.digitalinnovation.gof.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Long, Course >{
    

}
