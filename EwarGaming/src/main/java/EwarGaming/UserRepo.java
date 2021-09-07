package EwarGaming;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserEntity, String> {
	UserEntity findByUserId(String userid);
}

