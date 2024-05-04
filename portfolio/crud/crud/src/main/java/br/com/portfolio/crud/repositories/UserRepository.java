package br.com.portfolio.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.portfolio.crud.entites.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
