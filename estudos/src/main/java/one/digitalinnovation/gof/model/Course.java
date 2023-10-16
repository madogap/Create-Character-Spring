package one.digitalinnovation.gof.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nome", length = 30, nullable = false)
    private String name;

    @Column(name = "categoria", length = 20 ,nullable = false)
    private String category;

    public Course(Long id, String name, String category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }

}
