package edu.eci.laboratorio01_RestFull.services;

import edu.eci.laboratorio01_RestFull.data.User;

import java.util.List;

public interface UserService {

    User create(User user);

    User findById( String id);

    List<User> all();

    void deleteById(String id);

    User update(User user, String userId);

}
