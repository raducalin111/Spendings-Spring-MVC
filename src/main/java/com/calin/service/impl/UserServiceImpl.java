package com.calin.service.impl;

import com.calin.dao.GenericDao;
import com.calin.model.User;
import com.calin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Calin on 6/2/2016.
 */

@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    GenericDao genericDao;

    public User getUserById(Integer id) {
        return genericDao.get(User.class, id);
    }

}
