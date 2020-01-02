package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.User;

@Mapper
public interface RegisterMapper {
	
	public User selectUserByUsername(String username);
	public User selectUserByPassword(String password);
	public int insertUser(User user);
	public int login(User user);
}
