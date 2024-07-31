package com.Whatsapp.controller;

import java.util.Scanner;

import com.Whatsapp.entity.WhatsappUser;
import com.Whatsapp.service.WhatsappSerivceInteface;
import com.Whatsapp.service.WhatsappService;

public class WhatsappController implements WhastsappContollerInterface {


	@Override
	public void LoginDetailsController() {
		// TODO Auto-generated method stub
		System.out.println("Enter Mobile Number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("Enter Name");
		String name=sc.next();
		System.out.println("Enter Email");
		String mail=sc.next();
		
		WhatsappUser wu=new WhatsappUser();
       wu.setNum(num);
       wu.setName(name);
       wu.setMail(mail);
       
       WhatsappSerivceInteface ws=new WhatsappService();
       
       ws.CreateProfile(wu);
		
	}

	@Override
	public void EnterNameController() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void EnterEmailController() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void LoginToProfileController() {
		// TODO Auto-generated method stub
		
	}

}
