package com.safe_and_found.services.implementations;

import com.safe_and_found.entity.KeyLostPost;
import com.safe_and_found.entity.LostPost;
import com.safe_and_found.repository.KeyLostPostRepository;
import com.safe_and_found.repository.LostPostRepository;
import com.safe_and_found.services.KeyLostPostService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KeyLostPostServiceImplementation implements KeyLostPostService {

    @Autowired
    private KeyLostPostRepository keyLostPostRepository;
    @Override
    public KeyLostPost createPost(KeyLostPost post) throws Exception {
        KeyLostPost local=this.keyLostPostRepository.save(post);
        return local;
    }

    @Override
    public List<KeyLostPost> getPost(String toSearch) {
        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        String queryString = "FROM LostPost WHERE itemName LIKE '%toSearch%'";
        Query query = session.createQuery(queryString);
        query.setParameter("itemName", toSearch);
        List<KeyLostPost> results = query.list();
        return results;
    }

    @Override
    public void deletePost(Long id) {
        this.keyLostPostRepository.deleteById(id);
    }
}
