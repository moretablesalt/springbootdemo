package tiu.mark.springdemo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    // tightly coupled
    // spring framework / container is not managing the lifecycle
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> findAllStudents() {
        return studentService.findAllStudents();
    }

    @PostMapping
    public Student save(@RequestBody Student s) {
        return studentService.save(s);
    }

    @GetMapping("/{email}")
    public Student findByEmail(@PathVariable String email) {

        return studentService.findByEmail(email);
    }

    @PutMapping
    public Student updateStudent(@RequestBody Student s) {
        return studentService.update(s);
    }

    @DeleteMapping("/{email}")
    public void delete(@PathVariable String email) {
        studentService.delete(email);
    }
}
