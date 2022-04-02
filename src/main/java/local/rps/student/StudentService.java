package local.rps.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;

	public StudentService() {
	}

	public List<Student> getAllStudents() {
		return this.studentRepository.findAll();
	}

	public Student getStudentById(int id) {
		return this.studentRepository.findById(id).get();
	}

	public List<Student> getStudentByIndexNumber(String indexNumber) {
		return this.studentRepository.findByIndexNumber(indexNumber);
	}

	public void addStudent(Student student) {
		this.studentRepository.save(student);
	}
	
	public void updateStudent(Student student) {
		this.studentRepository.save(student);
	}

	public void deleteStudentById(int id) {
		Student s = this.getStudentById(id);
		this.studentRepository.delete(s);	
	}
	
	public void deleteStudent(Student student) {
		this.studentRepository.delete(student);	
	}

}
