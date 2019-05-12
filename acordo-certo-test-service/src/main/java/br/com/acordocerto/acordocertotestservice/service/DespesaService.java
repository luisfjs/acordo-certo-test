package br.com.acordocerto.acordocertotestservice.service;

import br.com.acordocerto.acordocertotestservice.error.RequestParamException;
import br.com.acordocerto.acordocertotestservice.error.ResourceNotFoundExeption;
import br.com.acordocerto.domain.model.Despesa;
import br.com.acordocerto.domain.repository.DespesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DespesaService {

    @Autowired
    private DespesaRepository repository;

    public List<Despesa> getAll() {
        try {
            return repository.findAll();
        } catch (Exception e) {
            throw new RequestParamException("Algum parametro informado não é válido, verificar resposta");
        }
    }

    public Despesa get(Long id) {
        Optional<Despesa> entity = repository.findById(id);
        return entity.orElseThrow(() -> new ResourceNotFoundExeption("Recurso não encontrado com o ID: " + id));
    }

    public void delete(Despesa despesa) {
        try {
            repository.delete(despesa);
        } catch (Exception e) {
            throw new RequestParamException("Algum parametro informado não é válido, verificar resposta");
        }
    }

    public Despesa save(Despesa despesa) {
        try {
            return repository.save(despesa);
        } catch (Exception e) {
            throw new RequestParamException("Erro ao salvar recurso, verifique os parametros digitados");
        }
    }
}
