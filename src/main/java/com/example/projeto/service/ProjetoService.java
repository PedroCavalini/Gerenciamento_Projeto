package com.example.projeto.service;

import com.example.projeto.model.ProjetoModel;
import com.example.projeto.repository.ProjetoRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProjetoService {

    private final ProjetoRepository repository;

    public ProjetoService(ProjetoRepository repository) {
        this.repository = repository;
    }

    public ProjetoModel salvar(ProjetoModel projeto) {
        return repository.save(projeto);
    }

    public List<ProjetoModel> listarTodos() {
        return repository.findAll();
    }

    public Optional<ProjetoModel> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}