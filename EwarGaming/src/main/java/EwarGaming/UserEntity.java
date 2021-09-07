package EwarGaming;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserEntity {

	@Id
	String userId;
	String name;



	byte[] profilepic;
	String password;

	
	Long phone;
	
	public UserEntity() {
		super();
		// TODO Auto-generated constructor stub
	}


	public UserEntity(String id, String password, String name, Long phone, byte[] profilepic) {
		super();
		this.userId = id;
		this.name = name;
		this.phone = phone;
		this.profilepic = profilepic;
		this.password = password;
	}


	public String getId() {
		return userId;
	}

	public void setId(String id) {
		this.userId = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public byte[] getProfilepic() {
		return profilepic;
	}

	public void setProfilepic(byte[] profilepic) {
		this.profilepic = profilepic;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
