package com.Vishwas.feature.user_management.repo;

import com.Vishwas.feature.user_management.entity.UserAccount;
import jakarta.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface UserAccountrepo extends JpaRepository<UserAccount, Integer> {


@Modifying
@Transactional
 @Query("update UserAccount U set U.activeSw=: status where U.userid=: userId")


public void updateUserAccStatus(Integer userId, String status);

}
