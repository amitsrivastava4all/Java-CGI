package com.cgi.lms.payment.helper;

import com.cgi.lms.payment.constants.StatusConstants;
import com.cgi.lms.payment.dao.LoginDAO;
import com.cgi.lms.payment.dto.LoginDTO;
import com.cgi.lms.payment.dto.MessageDTO;

/*
 * Contain the Logic Stuff
 */
public class LoginHelper {
	
	public MessageDTO validateUser(LoginDTO loginDTO){
		MessageDTO messageDTO = null;
		if(loginDTO.getUserid()!=null && 
				loginDTO.getUserid().trim().length()<4){
		messageDTO = new MessageDTO();
		messageDTO.setStatus(StatusConstants.VALIDATION_FAIL);
		messageDTO.setMessage("Userid can't be less than 5");
		return messageDTO;
		}
		LoginDAO dao = new LoginDAO();
		if(dao.isUserExist(loginDTO)){
			messageDTO = new MessageDTO();
			messageDTO.setStatus(StatusConstants.SUCCESS);
			messageDTO.setMessage("Welcome "+loginDTO.getUserid());
		}
		else
		{
			messageDTO = new MessageDTO();
			messageDTO.setStatus(StatusConstants.DB_FAIL);
			messageDTO.setMessage("Invalid Userid or Password "+loginDTO.getUserid());
		}
		return messageDTO;
			
	}

}
