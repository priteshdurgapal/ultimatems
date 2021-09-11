package com.prit.ultimatems.mapper;

import com.prit.ultimatems.dto.User;
import com.prit.ultimatems.model.UserEntity;

public class UserMapper {

	public static User constructFromUserEntity(UserEntity userEntity) {
		User user = new User();
		user.setAddress(userEntity.getAddress());
		user.setAge(userEntity.getAge());
		user.setContactNumber(userEntity.getContactNumber());
		user.setEmailId(userEntity.getEmailId());
		user.setId(userEntity.getId());
		user.setName(userEntity.getName());
		return user;
	}
}
