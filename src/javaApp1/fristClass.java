package javaApp1;

import java.util.Locale;
import java.util.Scanner;

public class fristClass {
	public static String moneyToWord(int data){
		String[] birler={"","bir","iki","��","d�rt","be�","alt�","yedi","sekiz","dokuz"};
		String[] onlar={"","on","yirmi","otuz","k�rk","elli","atm��","yetmi�","seksen","doksan"};
		String yuzler="y�z";
		
		String birlerBasamagiText = birler[data%10]; 
		String onlarBasamagiText = onlar[data%100/10]; 
		String yuzlerBasamagiText;
		if(data%1000/100 == 1){
			yuzlerBasamagiText = yuzler; 
		}else{
			yuzlerBasamagiText = birler[data%1000/100] + yuzler; 
		}
		
		String allText = yuzlerBasamagiText + " " + onlarBasamagiText + " " + birlerBasamagiText;
		
		return allText;
	}
	public static void main (String[] args) throws InterruptedException{
		/*
		 * ders 1************************************************************
		int a=1;
		long b=65536;
		double c=3.14;
		char d='A';
		String yazi="merhaba d�nya";
		System.out.println(a+ "," + b + ","  +c + "," + d+ ","  +yazi);
		 */
		
		
		/*
		 * ders 2************************************************************
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);//girilecek say�n�n format� 3.14=do�ru 3,14=yanl��
		
		String[] birler={"","bir","iki","��","d�rt","be�","alt�","yedi","sekiz","dokuz"};
		String[] onlar={"","on","yirmi","otuz","k�rk","elli","atm��","yetmi�","seksen","doksan"};
		String yuzler="y�z";
		
		
		System.out.println("Say� gir(3 basamakl�):");
		int a = scan.nextInt();
		
		String birlerBasamagiText = birler[a%10]; 
		String onlarBasamagiText = onlar[a%100/10]; 
		String yuzlerBasamagiText;
		if(a%1000/100 == 1){
			yuzlerBasamagiText = yuzler; 
		}else{
			yuzlerBasamagiText = birler[a%1000/100] + yuzler; 
		}
		
		String allText = yuzlerBasamagiText + " " + onlarBasamagiText + " " + birlerBasamagiText;
		
		System.out.println(allText);
		*/
		
		/*
		 * tek kullan�c�l� sisteme giri� mod�l�
		String userName="emre";
		String pass="emre123";
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Kullan�c� ad�n� gir:");
		String userNameIns=scan.nextLine();
		System.out.println("�ife:");
		String userPassIns=scan.nextLine();
		
		
		if(!(userName.equals(userNameIns)) && !(pass.equals(userPassIns))){
			System.out.println("kullan�c� ad� ve �ifre yanl��!");
		}else if(!(userName.equals(userNameIns)) && (pass.equals(userPassIns))){
			System.out.println("kullan�c� ad� yanl��:"+userNameIns);
		}else if((userName.equals(userNameIns)) && !(pass.equals(userPassIns))){
			System.out.println("�ifre yanl��"+userPassIns);
		}else{
			System.out.println("giri� yap�ld�!");
		}
		*/
		/*
		//Very basic ATM app xd
		String[] birler={"","bir","iki","��","d�rt","be�","alt�","yedi","sekiz","dokuz"};
		String[] onlar={"","on","yirmi","otuz","k�rk","elli","atm��","yetmi�","seksen","doksan"};
		String yuzler="y�z";
		int bakiye=99;
		short islem=0;
		scan = new Scanner(System.in);
		
		System.out.println("1: Bakiye g�r�nt�le");
		System.out.println("2: Para �ek");
		System.out.println("3: Para yat�r");
		System.out.println("4: ��k��");
	
		islem=scan.nextShort();
		
		switch(islem){
			default:
				System.out.println("Tan�ms�z i�lem!!");
				break;
			case 1:
				String birlerBasamagiText = birler[bakiye%10]; 
				String onlarBasamagiText = onlar[bakiye%100/10]; 
				String yuzlerBasamagiText;
				if(bakiye%1000/100 == 1){
					yuzlerBasamagiText = yuzler; 
				}else{
					yuzlerBasamagiText = birler[bakiye%1000/100] + yuzler; 
				}
				
				String allText = yuzlerBasamagiText + " " + onlarBasamagiText + " " + birlerBasamagiText;
				
				System.out.println(allText);
				break;
			case 2:
				System.out.println("Para haz�rlan�yor!");
				break;
			case 3:
				if(bakiye==999 || bakiye > 998)
					System.out.println("Daha fazla bakiye y�kleyemezsin!");
				else
					System.out.println("bakiye gir:");
					scan.nextShort();
				break;
				
		}
	*/
		/*int toplam=0;
		for(int i =0;i<10;i++){
			for(int j =0;j<10;j++){
				for(int z =0;z<10;z++){
					for(int k =10;k >0;k--){
						System.out.println("i: "+i+" j: "+ j + " z: "+ z + " k: "+ k);
						toplam++;
					}
				}
			}	
		}
		System.out.println(toplam);
		*/
		/*int islem=0,bakiye=200;
		Scanner scan = new Scanner(System.in);
		while(islem!=4){
			System.out.println("1: Bakiye g�r�nt�le");
			System.out.println("2: Para �ek");
			System.out.println("3: Para yat�r");
			System.out.println("4: ��k��");
		
			islem=scan.nextInt();
			
			switch(islem){
				default:
					System.out.println("Tan�ms�z i�lem!!");
					break;
				case 1:
					System.out.println(moneyToWord(bakiye));
					break;
				case 2:
					System.out.println("Bakiyeniz: "+ bakiye  +" ("+moneyToWord(bakiye)+")");
					int paraCek=scan.nextInt();
					if(paraCek>bakiye){
						System.out.println("Bakiyeniz: "+ bakiye +" ("+moneyToWord(bakiye)+")");
						System.out.println("Bakiyenizden fazla para �ekemezsiniz!");
					}else{
						System.out.println("Para haz�rlan�yor!");
						bakiye-=paraCek;
						System.out.println("Yeni bakiyeniz: "+ bakiye  +" ("+moneyToWord(bakiye)+")");
					}
						
					break;
				case 3:
					if(bakiye==999 || bakiye > 998)
						System.out.println("Daha fazla bakiye y�kleyemezsin!");
					else
						System.out.println("bakiye gir:");
						int paraYatir=scan.nextInt();
						if(bakiye+paraYatir > 998){
							System.out.println("999 Tl'den fazla para yat�ramazs���z!");
						}else{
							bakiye+=paraYatir;
							System.out.println("Yeni bakiyeniz: "+ bakiye  +" ("+moneyToWord(bakiye)+")");
							
						}
												
					break;
				case 4:
						for(int i=0;i<100;i++){
							System.out.println("%"+i);
							Thread.sleep(10);
						}
						System.out.println("Kart iade edildi!");
					break;	
			}
			
		}*/
		user kullanici1 = new user();
		kullanici1.setName("emre");
		kullanici1.setSurName("g�d�r");
		kullanici1.setUserName("emre11");
		kullanici1.setPass("123");
		kullanici1.setTc(1234567890);
		kullanici1.yazd�r();
		
		Scanner scan = new Scanner(System.in);
		int logReturn=kullanici1.login(scan.nextLine(), scan.nextLine());
		if(logReturn==1){
			System.out.println("Giri� ba�ar�l�!");
		}else{
			System.out.println("Giri� ba�ar�s�z!");
		}
		
		
	}
}
