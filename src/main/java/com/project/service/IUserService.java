package com.project.service;

import com.project.model.User;

public interface IUserService {

    public User findByUsername( String username );

    public void save(User user);

}
