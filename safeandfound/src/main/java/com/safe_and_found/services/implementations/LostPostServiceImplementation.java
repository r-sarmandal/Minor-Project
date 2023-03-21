package com.safe_and_found.services.implementations;

import com.safe_and_found.entity.KeyFoundPost;
import com.safe_and_found.entity.LostPost;
import com.safe_and_found.repository.LostPostRepository;
import com.safe_and_found.services.LostPostService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LostPostServiceImplementation implements LostPostService {

    @Autowired
    private LostPostRepository lostPostRepository;

    @Override
    public LostPost createPost(LostPost post) throws Exception {
        LostPost local=this.lostPostRepository.save(post);
        return local;
    }

    @Override
    public List<LostPost> getPost(String toSearch) {
        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        String queryString = "FROM LostPost WHERE itemName LIKE '%toSearch%'";
        Query query = session.createQuery(queryString);
        query.setParameter("itemName", toSearch);
        List<LostPost> results = query.list();
        return results;
    }

    @Override
    public void deletePost(Long id) {
        this.lostPostRepository.deleteById(id);
    }
}
