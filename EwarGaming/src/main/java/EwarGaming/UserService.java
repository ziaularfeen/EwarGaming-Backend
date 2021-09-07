package EwarGaming;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {
	
	@Autowired
	UserRepo userRepo;
	
	void add(UserEntity userEntity)
	{
		userRepo.save(userEntity);
	}
	
	void retrieve(String id)
	{
		Optional<UserEntity> userEntity=userRepo.findById(id);
		System.out.println(userEntity);
	}

	void delete(String id)
	{
		userRepo.deleteById(id);
	}
	
	
	@Override
	public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
		UserEntity userEntity=userRepo.findByUserId(userId);
		return new UserDetailImplementation(userEntity);
	}
}
