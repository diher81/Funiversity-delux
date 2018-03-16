package be.dihertalem.funiversity.api.professor;

import be.dihertalem.funiversity.domain.Professor;
import be.dihertalem.funiversity.service.ProfessorService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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

//    @GetMapping(produces = "application/json")
//    @ResponseStatus(HttpStatus.OK)
//    public List<ProfessorDto> getProfessors(){
//        List<ProfessorDto> professorDtos = new ArrayList<ProfessorDto>();
//        for(Professor professor : service.getProfessors().values()) {
//            professorDtos.add(ProfessorMapper.professorMapper(professor));
//        }
//        return professorDtos;
//    }

//    @GetMapping(path = "/{/id}", produces = "application/json")
//    @ResponseStatus(HttpStatus.OK)
//    public ProfessorDto getProfessors(@PathVariable("id") int id){
//        return ProfessorMapper.professorMapper(service.getProfessor(id));
//    }

    @GetMapping(produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public List<Professor> getProfessors(){
        List<Professor> professors = new ArrayList<Professor>();
        for(Professor professor : service.getProfessors().values()) {
            professors.add(professor);
        }
        return professors;
    }

    @GetMapping(path = "/{id}", produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public Professor getProfessors(@PathVariable("id") int id){
        return service.getProfessor(id);
    }
}
