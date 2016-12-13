package com.cgi.lms.payment.views;

import java.util.Scanner;

import com.cgi.lms.payment.constants.StatusConstants;
import com.cgi.lms.payment.dto.LoginDTO;
import com.cgi.lms.payment.dto.MessageDTO;
import com.cgi.lms.payment.helper.LoginHelper;

/*
 * Input and Output Stuff 
 */
public class LoginView {
	
	public static void main(String[] args) {
		LoginView view =new LoginView();
		view.takeInput();
	}
	
	public void takeInput(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Userid");
		String userid = scanner.next();
		System.out.println("Enter the Password");
		String password = scanner.next();
		LoginDTO loginDTO = new LoginDTO();
		loginDTO.setUserid(userid);
		loginDTO.setPassword(password);
		LoginHelper helper = new LoginHelper();
		MessageDTO messageDTO = helper.validateUser(loginDTO);
		if(messageDTO!=null){
			//StatusConstants s = new StatusConstants();
			if(messageDTO.getStatus().equals(StatusConstants.VALIDATION_FAIL)){
				System.err.println("Validation Fail");
				System.out.println(messageDTO.getMessage());
			}
			else
			if(messageDTO.getStatus().equals(StatusConstants.SUCCESS)){
				System.out.println(messageDTO.getMessage());
			}
			else
			if(messageDTO.getStatus().equals(StatusConstants.DB_FAIL)){
				System.err.println(messageDTO.getMessage());
			}
		}
		scanner.close();
	
	}

}
