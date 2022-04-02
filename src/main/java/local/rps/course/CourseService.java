package local.rps.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	CourseRepository courseRepository;
	
	public CourseService() {
		super();
	}

	public List<Course> getAllCourses(){
		return courseRepository.findAll();
	}
	
	public Course getCourseById(int id) {
		return courseRepository.findById(id).get();
	}
	
	public List<Course> getAllCoursesByProfessorId(int id){
		return this.courseRepository.findByProfessorId(id);
	}
	
	public void addCourse(Course course) {
		courseRepository.save(course);
	}

	public void updateCourse(Course course) {
		courseRepository.save(course);
	}

	public void deleteCourseById(int id) {
		courseRepository.deleteById(id);
	}
	
	public void deleteCourse(Course course) {
		courseRepository.delete(course);
	}

}
