package org.library.model;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Member {

    // member variables

    private int Id;


    private String login;


    private String firstName;


    private String lastName;


    private String password;


    private String role;


    private String token;


    private String email;


    private Date dateJoin;


    private Date dateConnect;


    private List<Loan> loanList = new ArrayList<>();

    // getters & setters


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateJoin() {
        return dateJoin;
    }

    public void setDateJoin(Date dateJoin) {
        this.dateJoin = dateJoin;
    }

    public Date getDateConnect() {
        return dateConnect;
    }

    public void setDateConnect(Date dateConnect) {
        this.dateConnect = dateConnect;
    }

    public List<Loan> getLoanList() {
        return loanList;
    }

    public void setLoanList(List<Loan> loanList) {
        this.loanList = loanList;
    }

    @Override
    public String toString() {
        return "Member{" +
                "Id=" + Id +
                ", login='" + login + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                ", token='" + token + '\'' +
                ", email='" + email + '\'' +
                ", dateJoin=" + dateJoin +
                ", dateConnect=" + dateConnect +
                ", loanList=" + loanList.size() +
                '}';
    }
}