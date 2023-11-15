package ma.essaoulajy.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.essaoulajy.demo.entities.Categorie;

@Repository
public interface CategorieRepository extends JpaRepository<Categorie,Long> {
	

	

	

	}

