package business.concretes;


import java.util.Scanner;

import business.abstracts.ConfirmationService;

public class ConfirmationManager implements ConfirmationService {

	@Override
	public void message(String receiver, String message) {
		int i=1;
		while(i==1) {
			System.out.println("L�TFEN E-MA�L�N�Z� G�R�N�Z");
			System.out.println("MA�L:" + receiver);
			
			System.out.println("ONAY KODU: " + message);
       
		Scanner input = new Scanner(System.in);
		System.out.println("L�TFEN E-MAL�N�ZE G�NDER�LEN DO�RULAMA KODUNU G�R�N�Z");
		String confirmCode = input.next();
		
		if(confirmCode.equals("123")) {
			System.out.println("*************HESABINIZ ONAYLANDI*************");
			i++;
		} else {
			System.err.println("G�R�LEN KOD YANLI� HESABINIZ ONAYLANMADI");
		}
		  
	}
	
	}
	
}

