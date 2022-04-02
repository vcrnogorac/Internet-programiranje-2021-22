package local.rps.professor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfessorService {

	@Autowired
	ProfessorRepository professorRepository;

	public ProfessorService() {
	}

	public List<Professor> getAllProfessors() {
		return this.professorRepository.findAll();
	}

	public Professor getProfessorById(int id) {
		return this.professorRepository.findById(id).get();
	}

	public void addProfessor(Professor professor) {
		this.professorRepository.save(professor);
	}
	
	public void updateProfessor(Professor professor) {
		this.professorRepository.save(professor);
	}
	
	public void deleteProfessorById(int id) {
		Professor s = this.getProfessorById(id);
		this.professorRepository.delete(s);	
	}

}
