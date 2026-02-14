package com.impact.lesson20.store;

import com.impact.lesson20.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

public class UserStore {
    private final Map<Long, User> users = new ConcurrentHashMap<>();
    private final AtomicLong idGenerator = new AtomicLong(1);

    public User save(User user) {
        long id = idGenerator.getAndIncrement();
        user.setId(id);
        users.put(id, user);
        return user;
    }
    public List<User> findAll() {
        return new ArrayList<>(users.values());
    }
}
