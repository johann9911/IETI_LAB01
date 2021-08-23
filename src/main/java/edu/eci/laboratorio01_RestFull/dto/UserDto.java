package edu.eci.laboratorio01_RestFull.dto;

public class UserDto {

    private String name;
    private String lasName;
    private String email;
    private String createdAt;

    public UserDto(String name, String lasName,String email,String createdAt){
       this.name= name;
       this.lasName=lasName;
       this.email=email;
       this.createdAt=createdAt;
    }

    public String getName() {
        return name;
    }

    public String getLasName() {
        return lasName;
    }

    public String getEmail() {
        return email;
    }

    public String getCreatedAt() {
        return createdAt;
    }
}
