package service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.UserAccount;
import repo.UserAccountrepo;

@Service
public class UserAccountServiceImpl implements UserAccountService {
	
	@Autowired
	private UserAccountrepo useraccrepo;

	@Override
	public String saveOrUpdateAcc(UserAccount userAcc) {
		Integer userid = userAcc.getUserid();
		// Insert or update the record
		useraccrepo.save(userAcc);

		if (userid == null) {
			return "User record saved";
		} else {
			return "User record updated";
		}

	}

	// to retrieve all record from table in object
	@Override
	public List<UserAccount> getAllUserAccounts() {
		return useraccrepo.findAll();
	}

	@Override
	public UserAccount getUserAcc(Integer userId) {
		Optional<UserAccount> findbyid = useraccrepo.findById(userId);
		if (findbyid.isPresent()) {
			return findbyid.get();
		}
		return null;

	}

	@Override
	public boolean deleteUserAcc(Integer userId) { 
      boolean existsbyid = useraccrepo.existsById(userId);
	   if(existsbyid==true) 
	   {
		   useraccrepo.deleteById(userId);
		   return true;
	   }
      
      return false;
	}

	@Override
	public boolean updateUserAccStatus(Integer userId, String Status) {
		// Custom Query Execute hui hai yaha..
		try {
			useraccrepo.updateUserAccStatus(userId, Status);
			return true;
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return false;
		
		
	}
}


















