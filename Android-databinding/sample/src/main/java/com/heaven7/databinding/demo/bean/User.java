package com.heaven7.databinding.demo.bean;

/**
 * Created by heaven7 on 2015/11/5.
 */
public class User {

    private String username ;
    private boolean male ;       //man or woman

    private String nickname ;

    public User(String username, boolean male) {
        this.username = username;
        this.male = male;
    }

    public User(String username, boolean male, String nickname) {
        this.username = username;
        this.male = male;
        this.nickname = nickname;
    }

    public String getNickname(){
        return nickname;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
