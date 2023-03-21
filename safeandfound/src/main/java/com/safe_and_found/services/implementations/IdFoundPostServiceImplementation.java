package com.safe_and_found.services.implementations;

import com.safe_and_found.entity.FoundPost;
import com.safe_and_found.entity.IdFoundPost;
import com.safe_and_found.repository.IdFoundPostRepository;
import com.safe_and_found.services.IdFoundPostService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Properties;

@Service
public class IdFoundPostServiceImplementation implements IdFoundPostService {

    @Autowired
    private IdFoundPostRepository idFoundPostRepository;

    @Override
    public IdFoundPost createPost(IdFoundPost post) throws Exception {
        IdFoundPost local=this.idFoundPostRepository.save(post);
        return local;
    }

    @Override
    public List<IdFoundPost> getPost(String toSearch) {
        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        String queryString = "FROM IdFoundPost WHERE itemName LIKE '%toSearch%'";
        Query query = session.createQuery(queryString);
        query.setParameter("itemName", toSearch);
        List<IdFoundPost> results = query.list();
        return results;
    }

    @Override
    public void deletePost(Long id) {
        this.idFoundPostRepository.deleteById(id);
    }
}
