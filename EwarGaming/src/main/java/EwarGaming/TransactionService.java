package EwarGaming;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {
	
	@Autowired
	TransactionRepo transactionRepo;
	@Autowired
	UserRepo userRepo;
	
	void addTransaction(String userid,Double amount,String title)
	{
		UserEntity userEntity=userRepo.getById(userid);
		
		transactionRepo.save(new TransactionEntity(amount, userEntity, title));
	}
	
	void retriveTransaction(String tid)
	{
		transactionRepo.getById(tid);
	}

}
