package vn.devpro.javaweb30.service;

import org.springframework.stereotype.Service;

import vn.devpro.javaweb30.model.Role;

@Service
public class RoleService extends BaseService<Role>{

	@Override
	public Class<Role> clazz() {
		// TODO Auto-generated method stub
		return Role.class;
	}
	
}
