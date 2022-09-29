public class Odev1 {
	//	// reusability = tekrar tekrar kullanılabilirlik
	public static void main(String[] args) { 
		//		System.out.println("Merhaba Java");
		//
		//		//Variables = Değişkenler
		//		int sayi = 10;
		//		String mesaj = "Öğrenci Sayısı : ";
		//		System.out.println(mesaj + sayi);
		//		System.out.println(mesaj + sayi);
		//		System.out.println("Öğrenci sayım : "+ sayi);
		//		System.out.println("Öğrenci sayım : "+ sayi);
		//		System.out.println("Öğrenci sayım : "+ sayi);
		//
		//		//Datatypes = Veri Tipleri
		//		int sayilar = 12;
		//		double ondalikliSayi = 12.5 ;
		//		boolean dogruMu = false ;
		//
		//		Conditionals = Şartlar
		//				int ssayi = 10;
		//		if (ssayi<20) {
		//			System.out.println(" Sayı 20 den küçüktür ");
		//		}else if (ssayi==20) {
		//			System.out.println(" Sayı 20 ye eşittir ");
		//		}else {
		//			System.out.println(" Sayı 20 den küçük değildir "); }
		//
		//		//recapDemo1
		//		int sayi1 = 20 ;
		//		int sayi2 = 25 ;
		//		int sayi3 = 2 ;
		//		int enBuyuk = sayi1 ;
		//		if (enBuyuk<sayi2) {
		//			enBuyuk = sayi2;	}
		//		if (enBuyuk<sayi3) {
		//			enBuyuk = sayi3 ; }
		//		System.out.println("En Büyük = " + enBuyuk);
		//
		//		//Switch = şart yapısıdır. İf e göre daha az kullanılır
		//		char grade = 'H' ;
		//
		//		switch (grade) {
		//		case 'A':
		//			System.out.println("Mükemmel : Geçtiniz");
		//			break;
		//		case 'B':
		//		case 'C':
		//			System.out.println("İyi : Geçtiniz");
		//			break;
		//		case 'D':
		//			System.out.println("Fena Değil : Geçtiniz");
		//			break;
		//		case 'F':
		//			System.out.println("Maalesef Kaldınız");
		//			break;
		//		default:
		//			System.out.println("Geçersiz Not Girdiniz"); }
		//
		//		//Döngüler
		//		//For Döngüsü
		//		for (int i=1 ; i<10 ; i+=2 )   {
		//			System.out.println(i);}
		//		System.out.println("For Döngüsü Bitti");
		//
		//		//While Döngüsü
		//		int i=1 ;
		//		while (i<10) {
		//			System.out.println(i);
		//			i++; }
		//		System.out.println("While Döngüsü Bitti");
		//
		//		// Do-While döngüsü şart uymasa bile şartı 1 kere çalıştırıyor.
		//		    int j=1;
		//		    do {
		//		        System.out.println(j);
		//		        j+=2;
		//		    } while (j<10);
		//		    System.out.println("Do-While Döngüsü Bitti");
		//
		//		//Arrays Diziler
		//		     String ogrenci1= "Engin";
		//		    String ogrenci2= "Derin";
		//		     String ogrenci3= "Salih";
		//		     String ogrenci4= "Ahmet";
		//		     System.out.println(ogrenci1);
		//		     System.out.println(ogrenci2);
		//		     System.out.println(ogrenci3);
		//		     System.out.println(ogrenci4);
		//
		//		// veri dizisi yazılırken array yani [] yazılır // 3 üç eleman olduğunu yazdık
		//		     String[] ogrenciler = new String[4];
		//		    ogrenciler[0] = "Engin" ;
		//		     ogrenciler[1] = "Derin" ;
		//		     ogrenciler[2] = "Salih" ;
		//		     ogrenciler[3] ="Sefa" ;
		//
		//		     System.out.println("---------------------------------");
		//
		//		     for (int i=0;i<ogrenciler.length;i++) {
		//		         System.out.println(ogrenciler[i]);
		//		     }
		//		     for (String ogrenci: ogrenciler){
		//		         System.out.println(ogrenci);
		//		     }
		//
		//		//Recap Demo 2
		//		 double[] mylist = new double[4];
		//		     double[] myList = {1.2, 1.3, 2.5, 5.8, 7.4};
		//		     double total = 0;
		//		     double max = myList[0];
		//
		//
		//		     for (double number : myList) {
		//		         if (max < number) {
		//		             max = number;
		//		         }
		//		         total = total + number;
		//		         System.out.println(number);
		//		     }
		//		     System.out.println("Toplam =" + total);
		//		     System.out.println("En Büyük =" + max);
		//
		//		// Multi Dimensional = Çok Boyutlu Diziler
		//		       String[] [] sehirler= new String [3] [3];
		//		       sehirler [0] [0] = "İstanbul";
		//		       sehirler [0] [1] = "Bursa";
		//		       sehirler [0] [2] = "Bilecik";
		//		       sehirler [1] [0] = "Antalya";
		//		       sehirler [1] [1] = "Konya";
		//		       sehirler [1] [2] = "Kayseri";
		//		       sehirler [2] [0] = "Diyarbakır";
		//		       sehirler [2] [1] = "Şanlıurfa";
		//		      sehirler [2] [2] = "Gaziantep";
		//
		//		       for(int i =0; i<=2; i++) {
		//		           System.out.println("-----------------------------");
		//		          for(int j=0; j<=2; j++){
		//		              System.out.println(sehirler[i] [j]); } }
		//
		//		//Stringler le çalışmak
		//		       String mesaj = "Bugün hava çok güzel.";
		//		       System.out.println(mesaj);
		//		
		//		      System.out.println("Eleman Sayısı = "+mesaj.length());
		//		          System.out.println("5. Eleman ="+mesaj.charAt(4));
		//		          System.out.println(mesaj.concat("Yaşasın"));
		//		          System.out.println(mesaj.startsWith("B"));
		//		          System.out.println(mesaj.endsWith("l"));
		//		           char[] karakterler = new char [5] ;
		//		           mesaj.getChars(0, 5, karakterler, 0);
		//		           System.out.println(karakterler);
		//		          
		//		           System.out.println(mesaj.indexOf("av"));
		//		           System.out.println(mesaj.lastIndexOf("a"));
		//				
		//		       		String yeniMesaj = mesaj.replace(' ', '-');
		//					System.out.println(yeniMesaj);
		//					System.out.println(mesaj.substring(2,5));
		//					
		//					for (String kelime: mesaj.split(" ")) {
		//						System.out.println(kelime); }
		//					
		//					System.out.println(mesaj.toLowerCase());
		//					System.out.println(mesaj.toUpperCase());
		//					System.out.println(mesaj.trim());
		//
		//		//MiniProje Asal Sayı
		//
		//				int number = 1;
		//			int remainder = number % 2 ;
		//				System.out.println(remainder);
		//				boolean isPrime = true;
		//				
		//				
		//				if(number==1) {
		//					System.out.println("Sayı asal değildir.");
		//					return;
		//				}
		//				
		//				
		//				if(number<1) {
		//					System.out.println("Geçersiz Sayı");
		//				}
		//				for (int i =2; i<number; i++) {
		//					if (number % i == 0) {
		//						isPrime = false; } }
		//		         
		//				if(isPrime==true) {
		//					System.out.println("Sayı Asaldır.");
		//				}else {
		//				System.out.println("Sayı Asal Değildir."); }
		//
		//		//Mini Proje Sesli Harfler
		//				
		//				char harf = 'a' ;
		//				
		//				switch (harf) {
		//				case 'A':
		//				case 'I':
		//				case 'O':
		//				case 'U':
		//					System.out.println("Kalın Sesli Harf");
		//					break;
		//					default:
		//						System.out.println("İnce Sesli Harf");
		//				}
		//
		//		//Mini Proje Mükemmel Sayı Bulmak-----------------------------------------------------------------------------------------------------------
		//
		//				int number = 28;
		//				int total = 0;
		//				
		//				for (int i = 1; i < number; i++) {
		//					if (number % i == 0) {
		//						total = total + i; } }
		//				
		//				if (total == number) {
		//					System.out.println("Mükemmel Sayıdır.");
		//				}else {
		//					System.out.println("Mükemmel Sayı Değildir."); }
		//				
		//		// Mini Proje Arkadaş Sayılar-----------------------------------------------------------------------------------------------------------------
		//
		//				int number =220 ;
		//				int number2 = 284 ;
		//				int toplam1 = 0 ;
		//				int toplam2 = 0 ;
		//				
		//				for (int i = 1 ; i <number; i++) {
		//					if (number % i == 0) {
		//						toplam1 = toplam1 + i ;				
		//					}
		//				}
		//				for (int i = 1 ; i <number2; i++) {
		//					if (number2 % i == 0) {
		//						toplam2 = toplam2 + i ;				
		//					}
		//				}
		//				if (number == toplam2 && number2 == toplam1 ) {
		//					System.out.println("bu iki sayı arkadaştır.");
		//				}else {
		//					System.out.println("Bu iki sayı arkadaş değildir.");
		//				}
		//		         
		//		         System.out.println("---------------------------------");
		//				
		//		// Mini Proje Sayı Bulma 
		//
		//		int [] numbers = new int [] {1,2,5,7,9,0} ;
		//		int aranacak =8 ;
		//		boolean varMi = false ;
		//
		//		for (int sayi : numbers) {
		//			if (sayi == aranacak) {
		//				varMi = true ;
		//				break;
		//			}		}
		//		if(varMi) {
		//			System.out.println("sayı mevcuttur");
		//		}else {
		//			System.out.println("Sayı Mevcut Değildir.");
		//		}
	}
}
