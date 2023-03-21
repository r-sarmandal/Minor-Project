package com.safe_and_found.services.implementations;

import com.safe_and_found.entity.FoundPost;
import com.safe_and_found.repository.FoundPostRepository;
import com.safe_and_found.repository.FoundPostRepository;
import com.safe_and_found.services.FoundPostService;
import com.safe_and_found.services.FoundPostService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoundPostServiceImplementation implements FoundPostService {

    @Autowired
    private FoundPostRepository foundPostRepository;

    @Override
    public FoundPost createPost(FoundPost post) throws Exception {
        FoundPost local=this.foundPostRepository.save(post);
        return local;
    }

    @Override
    public List<FoundPost> getPost(String toSearch) {
        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        String queryString = "FROM FoundPost WHERE itemName LIKE '%toSearch%'";
        Query query = session.createQuery(queryString);
        query.setParameter("itemName", toSearch);
        List<FoundPost> results = query.list();
        return results;
    }

    @Override
    public void deletePost(Long id) {
        this.foundPostRepository.deleteById(id);
    }
}
