package com.aypc.structural.proxy4;

import java.util.List;

public interface UserService {

    List<String> getUsers(String country);

    int getAccessCount();
}
