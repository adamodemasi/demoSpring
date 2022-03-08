package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Entity.Classifica;
import service.ClassificaService;

@RequestMapping("/api")
@RestController("classificaController")
public class ClassificaController {

    private final ClassificaService classificaService;

    @Autowired
    public ClassificaController(ClassificaService classificaService) {
        this.classificaService = classificaService;
    }

    @GetMapping("/squadre")
    public List<Classifica> findAllClassifica(){
        return classificaService.findAllClassifica();
    }


}
