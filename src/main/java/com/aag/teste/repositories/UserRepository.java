package com.aag.teste.repositories;

import com.aag.teste.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    /**
     * CRIAR ACESSOS VIA JPQL (TAMBÉM)
     */

}
