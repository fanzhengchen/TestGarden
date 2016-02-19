package com.hcb.dao;

import com.hcb.UserInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


/**
 * Created by mark on 16-2-19.
 */
@Transactional
@Repository
public interface UserDao extends CrudRepository<UserInfo, String> {

//    public UserInfo findById();

    public UserInfo findByPhone(String phone);
}
