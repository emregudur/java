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
	
	
	public int login(String logUserName, String logPass){
		if(this.userName.equals(logUserName) && this.pass.equals(logPass)){
			System.out.println("Merhaba "+ this.name + " " +this.surName);
			System.out.println("Oturum süreniz: "+ this.acountMsSleep/1000 + " saniye");
			this.online=true;
			return 1;
		}else{
			System.out.println("giriş başarısız");
			return 0;
		}
	}
	
	public user(String name, String surname, String username, String pass, int tc, int acountMsSleep){
		this.name=name;
		this.surName=surname;
		this.userName=username;
		this.pass=pass;
		this.tc=tc;
	}
	
	public user(){//overloading
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
	public void startLoginSec(int ms) throws InterruptedException{
		while(ms>0){
			ms-=1000;
			Thread.sleep(1000);
			System.out.println(ms/1000+" Saniye kaldı!");
		}
		this.cikis();
	}
	public void cikis(){
		this.online=false;
		System.out.println("Çıkış yapıldı.");
	}
}
