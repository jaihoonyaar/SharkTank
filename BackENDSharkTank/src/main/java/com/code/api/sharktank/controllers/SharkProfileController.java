package com.code.api.sharktank.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.code.api.sharktank.models.SharkProfile;
import com.code.api.sharktank.services.ISharkProfileService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/sharks")
@CrossOrigin(origins = "*")
public class SharkProfileController {

    @Autowired
    private ISharkProfileService sharkService;

    @PostMapping("/register")
    public SharkProfile registerShark(@RequestBody SharkProfile shark) {
        return sharkService.registerShark(shark);
    }

    @GetMapping("/{id}")
    public Optional<SharkProfile> getSharkById(@PathVariable Long id) {
        return sharkService.getById(id);
    }

    @GetMapping
    public List<SharkProfile> getAllSharks() {
        return sharkService.getAllSharks();
    }

    @DeleteMapping("/{id}")
    public void deleteShark(@PathVariable Long id) {
        sharkService.deleteShark(id);
    }
}
