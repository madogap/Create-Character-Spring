package one.digitalinnovation.gof.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import one.digitalinnovation.gof.model.Course;
import one.digitalinnovation.gof.repository.CourseRepository;

@RestController
@RequestMapping("/api/courses")
public class CourseController {
    
    @Autowired
    private CourseRepository courseRepository;

    public CourseController(CourseRepository courseRepository){
        this.courseRepository = courseRepository;
    }

    @GetMapping
    //@RequestMapping(method = RequestMethod.GET)
    public List<Course> list(){
        return courseRepository.findAll(null);
    }
    
}
