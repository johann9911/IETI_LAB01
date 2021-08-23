package edu.eci.laboratorio01_RestFull.data;

public class User {

    private String id=null;
    private String name;
    private String lastName;
    private String email;
    private String createdAt;

    public User(String name, String lastName, String email, String createdAt){
        this.name= name;
        this.lastName=lastName;
        this.email=email;
        this.createdAt=createdAt;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getId() {
        return id;
    }

}
