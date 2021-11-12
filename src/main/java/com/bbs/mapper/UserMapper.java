package com.bbs.mapper;

import java.util.List;

import com.bbs.model.UserDTO;

public interface UserMapper {

	public List<UserDTO> userList();

	public UserDTO userInfo(Long uno);

	public void insert(UserDTO dto);

	public void delete(Long uno);

	public void update(UserDTO dto);

	
}
