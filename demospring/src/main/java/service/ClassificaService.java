package service;

import Entity.Classifica;
import Repository.ClassificaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassificaService {

    private final ClassificaRepository classificaRepo;
    @Autowired
    public ClassificaService(ClassificaRepository classificaRepo) {
        this.classificaRepo = classificaRepo;
    }

    public List<Classifica> findAllClassifica(){
        return classificaRepo.findAll();
    }


}

