package com.zttc.spring.dao;

import com.zttc.spring.model.Group;
import org.springframework.stereotype.Repository;

/**
 * Created by ¶« on 2016/2/1.
 */
@Repository("groupHibernateDao")
public class GroupHibernateDao extends BaseDao implements  IGroupDao{
    @Override
    public void add(Group group) {
        getSession().save(group);
    }

    @Override
    public Group load(int id) {
        return (Group)getSession().load(GroupHibernateDao.class,id);
    }
}
