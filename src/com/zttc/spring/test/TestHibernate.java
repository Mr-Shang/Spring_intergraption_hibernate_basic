package com.zttc.spring.test;

import com.zttc.spring.dao.IGroupDao;
import com.zttc.spring.dao.IUserDao;
import com.zttc.spring.model.Group;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by �� on 2016/2/1.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/beans.xml")
public class TestHibernate {
    @Resource
    private IUserDao userHibernateDao;
    @Resource
    private IGroupDao groupHibernateDao;

    @Test
    public void add(){
        Group group=new Group();
        group.setName("发改委");
        groupHibernateDao.add(group);
    }


}
