package com.example.springjdbc.controller;

import com.example.springjdbc.entity.User;
import com.example.springjdbc.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping
    public String add(@RequestBody User user) {
        return userService.add(user) > 0 ? "ok" : "fail";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        return userService.delete(id) > 0 ? "ok" : "fail";
    }

    @PutMapping
    public String update(@RequestBody User user) {
        return userService.update(user) > 0 ? "ok" : "fail";
    }

    @GetMapping("/list")
    public List<Map<String, Object>> list() {
        return userService.getList();
    }

}
