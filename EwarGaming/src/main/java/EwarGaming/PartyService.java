package EwarGaming;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PartyService {
	@Autowired
	PartyRepo partyRepo;
	
	public String createParty(PartyEntity partyEntity)
	{
		partyRepo.save(partyEntity);
		return getinviteCode(partyEntity.getInvitecode());
	}
	public String getinviteCode(String adminid)
	{
		PartyEntity partyEntity=partyRepo.getById(adminid);
		
	return partyEntity.getInvitecode();	
	}
}
