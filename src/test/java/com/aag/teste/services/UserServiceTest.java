package com.aag.teste.services;

import com.aag.teste.dto.UserDTO;
import com.aag.teste.entities.User;
import com.aag.teste.repositories.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.modelmapper.ModelMapper;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

@ExtendWith(SpringExtension.class)
public class UserServiceTest {

    @InjectMocks
    private UserSerive userSerive;
    @Mock
    private UserRepository userRepository;
    @Mock
    private ModelMapper modelMapper;
    @Mock
    private UserDTO dto;
    @Mock
    private User user;

    private Long id;
    @BeforeEach
    void setUp() {
        user = new User();
        dto = new UserDTO();
        id = 1L;

        Mockito.when(modelMapper.map(UserDTO.class, User.class)).thenReturn(user);
        Mockito.when(modelMapper.map(User.class, UserDTO.class)).thenReturn(dto);
        Mockito.when(userRepository.findById(id)).thenReturn(Optional.of(user));
    }


    @Test
    void salvarUsuarioComSucesso() {
       UserDTO dto = (userSerive.getId(id));
        Assertions.assertNotNull(dto);
    }

}
