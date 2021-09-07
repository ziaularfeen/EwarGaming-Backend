package EwarGaming;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PartyController {

	@Autowired
	PartyService partyService;
	
	@PostMapping("/createParty")
	public void createparty(@RequestParam Map<String,String> request)
	{
		String adminind=request.get("adminid");
		String title=request.get("title");
		String streamlink=request.get("streamlink");
		String status=request.get("status");
		String chatid=request.get("chatid");
		Long maxusers=Long.parseLong(request.get("maxusers"));
		String invitecode=partyService.createParty(new PartyEntity(adminind, title, streamlink, status, chatid, maxusers));
		System.out.println(invitecode);
	}
	
}
