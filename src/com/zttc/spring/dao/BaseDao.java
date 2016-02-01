package com.zttc.spring.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.annotation.Resource;

/**
 * Created by 东 on 2016/2/1.
 */
public class BaseDao {
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    @Resource
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    //    通过此方法进行openSession，只有getCurrentSession（）才能被Spring管理
    public Session getSession(){
        return sessionFactory.getCurrentSession();
    }
}
