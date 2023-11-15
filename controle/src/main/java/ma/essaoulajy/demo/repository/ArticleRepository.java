package ma.essaoulajy.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.essaoulajy.demo.entities.Article;
import ma.essaoulajy.demo.entities.Categorie;
import java.util.List;



@Repository
public interface ArticleRepository extends JpaRepository<Article,Long> {
	
List<Article> findByCategorie(Categorie categorie);
	

	

	}

