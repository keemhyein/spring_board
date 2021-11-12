package com.bbs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bbs.mapper.UserMapper;
import com.bbs.model.UserDTO;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper mapper;
	
	@Override
	public List<UserDTO> userList() {
		return mapper.userList();
	}

	@Override
	public UserDTO userInfo(Long uno) {
		return mapper.userInfo(uno);
	}

	@Override
	public void insert(UserDTO dto) {
		mapper.insert(dto);
	}

	@Override
	public void delete(Long uno) {
		mapper.delete(uno);		
	}

	@Override
	public void update(UserDTO dto) {
		mapper.update(dto);
	}

}
