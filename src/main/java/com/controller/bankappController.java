package com.controller;
import java.io.IOException;
import java.util.regex.Pattern;
import com.model.bankappModel;

public class bankappController {

	public boolean checkCustomerName(bankappModel bm) throws IOException{
		String customerName=bm.getCustomerName();
		if(Pattern.matches("[a-zA-Z]{8,18}", customerName))
		{
		return true;
		}
		else {
			throw new IOException("customer can only enter alphabets and digits");
		}
	}
		public boolean checkAccountPassword(bankappModel bm) throws IOException{
			String accPassword=bm.getAccPassword();
			if(Pattern.matches("[a-zA-Z0-9]{6,}", accPassword))
			{
			return true;
			}
			else {
				throw new IOException("password is of six digits only");
			}
			
	}

public boolean checkDeposit(bankappModel bm, String pwd) throws IOException{
	String password=bm.getAccPassword();
	if(password.equals(pwd))
	{
		return true;
	}
	else {
		throw new IOException("password not matched");
	}
}	

public boolean checkWithdraw(bankappModel bm,String pwd,int amount) throws IOException{
	{
		String password=bm.getAccPassword();
		int accbalance=bm.getAccBalance();
		if(password.equals(pwd))
		{
			if(accbalance>amount) {
				return true;
			}
			else {
				throw new IOException("low balance");
			}
		}
		else {
			throw new IOException("password not matched");
		}
	}






}
}
