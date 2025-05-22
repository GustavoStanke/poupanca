package orgSenac.aula01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import orgSenac.aula01.Model.modelPoupanca;
import orgSenac.aula01.repository.RepositoryPoupanca;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/poupanca")
public class PoupancaController {

    @Autowired
    private RepositoryPoupanca repository;

    // Retorna todos os registros de Poupanca
    @GetMapping
    public List<modelPoupanca> getAll() {
        return repository.findAll();
    }

    // Salva um novo registro de Poupanca
    @PostMapping
    public modelPoupanca save(@RequestBody modelPoupanca poupanca) {
        return repository.save(poupanca);
    }
}