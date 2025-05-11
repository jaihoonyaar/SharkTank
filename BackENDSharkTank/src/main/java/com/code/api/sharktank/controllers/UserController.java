package com.code.api.sharktank.controllers;

import com.code.api.sharktank.models.User;
import com.code.api.sharktank.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private IUserService userService;
 // LOGIN: Authenticate user
    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody LoginRequest loginRequest) {
        Optional<User> userOptional = userService.getUserByEmail(loginRequest.getEmail());

        if (userOptional.isPresent()) {
            User user = userOptional.get();
            if (user.getPassword().equals(loginRequest.getPassword())) {
                return ResponseEntity.ok(user); // Later you can return a token instead
            }
        }
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid email or password");
    }


    // CREATE: Register a new user
    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody User user) {
        User createdUser = userService.registerUser(user);
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);  // 201 Created
    }

    // READ: Get all users
    @GetMapping("/")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userService.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);  // 200 OK
    }

    // READ: Get a single user by ID
    @GetMapping("/{id}")
    public ResponseEntity<Optional<User>> getUserById(@PathVariable Long id) {
        Optional<User> user = userService.getUserById(id);
        return user.isPresent() 
            ? new ResponseEntity<>(user, HttpStatus.OK)
            : new ResponseEntity<>(HttpStatus.NOT_FOUND);  // 404 Not Found
    }

    // READ: Get user by Email
    @GetMapping("/email/{email}")
    public ResponseEntity<Optional<User>> getUserByEmail(@PathVariable String email) {
        Optional<User> user = userService.getUserByEmail(email);
        return user.isPresent() 
            ? new ResponseEntity<>(user, HttpStatus.OK)
            : new ResponseEntity<>(HttpStatus.NOT_FOUND);  // 404 Not Found
    }

    // UPDATE: Update user by ID
    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User user) {
        User updatedUser = userService.updateUser(id, user);
        return updatedUser != null 
            ? new ResponseEntity<>(updatedUser, HttpStatus.OK)  // 200 OK
            : new ResponseEntity<>(HttpStatus.NOT_FOUND);  // 404 Not Found
    }

    // DELETE: Remove user by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        boolean isDeleted = userService.deleteUser(id);
        return isDeleted
            ? new ResponseEntity<>(HttpStatus.NO_CONTENT)  // 204 No Content
            : new ResponseEntity<>(HttpStatus.NOT_FOUND);  // 404 Not Found
    }
}
