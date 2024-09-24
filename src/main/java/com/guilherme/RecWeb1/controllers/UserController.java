package com.guilherme.RecWeb1.controllers;

import com.guilherme.RecWeb1.entities.UserModel;
import com.guilherme.RecWeb1.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/create")
    public ResponseEntity<UserModel> cadastrarUsuario(@RequestBody UserModel usuario) {
        UserModel createdUser = userService.cadastrarUsuario(usuario);
        return ResponseEntity.ok(createdUser);
    }

    @GetMapping("/pesquisa")
    public ResponseEntity<List<UserModel>> pesquisarUsuariosPorNome(@RequestParam String nome) {
        List<UserModel> users = userService.pesquisarUsuariosPorNome(nome);
        return ResponseEntity.ok(users);
    }

}
