package edu.eci.laboratorio01_RestFull.data;

public class User {

    private String id=null;
    private String name;
    private String lasName;
    private String email;
    private String createdAt;

    public User(String name, String lasName, String email, String createdAt){
        this.name= name;
        this.lasName=lasName;
        this.email=email;
        this.createdAt=createdAt;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
