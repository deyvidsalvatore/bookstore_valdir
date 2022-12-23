package io.github.deyvidsantos.crud.repository;

import io.github.deyvidsantos.crud.domain.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LivroRepository extends JpaRepository<Livro, Integer> {

    @Query("SELECT obj FROM Livro obj WHERE obj.categoria.id = :id_cat ORDER BY nome")
    List<Livro> findAllByCategoria(@Param(value = "id_cat") Integer idCat);
}
