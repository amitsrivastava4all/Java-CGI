package com.cgi.lms.payment.dao;

import com.cgi.lms.payment.dto.LoginDTO;

/*
 * DAO 
 * Data Access Object
 * DB Related Code
 */
public class LoginDAO {
	
	private LoginDTO[] prepareDB(){
		//int x[] = new int[3];
		LoginDTO array[] = new LoginDTO[3];
		array[0] = new LoginDTO();
		array[0].setUserid("amit");
		array[0].setPassword("123");
		array[1] = new LoginDTO();
		array[1].setUserid("ram");
		array[1].setPassword("123");
		array[2] = new LoginDTO();
		array[2].setUserid("mike");
		array[2].setPassword("123");
		return array;
	}
	
	public boolean isUserExist(LoginDTO loginDTO){
		LoginDTO array [] = this.prepareDB();
		
		for(LoginDTO user : array){
		//for(int i = 0 ; i<array.length; i++){
			if(user.getUserid().equals(loginDTO.getUserid()) &&
					user.getPassword().equals(loginDTO.getPassword())){
			//if(array[i].getUserid().equals(loginDTO.getUserid())
				//	&& 
				//	array[i].getPassword()
				//	.equals(loginDTO.getPassword())){
				return true;
			}
		}
		return false;
	}

}
