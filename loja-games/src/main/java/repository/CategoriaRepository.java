package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Categoria;

import java.util.List;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

    public List <Categoria> findAllByDescricaoContainingIgnoreCase(String descricao);

    
    
}
