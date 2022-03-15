package com.vantien.thuctap.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vantien.thuctap.model.User;
import com.vantien.thuctap.reppository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
    private UserRepository userRepository;
    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
    @Override
    public List<User> search(String q) {
        return userRepository.findByNameContaining(q);
    }
    @Override
    public User findOne(long id) {
        return userRepository.getById(id);
    }
    @Override
    public void save(User user) {
    	userRepository.save(user);
    }
    @Override
    public void delete(User user) {
    	userRepository.delete(user);
    }
}
