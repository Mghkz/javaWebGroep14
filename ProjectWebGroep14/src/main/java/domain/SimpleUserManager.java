/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Jeroen
 */
public class SimpleUserManager implements UserManager{

    private List<User> users;

    public SimpleUserManager() {
        users = new LinkedList<>();
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    
    @Override
    public List<User> getItems() {
        return users;
    }

}
