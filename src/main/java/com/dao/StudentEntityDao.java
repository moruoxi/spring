package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentEntityDao {
    @Autowired
    HibernateTemplate hibernateTemplate;

    public void insert(HibernateTemplate hibernateTemplate) {

    }
}
