package com.zttc.spring.dao;

import com.zttc.spring.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ¶« on 2016/2/1.
 */
@Repository("userHibernateDao")
public class UserHibernateDao extends BaseDao implements IUserDao {


    @Override
    public void add(User user, int groupid) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public User load(int id) {
        return null;
    }

    @Override
    public List<User> list() {
        return null;
    }
}
