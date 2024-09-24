package com.guilherme.RecWeb1.services;

import com.guilherme.RecWeb1.entities.UserModel;
import com.guilherme.RecWeb1.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Metodo para cadastrar um usuario
    public UserModel cadastrarUsuario(UserModel usuario) {
        usuario.setDataCadastro(LocalDateTime.now());
        return userRepository.save(usuario);
    }

    // Metodo para buscar e listar os usuarios pelo nome
    public List<UserModel> pesquisarUsuariosPorNome(String nome) {
        return userRepository.findByNomeContaining(nome);
    }

}
