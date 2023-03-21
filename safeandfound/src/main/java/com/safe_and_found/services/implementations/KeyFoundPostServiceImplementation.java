package com.safe_and_found.services.implementations;

import com.safe_and_found.entity.IdFoundPost;
import com.safe_and_found.entity.KeyFoundPost;
import com.safe_and_found.repository.IdFoundPostRepository;
import com.safe_and_found.repository.KeyFoundPostRepository;
import com.safe_and_found.services.KeyFoundPostService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KeyFoundPostServiceImplementation implements KeyFoundPostService {

    @Autowired
    private KeyFoundPostRepository keyFoundPostRepository;

    @Override
    public KeyFoundPost createPost(KeyFoundPost post) throws Exception {
        KeyFoundPost local=this.keyFoundPostRepository.save(post);
        return local;
    }

    @Override
    public List<KeyFoundPost> getPost(String toSearch) {
        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        String queryString = "FROM KeyFoundPost WHERE itemName LIKE '%toSearch%'";
        Query query = session.createQuery(queryString);
        query.setParameter("itemName", toSearch);
        List<KeyFoundPost> results = query.list();
        return results;
    }

    @Override
    public void deletePost(Long id) {
        this.keyFoundPostRepository.deleteById(id);
    }
}
