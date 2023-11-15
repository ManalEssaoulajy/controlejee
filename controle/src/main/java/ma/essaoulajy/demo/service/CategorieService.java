package ma.essaoulajy.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.essaoulajy.demo.dao.IDao;
import ma.essaoulajy.demo.entities.Article;
import ma.essaoulajy.demo.entities.Categorie;
import ma.essaoulajy.demo.repository.CategorieRepository;

@Service
public class CategorieService implements IDao<Categorie> {

    @Autowired
    private CategorieRepository repository;

    @Override
    public Categorie create(Categorie o) {
        return repository.save(o);
    }

    @Override
    public boolean delete(Categorie o) {
        try {
            repository.delete(o);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public Categorie update(Categorie o) {
        return repository.save(o);
    }

    @Override
    public Categorie findById(long id) {
        return repository.findById((long) id).orElse(null);
    }

    @Override
    public List<Categorie> findAll() {
        return repository.findAll();
    }
}
