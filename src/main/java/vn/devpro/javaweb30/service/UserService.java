package vn.devpro.javaweb30.service;

import org.springframework.stereotype.Service;

import vn.devpro.javaweb30.model.User;

@Service
public class UserService extends BaseService<User> {

	@Override
	public Class<User> clazz() {
		// TODO Auto-generated method stub
		return User.class;
	}

}
