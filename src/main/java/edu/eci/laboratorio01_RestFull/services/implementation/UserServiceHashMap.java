package edu.eci.laboratorio01_RestFull.services.implementation;

import edu.eci.laboratorio01_RestFull.data.User;
import edu.eci.laboratorio01_RestFull.services.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class UserServiceHashMap implements UserService {

    HashMap<String, User> Users = new HashMap<String, User>();
    private AtomicInteger cont = new AtomicInteger(1);

    @Override
    public User create(User user) {
        String newId = generateId().toString();
        user.setId(newId);
        return Users.put(newId, user);
    }

    private Integer generateId() {
        return cont.getAndIncrement();
    }
    @Override
    public User findById(String id) {
        return Users.get(id);
    }

    @Override
    public List<User> all() {
        List<User> allUser = new ArrayList<User>();
        for(User i : Users.values()){
            allUser.add(i);
        }
        return allUser;
    }

    @Override
    public void deleteById(String id) {
        Users.remove(id);
    }

    @Override
    public User update(User user, String userId) {
        user.setId(userId);
        return Users.put(userId,user);
    }
}
