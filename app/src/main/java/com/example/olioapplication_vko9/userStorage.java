package com.example.olioapplication_vko9;
import java.util.ArrayList;

public class userStorage {
    ArrayList<User> userArrayList = new ArrayList<User>();
    private static userStorage storage = null;
    private userStorage(){}
    public static userStorage getInstance(){
        if(storage == null){
            storage = new userStorage();}
        return storage;}
    public void addUsers(User user){userArrayList.add(user);}
    public ArrayList<User> getMyArrayList() {
        return userArrayList;
    }
    public void deleteUser(int id){
        userArrayList.remove(id);
    }
}
