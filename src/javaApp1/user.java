package javaApp1;

public class user {
	private String name;
	private String surName;
	private String userName;
	private String pass;
	private String acountCreateDate;
	private boolean online;
	private int tc;
	private int tel;
	private int acountMsSleep;
	public void yazdýr(){
		System.out.println("Merhaba "+ this.name+ " " +this.surName);
		System.out.println("Oturum süreniz: "+ this.acountMsSleep + " Milisaniye");
	}
	public int login(String logUserName, String logPass){
		if(this.userName.equals(logUserName) && this.pass.equals(logPass)){
			return 1;	
		}else{
			return 0;
		}
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	} 
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getAcountCreateDate() {
		return acountCreateDate;
	}
	public void setAcountCreateDate(String acountCreateDate) {
		this.acountCreateDate = acountCreateDate;
	}
	public boolean isOnline() {
		return online;
	}
	public void setOnline(boolean online) {
		this.online = online;
	}
	public int getTc() {
		return tc;
	}
	public void setTc(int tc) {
		this.tc = tc;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public int getAcountMsSleep() {
		return acountMsSleep;
	}
	public void setAcountMsSleep(int acountMsSleep) {
		this.acountMsSleep = acountMsSleep;
	}
}
