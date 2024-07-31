package com.Whatsapp.view;

import java.util.Scanner;

import com.Whatsapp.controller.WhastsappContollerInterface;
import com.Whatsapp.controller.WhatsappController;

public class WhatsappView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("*******LOGIN PAGE*******" );
     
     System.out.println("Press 1 to Enter Login Details");
     System.out.println("Press 2 to Enter Name");
     System.out.println("Press 3 to Enter Email");
     System.out.println("Press 4 to login to profile");
     
     Scanner sc = new Scanner(System.in);
     
     int m=sc.nextInt();
     
     WhastsappContollerInterface wc=new WhatsappController();
     
     switch(m) {
     case 1:
    	 wc.LoginDetailsController();
    	 break;
     case 2:
    	 wc.EnterNameController();
    	 break;
     case 3:
    	 wc.EnterEmailController();
    	 break;
     case 4:
    	 wc.LoginToProfileController();
    	 break;
     }
     
	}

}
