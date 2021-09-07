package EwarGaming;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TransactionController {
	
	@Autowired
	TransactionService transactionService;
	
	@PostMapping("/beginTransaction")
	public void beginTransaction(@RequestParam Map<String,String> request)
	{
		transactionService.addTransaction(request.get("userid"),Double.parseDouble(request.get("amount")) ,request.get("title") );
	}
	
	@PostMapping("/getTransactoin")
	public void retrieveTransaction(@RequestParam String id)
	{
		transactionService.retriveTransaction(id);
	}
}
