package EwarGaming;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@PostMapping("/login")
	void signin(@RequestParam Map<String,String> request)
	{
		userService.retrieve(request.get("id"));
	}
	@GetMapping("/signup")
	void signup(@RequestParam Map<String,String> request)
	{
		String userid=request.get("userid");
		String name=request.get("name");
		String password=request.get("password");
		Long phone=Long.parseLong(request.get("phone"));
		byte[] pic=request.get("pic").getBytes();
		
		userService.add(new UserEntity(userid,password,name,phone,pic));
		
	}
	
	@PostMapping("/deleteUser")
	void delete(@RequestParam String userid)
	{
		userService.delete(userid);
	}
	

}
