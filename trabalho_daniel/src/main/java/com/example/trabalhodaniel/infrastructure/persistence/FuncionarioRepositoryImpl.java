package com.example.trabalhodaniel.infrastructure.persistence;

import com.example.trabalhodaniel.domain.entity.Funcionario;
import com.example.trabalhodaniel.domain.repository.FuncionarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class FuncionarioRepositoryImpl implements FuncionarioRepository {

    private final FuncionarioJpaRepository jpaRepository;

    @Override
    public Funcionario salvar(Funcionario funcionario) {
        FuncionarioJpaEntity entity = new FuncionarioJpaEntity(
                null,
                funcionario.getNome(),
                funcionario.getNomeCargoSalvo(),
                funcionario.getHorasExtras(),
                funcionario.getHorasDesconto());
        FuncionarioJpaEntity salvo = jpaRepository.save(entity);
        return new Funcionario(salvo.getId(), funcionario.getNome(),
                funcionario.getCargo(),
                funcionario.getHorasExtras(),
                funcionario.getHorasDesconto());
    }

    @Override
    public List<Funcionario> listarTodos() {
        return List.of();
    }

    @Override
    public Optional<Funcionario> buscarPorNome(String nome) {
        return Optional.empty();
    }
}