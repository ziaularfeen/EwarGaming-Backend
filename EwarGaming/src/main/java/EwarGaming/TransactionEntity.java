package EwarGaming;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class TransactionEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long tid;
	
	Double amount;
	@ManyToOne
	UserEntity userid;
	String title;
	public TransactionEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TransactionEntity(Double amount, UserEntity userid, String title) {
		super();
		this.amount = amount;
		this.userid = userid;
		this.title = title;
	}
	public Long getTid() {
		return tid;
	}
	public void setTid(Long tid) {
		this.tid = tid;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public UserEntity getUserid() {
		return userid;
	}
	public void setUserid(UserEntity userid) {
		this.userid = userid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
