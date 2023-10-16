package one.digitalinnovation.gof;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import one.digitalinnovation.gof.model.Course;
import one.digitalinnovation.gof.repository.CourseRepository;

@SpringBootApplication
public class LabPradroesProjetoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabPradroesProjetoSpringApplication.class, args);
	}

	@Bean
    CommandLineRunner initDataBase(CourseRepository courseRepository){
        return args -> {
			courseRepository.deleteAll();
			Course c = new Course();
			c.setName("Fronte");
			c.getCategory("SASDADADAS")
			courseRepository.save(c);
        };
    }

}
