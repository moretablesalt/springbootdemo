package tiu.mark.springdemo.student;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InMemoryStudentServiceImpl implements StudentService {

    private final InMemoryStudentDao dao;

    public InMemoryStudentServiceImpl(InMemoryStudentDao dao) {
        this.dao = dao;
    }

    @Override
    public List<Student> findAllStudents() {

        return dao.findAllStudents();
    }

    @Override
    public Student save(Student s) {
        return dao.save(s);
    }

    @Override
    public Student findByEmail(String email) {
        return dao.findByEmail(email);
    }

    @Override
    public Student update(Student s) {
        return dao.update(s);
    }

    @Override
    public void delete(String email) {
        dao.delete(email);
    }
}
