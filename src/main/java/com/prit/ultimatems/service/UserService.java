package com.prit.ultimatems.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prit.ultimatems.dto.User;
import com.prit.ultimatems.mapper.UserMapper;
import com.prit.ultimatems.model.UserEntity;
import com.prit.ultimatems.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public User addUser(User userRequest) {
		
		UserEntity userEntity  = new UserEntity();
		userEntity.setAddress(userRequest.getAddress());
		userEntity.setAge(userRequest.getAge());
		userEntity.setContactNumber(userRequest.getContactNumber());
		userEntity.setName(userRequest.getName());
		userEntity.setEmailId(userRequest.getEmailId());
		userRepository.save(userEntity);
		return UserMapper.constructFromUserEntity(userEntity);
	}
}
