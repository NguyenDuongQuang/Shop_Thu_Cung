package vn.devpro.javaweb30.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import vn.devpro.javaweb30.model.User;
@Service
public class UserDetailsServiceJw30 extends BaseService<User> implements UserDetailsService{

	@Override
	public Class<User> clazz() {
		// TODO Auto-generated method stub
		return User.class;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		String sql="SELECT *FROM tbl_user u WHERE u.username='"+
		username + "' and u.status=1";
		
		User user=this.getEntityByNativeSQL(sql);
				
				if(user!=null) {
					return user;
				}
				else {
					return new User();
				}
		
	}
	
	

}
