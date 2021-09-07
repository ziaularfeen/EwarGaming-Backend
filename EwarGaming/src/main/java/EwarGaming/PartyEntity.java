package EwarGaming;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class PartyEntity {


	@GeneratedValue(strategy = GenerationType.AUTO)
	Long partyid;
	@Id
	String adminid;
	String title;
	String streamlink;
	String status;
	String chatid;
	Long maxusers;
	@OneToMany
	List<UserEntity> joinedusers;

	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(updatable = false, nullable = false)
	String invitecode;

	public PartyEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PartyEntity(String adminid, String title, String streamlink, String status,
			String chatid, Long maxusers) {
		super();
		this.adminid = adminid;
		this.title = title;
		this.streamlink = streamlink;
		this.status = status;
		this.chatid = chatid;
		this.maxusers = maxusers;
	}
	public Long getPartyid() {
		return partyid;
	}
	public void setPartyid(Long partyid) {
		this.partyid = partyid;
	}
	public String getAdminid() {
		return adminid;
	}
	public void setAdminid(String adminid) {
		this.adminid = adminid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getInvitecode() {
		return invitecode;
	}
	public void setInvitecode(String invitecode) {
		this.invitecode = invitecode;
	}
	public String getStreamlink() {
		return streamlink;
	}
	public void setStreamlink(String streamlink) {
		this.streamlink = streamlink;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getChatid() {
		return chatid;
	}
	public void setChatid(String chatid) {
		this.chatid = chatid;
	}
	public Long getMaxusers() {
		return maxusers;
	}
	public void setMaxusers(Long maxusers) {
		this.maxusers = maxusers;
	}
	public List<UserEntity> getJoinedusers() {
		return joinedusers;
	}
	public void setJoinedusers(List<UserEntity> joinedusers) {
		this.joinedusers = joinedusers;
	}


}
