package com.bhushan.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bhushan.model.Signup;

@Repository
public interface SignupRepository extends CrudRepository<Signup, Long> {

	Optional<Signup> findByEmail(String email);

	
}
