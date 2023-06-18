package collections;

import encaps.Facebook;



public class Number {
	class Facebook
	{
		 private String pwd="rash123";

		public String getpwd() {
			// TODO Auto-generated method
			return pwd;
		}
		public void setpwd(String pwd)
		{
			this.pwd=pwd;
		}
	}
	public class Customer2 {
	public static void main(String[]args)
	{
		Facebook f1=new Facebook();
		System.out.println(f1.getpwd());
		f1.setpwd("rahul432");
		System.out.println("new password--> "+ f1.getpwd());
	}
	}

}
