package br.com.acordocerto.acordocertotestweb.controller;

import br.com.acordocerto.acordocertotestservice.service.DespesaService;
import br.com.acordocerto.domain.model.Despesa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/despesa")
public class DespesaController {

    @Autowired
    private DespesaService service;

    @CrossOrigin
    @GetMapping
    public ResponseEntity<Despesa> listar() {
        return new ResponseEntity(service.getAll(), HttpStatus.OK);
    }

    @CrossOrigin
    @PostMapping
    public ResponseEntity<Despesa> salvar(@Valid @RequestBody Despesa despesa) {
        return new ResponseEntity(service.save(despesa), HttpStatus.CREATED);
    }

    @CrossOrigin
    @PutMapping("/{id}")
    public ResponseEntity<Despesa> atualizar(@Valid @RequestBody Despesa despesa) {
        service.get(despesa.getId());
        return new ResponseEntity(service.save(despesa), HttpStatus.OK);
    }

    @CrossOrigin
    @GetMapping("/{id}")
    public ResponseEntity<Despesa> editar(@PathVariable("id") Long id) {
        return new ResponseEntity(service.get(id), HttpStatus.OK);
    }

    @CrossOrigin
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletar(@PathVariable("id") Long id) {
        service.delete(service.get(id));
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
