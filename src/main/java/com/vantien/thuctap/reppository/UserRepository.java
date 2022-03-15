package com.vantien.thuctap.reppository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vantien.thuctap.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	 List<User> findByNameContaining(String q);
}
