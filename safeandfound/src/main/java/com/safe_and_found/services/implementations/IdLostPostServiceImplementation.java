package com.safe_and_found.services.implementations;

import com.safe_and_found.entity.IdLostPost;
import com.safe_and_found.entity.KeyLostPost;
import com.safe_and_found.repository.IdLostPostRepository;
import com.safe_and_found.repository.KeyLostPostRepository;
import com.safe_and_found.services.IdLostPostService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IdLostPostServiceImplementation implements IdLostPostService {

    @Autowired
    private IdLostPostRepository idLostPostRepository;

    @Override
    public IdLostPost createPost(IdLostPost post) throws Exception {
        IdLostPost local=this.idLostPostRepository.save(post);
        return local;
    }

    @Override
    public List<IdLostPost> getPost(String toSearch) {
        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        String queryString = "FROM LostPost WHERE itemName LIKE '%toSearch%'";
        Query query = session.createQuery(queryString);
        query.setParameter("itemName", toSearch);
        List<IdLostPost> results = query.list();
        return results;
    }

    @Override
    public void deletePost(Long id) {
        this.idLostPostRepository.deleteById(id);
    }
}
