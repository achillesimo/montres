package com.lm.users;

public class User {
    String _id;
    String firstname;
    String lastname;
    String email;

    public User() {
    }

    public User(String _id, String firstname, String lastname, String email) {
        this._id = _id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

