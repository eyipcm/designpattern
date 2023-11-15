package com.aypc.structural.proxy4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserServiceImpl implements UserService {
//    private final Map<String, List<String>> users = ImmutableMap.of("us", Lists.newArrayList("user1", "user2"),
//                                                                    "en", Lists.newArrayList("user3", "user4", "user5"));

    private Map<String, List<String>> users;
    private int count;

    public UserServiceImpl() {
        users = new HashMap<>();
        List<String> list1 = new ArrayList<>();
        list1.add("user1");
        list1.add("user2");
        List<String> list2 = new ArrayList<>();
        list2.add("user3");
        list2.add("user4");
        list2.add("user5");
        users.put("us", list1);
        users.put("en", list2);
    }

    @Override
    public List<String> getUsers(String country) {
        count++;
        return users.get(country);
    }

    @Override
    public int getAccessCount() {
        return count;
    }
}
