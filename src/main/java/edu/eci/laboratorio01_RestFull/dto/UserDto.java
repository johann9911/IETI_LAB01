package edu.eci.laboratorio01_RestFull.dto;

public class UserDto {

    private String name;
    private String lastName;
    private String email;
    private String createdAt;

    public UserDto(String name, String lastName,String email,String createdAt){
       this.name= name;
       this.lastName=lastName;
       this.email=email;
       this.createdAt=createdAt;
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
}
