package com.zttc.spring.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.annotation.Resource;

/**
 * Created by �� on 2016/2/1.
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

    //    ͨ���˷�������openSession��ֻ��getCurrentSession�������ܱ�Spring����
    public Session getSession(){
        return sessionFactory.getCurrentSession();
    }
}
