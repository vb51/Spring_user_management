package repo;

import entity.UserAccount;
import jakarta.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface UserAccountrepo extends JpaRepository<UserAccount, Integer> {


@Modifying
@Transactional
 @Query("update UserAccount set activeSw=: status when userId=: userId")


public void updateUserAccStatus(Integer userId, String status);

}
