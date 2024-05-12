package com.Vishwas.feature.user_management.service;

import java.util.List;

import com.Vishwas.feature.user_management.entity.UserAccount;
import org.springframework.stereotype.*;

@Service
public interface UserAccountService {
	
	// method required to develop this first application in comes under service class

    public String saveOrUpdateAcc(UserAccount userAcc);  // Save data

    public List <UserAccount> getAllUserAccounts();  // Retrieve all user data in UI and show it in the list

    public UserAccount getUserAcc(Integer userId);  // When user click on the edit then it must show the information

    public boolean deleteUserAcc(Integer userId);  // when user delete user permanently

    public boolean updateUserAccStatus(Integer userId, String Status); // Activate and deactivate user





}
