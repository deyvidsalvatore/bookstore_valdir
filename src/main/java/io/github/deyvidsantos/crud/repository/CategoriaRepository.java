package io.github.deyvidsantos.crud.repository;

import io.github.deyvidsantos.crud.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
