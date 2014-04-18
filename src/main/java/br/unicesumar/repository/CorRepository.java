package br.unicesumar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.unicesumar.entity.Cor;

public interface CorRepository extends JpaRepository<Cor, Long> {
}