package cn.edu.sjtu.se.dclab.server.service.impl;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import cn.edu.sjtu.se.dclab.server.service.UserService;

/**
 *2015年1月19日 下午9:44:00
 *@author changyi yuan
 */
public class UserServiceImpl implements UserService {

	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		return null;
	}

}
