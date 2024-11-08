package vn.devpro.javaweb30.configurer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import vn.devpro.javaweb30.service.UserDetailsServiceJw30;

@Configuration
@EnableWebSecurity
public class SecureConfigurer extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.csrf().disable().authorizeRequests()
		.antMatchers("/frontend/**","backend/**","/UploadFiles/**","/login","/logout").permitAll()
		
		.antMatchers("/admin/**").hasAuthority("ADMIN")
		
		.and()
		 // Neu chua login (xac thuc) thi redirect den trang login
		 // Voi "/login" la 1 request (trong LoginController)
		 .formLogin().loginPage("/login") . loginProcessingUrl("/login_processing_url")

		 .defaultSuccessUrl("/admin/home/view", true) //login thanh cong thi vao trang home
		 
		 // Login thanh cong: Chuyen den request phu hop voi role step 3
		 //.successHandler(new UrlAuthenticationSuccessHandler())
		 // Login khong thanh cong 
		 .failureUrl("/login?login_error=true")
		// Cau hinh phan logout
		.and()
		.logout().logoutUrl("/logout").logoutSuccessUrl("/login")
		.invalidateHttpSession(true)
		.deleteCookies("JSESSIONID");
	}
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{
		auth.userDetailsService(userDetailsService).passwordEncoder(new BCryptPasswordEncoder(4));
	}
	
	@Autowired
	private UserDetailsServiceJw30 userDetailsService;

	
	
	
}