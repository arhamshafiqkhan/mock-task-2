package com.arham.mocktask2.controller;

import com.arham.mocktask2.model.User;
import com.arham.mocktask2.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/file")
public class FileController {
    @Autowired
    private FileService service;

    @GetMapping("/{id}")
    public User getDataById(@PathVariable long id) {
        User user = service.getDataById(id);
        return user;
    }
}
