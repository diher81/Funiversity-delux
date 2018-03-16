package be.dihertalem.funiversity.api.professor;

import be.dihertalem.funiversity.domain.Professor;
import be.dihertalem.funiversity.service.ProfessorService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "/professors")
public class ProfessorController {

    private ProfessorService service;

    @Inject
    public ProfessorController(ProfessorService service) {
        this.service = service;
    }

    @GetMapping(produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public List<ProfessorDto> getProfessors(){
        List<ProfessorDto> professorDtos = new ArrayList<ProfessorDto>();
        for(Professor professor : service.getProfessors().values()) {
            professorDtos.add(ProfessorMapper.professorMapper(professor));
        }
        return professorDtos;
    }
}
