package com.aag.teste.services;

import com.aag.teste.dto.UserDTO;
import com.aag.teste.entities.User;
import com.aag.teste.repositories.UserRepository;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserSerive {
    Logger logger = LoggerFactory.getLogger(UserSerive.class);

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;

    public void save(UserDTO userDTO) {
        logger.info("Salvando usuario {}", userDTO.getEmail());
        User user = modelMapper.map(userDTO, User.class);
        userRepository.save(user);
    }

    public UserDTO getId(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));

        return modelMapper.map(user, UserDTO.class);
    }
}
