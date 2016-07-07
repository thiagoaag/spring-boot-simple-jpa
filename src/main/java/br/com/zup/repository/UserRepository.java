package br.com.zup.repository;

import br.com.zup.domain.User;
import org.javers.spring.annotation.JaversSpringDataAuditable;
import org.springframework.data.repository.CrudRepository;

@JaversSpringDataAuditable
public interface UserRepository extends CrudRepository<User, Long> {} 
