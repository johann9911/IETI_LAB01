package edu.eci.laboratorio01_RestFull.controller;

import edu.eci.laboratorio01_RestFull.data.User;
import edu.eci.laboratorio01_RestFull.dto.UserDto;
import edu.eci.laboratorio01_RestFull.mapper.MapperClasses;
import edu.eci.laboratorio01_RestFull.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/user")
public class UserController {

    private final UserService userService;

    public UserController(@Autowired UserService userService){
        this.userService=userService;
    }

    @GetMapping
    public ResponseEntity<List<User>> all(){
        return ResponseEntity.status(HttpStatus.OK).body(userService.all());
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable String id){
        return ResponseEntity.status(HttpStatus.OK).body(userService.findById(id));
    }

    @PostMapping
    public ResponseEntity<User> create(@RequestBody UserDto userDto){
        return ResponseEntity.status(HttpStatus.OK).body(userService.create(MapperClasses.toUser(userDto)));
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> create(@PathVariable String id, @RequestBody UserDto userDto){
        return ResponseEntity.status(HttpStatus.OK).body(userService.update(MapperClasses.toUser(userDto),id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> create(@PathVariable String id){
        userService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).body(true);
    }
}
