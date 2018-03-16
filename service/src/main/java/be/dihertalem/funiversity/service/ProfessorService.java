package be.dihertalem.funiversity.service;

import be.dihertalem.funiversity.domain.Professor;
import be.dihertalem.funiversity.domain.Repository;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.Map;

@Named
public class ProfessorService {

    private Repository repo = new Repository();

    public Map<Integer, Professor> getProfessors(){
        try {
            return repo.getProfessors();
        } catch (IllegalArgumentException ex){
            throw new IllegalArgumentException("Empty array");
        }
    }

    public Professor getProfessor(int id){
        try {
            return repo.getProfessor(id);
        } catch (IllegalArgumentException ex){
            return new Professor("Unknown first name", "Unknown last name");
        }
    }

    public void createProfessor(String firstName, String lastName) {
        repo.addNewProfessor(new Professor(firstName, lastName));
    }

    public void deleteProfessor(int professorId) {
        repo.deleteProfessor(professorId);
    }

    public void updateProfessorFirstName(int id, String firstName) {
        repo.updateFirstName(id, firstName);
    }

    public void updateProfessorLastName(int id, String lastName) {
        repo.updateLastName(id, lastName);
    }

}
