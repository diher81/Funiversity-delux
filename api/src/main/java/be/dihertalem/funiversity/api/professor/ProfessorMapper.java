package be.dihertalem.funiversity.api.professor;

import be.dihertalem.funiversity.domain.Professor;

public class ProfessorMapper {

    public static ProfessorDto professorMapper(Professor professor) {
        return new ProfessorDto(professor.getId(), professor.getFirstName(), professor.getLastName());
    }
}
