package tiu.mark.springdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> findAllStudents() {
        return List.of(
                new Student("Mark",
                        "Tiu",
                        LocalDate.now(),
                        "some@yahoo.com",
                        34),
                new Student("Viel",
                        "Tiu",
                        LocalDate.now(),
                        "viel@yahoo.com",
                        33)
        );
    }
}
