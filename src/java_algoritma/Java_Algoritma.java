/**
 *
 * @author Furkan AK @Kowachka
 */

package java_algoritma;

import java.util.Scanner;

public class Java_Algoritma {

	public static void karakterDizisiCizdir(String input) {

		char harf;// girilen input değişkeninin içinde gezinmek için oluşturduğum char değişkeni
		char harf2;// kullanacağım indeksten önce sayı var mı diye kontrol etmek için oluşturduğum
					// char değişkeni
		for (int i = 0; i < input.length(); i++) {// input değişkenindeki cümlenin uzunluğu kadar döngü oluşturdum
			harf = input.charAt(i);// for döngüsünde dönen i değişkenini charAt fonksiyonu ile i indeksindeki harfi
									// harf değişkenine atanıyor
			if (harf == 'b') {// harf değişkenindeki harf b ye eşit olup olmadığı kontrolü
				harf2 = input.charAt(i - 1);// b karakterine eşitse, b karakterinden önce sayı olup olmadığını kontrol
											// etmek için bir önceki indeksini başka bir değişkene atanıyor

				if (harf2 >= '1' && harf2 <= '9') {// harf2 değişkeninde ki değer 1 ile 9 arasında olup olmadığı kontrol
													// ediliyor
					int rakam = harf2 - 48; // eğer harf2 de ki değer rakam ise bu değerden 48 çıkarıyoruz çünkü harf2
											// içindeki değer ASCII karakteri olarak tutulduğu için 48 çıkararak yazılan
											// rakamı elde ediyoruz.
					for (int j = 0; j < rakam; j++) {// rakam değişkenindeki değer kadar döndürüyoruz
						System.out.print(" ");// b harfi içerdiğinde boşluk bırakmasını istediğimiz için rakan değişkeni
												// kadar boşluk bırakacak
					}

				} else {
					System.out.print(" ");// eğer harf2 değişkeninde rakam yok ise sadece bir kere boşluk bırakacak
				}

			}
			if (harf == 's') {// harf değişkenindeki harf s ye eşit olup olmadığı kontrolü
				harf2 = input.charAt(i - 1);// s karakterine eşitse, s karakterinden önce sayı olup olmadığını kontrol
											// etmek için bir önceki indeksini başka bir değişkene atanıyor

				if (harf2 >= '1' && harf2 <= '9') {// harf2 değişkeninde ki değer 1 ile 9 arasında olup olmadığı kontrol
													// ediliyor
					int rakam = harf2 - 48;// eğer harf2 de ki değer rakam ise bu değerden 48 çıkarıyoruz çünkü harf2
											// içindeki değer ASCII karakteri olarak tutulduğu için 48 çıkararak yazılan
											// rakamı elde ediyoruz.
					for (int j = 0; j < rakam; j++) {// rakam değişkenindeki değer kadar döndürüyoruz
						System.out.print("*");// s harfi içerdiğinde * sembolünü eklemesini istediğimiz için rakam
												// değişkenindeki sayı kadar * sembolü ekleyecek
					}

				} else {
					System.out.print("*");// eğer harf2 değişkeninde rakam yok ise sadece bir kere * sembolü koyacak
				}

			}
			if (harf == 'n') {// harf değişkenindeki harf n ye eşit olup olmadığı kontrolü
				harf2 = input.charAt(i - 1);// n karakterine eşitse, n karakterinden önce sayı olup olmadığını kontrol
											// etmek için bir önceki indeksini başka bir değişkene atanıyor

				if (harf2 >= '1' && harf2 <= '9') {// harf2 değişkeninde ki değer 1 ile 9 arasında olup olmadığı kontrol
													// ediliyor
					int rakam = harf2 - 48;// eğer harf2 de ki değer rakam ise bu değerden 48 çıkarıyoruz çünkü harf2
											// içindeki değer ASCII karakteri olarak tutulduğu için 48 çıkararak yazılan
											// rakamı elde ediyoruz.
					for (int j = 0; j < rakam; j++) {// rakam değişkenindeki değer kadar döndürüyoruz
						System.out.println();// n harfi içerdiğinde bir alt satıra geçmesini istediğimiz için rakam
												// değişkenindeki sayı kadar satır atlayacak
					}

				} else {
					System.out.println();// eğer harf2 değişkeninde rakam yok ise sadece bir kere satır atlayacak
				}

			}
			if (harf == 't') {// harf değişkenindeki harf t ye eşit olup olmadığı kontrolü
				harf2 = input.charAt(i - 1);// t karakterine eşitse, t karakterinden önce sayı olup olmadığını kontrol
											// etmek için bir önceki indeksini başka bir değişkene atanıyor

				if (harf2 >= '1' && harf2 <= '9') {// harf2 değişkeninde ki değer 1 ile 9 arasında olup olmadığı kontrol
													// ediliyor
					int rakam = harf2 - 48;// eğer harf2 de ki değer rakam ise bu değerden 48 çıkarıyoruz çünkü harf2
											// içindeki değer ASCII karakteri olarak tutulduğu için 48 çıkararak yazılan
											// rakamı elde ediyoruz.
					for (int j = 0; j < rakam; j++) {// rakam değişkenindeki değer kadar döndürüyoruz
						System.out.print(" ");// t harfi içerdiğinde 3 adet boşluk bırakmasını istediğimiz için rakam
												// değişkenindeki sayı kadar işlem yapacak
						System.out.print(" ");
						System.out.print(" ");
					}

				} else {
					System.out.print(" ");// eğer harf2 değişkeninde rakam yok ise sadece 3 adet boşluk bırakacak
					System.out.print(" ");
					System.out.print(" ");

				}

			}
		}

	}

	public static String buyukHarfeCevir(String input) {
		String karakter_kontrol = "";// kullanıcıdan gelen cümleyi kontrol ederek yeni bir değişkeni atamak için
										// String karakterinde değişken tanımlandı
		char harf_kontrol;// cümledeki karakterleri gezerken char tipindeki bir değişkene atıyoruz
		for (int i = 0; i < input.length(); i++) {// girilen cümlenin uzunluğu kadar for döngüsü

			harf_kontrol = input.charAt(i);// for döngüsünde dönen i değişkenini charAt fonksiyonu ile i indeksindeki
											// harfi harf değişkenine atanıyor

			if (harf_kontrol >= 'a' && harf_kontrol <= 'z' || harf_kontrol == ' ') {// harf_kontrol değişkeninde ki
																					// karakter a dan büyük ve z den
																					// küçükse veya boşluk karakteri
																					// varsa şarta giriyoruz
				karakter_kontrol += harf_kontrol;// harf_kontrol değişkeninde ki karakteri karakter_kontrol değişkenine
													// ekliyoruz
			} else {
				karakter_kontrol += (char) (harf_kontrol + 32);// eğer şarta girmezse girilen büyük harfi küçük harfe
																// çevirmek için ASCII değerine 32 i ekliyoruz.
			}
		}
		karakter_kontrol = " " + karakter_kontrol; // İlk harfi büyük yapmak ve if şartına sokmak için cümlenin başına
													// boşluk karakteri ekliyoruz
		String yeni_cumle = ""; // yeni stringi tutmak için farklı bir string değişkeni tutuyoruz
		for (int i = 0; i < karakter_kontrol.length(); i++) { // kullanıcın girdiği cümlenin karakter sayısı kadar
																// döndürüyoruz

			char harf = karakter_kontrol.charAt(i); // cümlenin içindeki karakterleri döndürmek için for döngüsündeki i
													// değişkenindeki rakamı charAt ile o rakamdaki indeksi harf
													// değişkenine atıyoruz
			if (harf == ' ') {// harf değişkeninde boşluk karakteri olup olmadığını kontrol ediyoruz.
				yeni_cumle += harf;// Boşluk karakterini tekrar eklemek için harf değişkenindeki boşluk karakterini
									// yeni_cumle değişkenine ekliyoruz
				i++;// i yi arttırıyoruz çünkü boşluk karakterinden sonraki karakteri büyük harf
					// yapmak istiyoruz
				harf = karakter_kontrol.charAt(i);// arttırdığımız i değerini charAt ile o değerdeki indeksi harf
													// değişkenine ekliyoruz

				yeni_cumle += (char) (harf - 32);// harf değişkenindeki küçük harfdeki karakteri büyük karaktere
													// çevirmek için küçük harfin ASCII değerinden 32 çıkararak büyük
													// harf ASCII koduna çevirip char'a çevirerek yeni_cumle değişkenine
													// ekliyoruz
			} else {
				yeni_cumle += harf;// eğer boşluk karakteri görmez ise büyük harfe çevirmeyeceğimiz anlamına
									// geliyor ve direk kullanıcının girdiği halde yeni_cumle değişkenine ekliyoruz.
			}

		}

		return yeni_cumle;// String metot olduğu için geriye String bir değer döndürmemiz gerekiyor bu
							// yüzden return ile yazdırmak istediğimiz String değişkenini döndürüyoruz

	}

	public static String sifreleCoz(String input, int kaydirma_degeri) {

		String yeni_cumle = ""; // input değişkenindeki cümlenin hepsini büyük harfe çevirdiğimizde cümleyi
								// aktaracağımız değişken
		String yeni_cumle2 = ""; // karakter kontrolü yapıp şifrelemeden sonra aktaracağımız değişken
		char harf;// input değişkeninde ki harfleri kontrol etmek için harf değişkenine atmak için
		char harf2;// yeni_cumle2 değişkeninde ki harfleri kontrol etmek için harf değişkenine
					// atmak için
		for (int i = 0; i < input.length(); i++) { // input değişkenindeki karakter sayısı kadar dönüyoruz

			harf = input.charAt(i); // i değişkenini charAt fonksiyonu ile i indeksindeki harfi harf değişkenine
									// atanıyor
			if (harf >= 'A' && harf <= 'Z' || harf == ' ') { // harf değişkeninde ki karakter A dan büyük ve Z den
																// küçükse veya boşluk karakteri varsa şarta giriyoruz
				yeni_cumle += harf; // harf değişkeninde ki karakteri yeni_cumle değişkenine ekliyoruz
			} else {
				yeni_cumle += (char) (harf - 32); // eğer A ile Z arasında değilse harfi büyültmek için ASCII değerinden
													// 32 i çıkarıyoruz
			}

		}

		if (kaydirma_degeri > 0) { // kaydirma_degeri 0 dan büyük olup olmadığını kontrol ediyoruz
			if (kaydirma_degeri <= 25) { // kaydirma_degeri 25'ten eşit veya küçük mü kontrolü yapılıyor

				for (int j = 0; j < yeni_cumle.length(); j++) { // yeni_cumle değişkeninin uzunluğu kadar dönüyoruz

					harf2 = yeni_cumle.charAt(j); // j değişkenini charAt fonksiyonu ile j indeksindeki harfi harf2
													// değişkenine atanıyor
					if (harf2 >= 'A' && harf2 <= 'Z' || harf2 == ' ') { // harf2 değişkeninde ki karakter A ya eşit ya
																		// da büyük ve Z ye eşit ya da küçükse veya
																		// boşluk karakteri varsa şarta giriyoruz
						if (harf2 != ' ') { // harf2 değişkeninde ki karakter boşluk değilse şarta gir
							harf2 = (char) (harf2 + kaydirma_degeri); // harf2 değişkeninde ki karaktere kaydirma_degeri
																		// değişkeninde ki sayı kadar ekleyip yeni
																		// karakteri char olarak harf2 değişkenine
																		// atıyoruz
						}

						if (harf2 > 'Z') { // harf2 değişkeninde ki karakter Z den büyük mü kontrolü yapılıyor
							harf2 = (char) (harf2 + 'A' - 'Z' - 1); // eğer büyük ise kaydırma değeri ile alfabeden
																	// dışarı çıkabilir
							// bunu önlemek için harf2 değişkenine A ile Z arasındaki farkı alıp 1 ekliyoruz
							// bu sayede alfabenin dışına çıkmasını engelliyoruz
							// ve Z den sonra tekrar A dan başlayıp kaydırma değeri kadar şifrelenmiş oluyor
							yeni_cumle2 += harf2; // yeni karakteri yeni_cumle2 değişkenine ekliyoruz

						} else {
							yeni_cumle2 += harf2;// eğer Z den büyük değilse karakteri olduğu şekilde yeni_cumle2
													// değişkenine ekliyoruz
						}

					}

				}

			} else {
				System.out.println("Kaydırma değeri 25'ten büyük olamaz!"); // eğer kaydırma değeri 25 den büyük
																			// girilirse ekrana hatalı olduğunu
																			// yazdırıyoruz
			}
		}
		if (kaydirma_degeri < 0) { // kaydirma_degeri 0 dan küçük mü kontrolü yapılıyor
			if (kaydirma_degeri >= -25) { // kaydirma_degeri -25'e eşitmi ya da büyük mü kontrolü yapılıyor
				for (int j = 0; j < yeni_cumle.length(); j++) { // yeni_cumle değişkeninde ki karakter uzunluğu kadar
																// dönüyoruz

					harf2 = yeni_cumle.charAt(j); // j değişkenini charAt fonksiyonu ile j indeksindeki harfi harf2
													// değişkenine atanıyor
					if (harf2 >= 'A' && harf2 <= 'Z' || harf2 == ' ') { // harf2 değişkeninde ki karakter A ya eşit ya
																		// da büyük ve Z ye eşit ya da küçükse veya
																		// boşluk karakteri varsa şarta giriyoruz
						if (harf2 != ' ') { // harf2 değişkeninde ki karakter boşluk değilse şarta gir
							harf2 = (char) (harf2 + kaydirma_degeri); // harf2 değişkeninde ki karaktere kaydirma_degeri
																		// değişkeninde ki sayı kadar ekleyip yeni
																		// karakteri char olarak harf2 değişkenine
																		// atıyoruz
						}

						if (harf2 < 'A') { // harf2 değişkeninde ki karakter A dan küçük mü kontrolü yapılıyor
							if (harf2 != ' ') { // harf2 değişkeninde ki karakter boşluk değilse şarta gir
								harf2 = (char) (harf2 - 'A' + 'Z' + 1);// eğer küçük ise kaydırma değeri ile alfabeden
																		// dışarı çıkabilir
								// bunu önlemek için harf2 değişkenine A ile Z arasındaki fark ekleyip daha
								// sonra 1 ekliyoruz bu sayede alfabenin dışına çıkmasını engelliyoruz
								// ve A dan sonra tekrar Z den başlayıp kaydırma değeri kadar şifrelenmiş oluyor
							}
							yeni_cumle2 += harf2; // yeni karakteri yeni_cumle2 değişkenine ekliyoruz

						} else {
							yeni_cumle2 += harf2; // eğer A dan küçük değilse karakteri olduğu şekilde yeni_cumle2
													// değişkenine ekliyoruz
						}

					}

				}

			} else {
				System.out.println("Kaydırma değeri -25'ten küçük olamaz!"); // eğer kaydırma değeri -25 den küçük
																				// girilirse ekrana hatalı olduğunu
																				// yazdırıyoruz
			}
		}

		return yeni_cumle2; // String metot olduğu için geriye String bir değer döndürmemiz gerekiyor bu
							// yüzden return ile yazdırmak istediğimiz String değişkenini döndürüyoruz

	}

	public static void harfCizdir(String karakter, int boyut) {

		Scanner sc = new Scanner(System.in); // kullanıcıdan veri almak için Scanner sınıfı tanımlıyoruz

		char girilen_karakter = karakter.charAt(0); // Sadece bir harfe bakacağımız ve bu ilk indeks olduğu için ilk
													// indeksi char değişkenine atıyoruz
		boolean harf_kontrol = true; // harf kontrolü yapmak için boolean bir değişken tanımlıyoruz
		while (harf_kontrol) { // kullanıcı yanlış karakter girerse sürekli yeni değer almak için while döngüsü
								// kuruyoruz
			if (girilen_karakter == 'X' || girilen_karakter == 'Z') { // girilen karakter X mi yoksa Z mi olduğunu
																		// kontrol ediyoruz

				harf_kontrol = false; // eğer girilen karakter X veya Z ise döngüden çıkmak için boolean değişkenini
										// false yapıyoruz.
			} else {
				System.out.println("Girilen karakter geçersiz");//
				System.out.print("Bir karekter giriniz: ");
				karakter = sc.nextLine();// Geçersiz karakter girdiği için tekrardan karakter girişi istiyoruz
				girilen_karakter = karakter.charAt(0);// Girdiği karakterin 0. indeksini girilen_karakter değişkenine
														// atıyoruz

			}
		}

		boolean sayi_kontrol = true; // sayi kontrolü için boolean değişkeni tanımlıyoruz.
		while (sayi_kontrol) { // kullanıcı yanlış değer girerse sürekli yeni değer almak için while döngüsü
								// kuruyoruz
			if (boyut % 2 != 0 && boyut >= 5) { // sayi tek sayi ise ve 5'e eşit veya büyük mü kontrolü yapıyoruz
				sayi_kontrol = false; // eğer tek sayı ve 5' e eşit veya büyükse döngüden çıkmak için boolean
										// değişkenini false yapıyoruz

				if (girilen_karakter == 'Z') { // girilen karakter Z mi kontrolü yapıyoruz
					for (int satir = 0; satir < boyut; satir++) { // satir değişkeni tanımlayıp boyut değerinden küçük
																	// olduğu sürece dönüyoruz
						for (int sutun = 0; sutun < boyut; sutun++) { // sutun değişkeni tanımlayıp boyut değerinden
																		// küçük olduğu sürece dönüyoruz
							if (satir == 0 || satir == boyut - 1 || sutun == boyut - 1 - satir) {// eğer satir değişkeni
																									// 0'a eşitse veya
								// satir değişkeni boyut değerinden 1 eksiğine eşitse veya
								// sutun değişkeni boyut değişkeninden 1 eksik ve satir değişkeninden de eksik
								// ise şarta giriyoruz
								System.out.print("*"); // şart sağlanırsa print ile * sembolü ekliyoruz
							} else {
								System.out.print(" "); // eğer şart sağlanmazsa print ile boşluk ekliyoruz
							}
						}
						System.out.println();// sutun değişkeni boyut değerinden küçük değil ise döngüden çıkıp println
												// ile bir sonraki satıra geçiyoruz
					}
				} else { // girilen karakter Z değilse
					for (int satir = 1; satir <= boyut; satir++) { // satir değişkeni tanımlayıp boyut değerine eşit
																	// veya küçük olduğu sürece dönüyoruz

						for (int sutun = 1; sutun <= boyut; sutun++) { // sutun değişkeni tanımlayıp boyut değerine eşit
																		// veya küçük olduğu sürece dönüyoruz
							if (sutun == satir || sutun == boyut - satir + 1) { // sutun değişkeni satir değişkenine
																				// eşitse veya
								// sutun değişkeni boyut değişkeni satir değişkeninden eksik ve 1 fazlası ise
								// şarta giriyoruz
								System.out.print("*"); // şart sağlanırsa print ile * sembolü ekliyoruz
							}
							System.out.print(" ");// eğer şart sağlanmazsa print ile boşluk ekliyoruz

						}

						System.out.println(); // sutun değişkeni boyut değerinden küçük değil ise döngüden çıkıp println
												// ile bir sonraki satıra geçiyoruz

					}
				}

			} else { // eğer girilen boyut değeri tek sayı değilse ve 5'ten küçükse
				System.out.println("Girilen boyut değeri geçersiz"); // Yanlış değer girdiğini gösteriyoruz
				System.out.print("Boyut değeri giriniz: "); // Tekrardan boyut değeri istiyoruz
				boyut = sc.nextInt(); // Kullanıcıdan tekrar değer alıyoruz
			}
		}
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); // kullanıcıdan veri almak için Scanner sınıfı tanımlıyoruz
		String menu = "Proje 1 Kullanıcı Menüsü:\n 1. Karakter dizisini çizdir\n 2. Büyük harfe çevir\n 3. Şifrele ve şifre çöz\n 4. Harf çiz "; // ekrana
																																					// yazdıracağımız
																																					// menü
																																					// bilgilerini
																																					// String
																																					// değişkenine
																																					// ekliyoruz
		System.out.println(menu); // Hazırladığımız menu değişkenini ekrana yazdırıyoruz
		System.out.print("Lütfen bir seçim yapınız: "); // kullanıcıdan seçim yapmasını ekrana yazdırıyoruz
		String exit = in.nextLine(); // kullanıcıdan veri alıyoruz
		String harf_cevirme = ""; // kullanıcın girdiği kelimeyi küçük harfe çevirdiğimizde ekliyeceğimiz String
									// değişkeni
		char harf; // exit değişkeninin içinde gezinmek için oluşturulan char değişkeni
		int secim2 = 0; // girilen veri integer değerse tutacağımız değişken
		for (int i = 0; i < exit.length(); i++) { // exit değişkenindeki karakter sayısı kadar dönüyoruz
			if (exit.charAt(i) >= '1' && exit.charAt(i) <= '9') { // i değişkeninde ki değer 1 ile 9 arasında olup
																	// olmadığı kontrol ediliyor

				secim2 = exit.charAt(i) - 48; // eğer i de ki değer rakam ise bu değerden 48 çıkarıyoruz çünkü i
												// içindeki değer ASCII karakteri olarak tutulduğu için 48 çıkararak
												// yazılan rakamı elde ediyoruz.
			}

			harf = exit.charAt(i); // eğer i de ki değer rakam değil ise i de ki karakteri harf değişkenine
									// atıyoruz

			if (harf >= 'a' && harf <= 'z') { // harf değişkeninde ki karakter a ile z arasında mı olduğunu kontrol
												// ediyoruz
				harf_cevirme += harf; // eğer a ile z arasındaysa direk harf_cevirme değişkenine ekliyoruz
			} else {
				harf_cevirme += (char) (harf + 32); // eğer değilse karaktere 32 ekleyip ASCII değeri karşılığı olan
													// küçük karakterleri elde ediyoruz ve harf_cevirme değişkenine
													// ekliyoruz
			}
		}

		while (!harf_cevirme.equals("dur")) { // while döngüsü ile harf_cevirme değişkeninde ki karakter dur girilmediği
												// sürece dönecek

			switch (secim2) { // switch-case ile secim2 değişkeni ile seçim yapıyoruz
			case 1: {

				System.out.print("Bir dizi karakter giriniz: "); // case 1 seçildiğinde kullanıcıdan dizi karakter
																	// girmesi için ekrana yazdırıyoruz
				String text = in.nextLine(); // kullanıcın veri alıyoruz
				karakterDizisiCizdir(text); // kullanıcının girdiği String değişkeni karakterDizisiCizdir metoduna
											// gönderiyoruz
				System.out.println();

				break; // case 1 işlemi bittikten sonra diğer caseleri çalıştırmaması için switchi
						// durduruyoruz

			}
			case 2: {

				System.out.print("Cümle Giriniz: "); // case 2 seçildiğinde kullanıcıdan cümle girmesi için ekrana
														// yazdırıyoruz
				String kullanici_cumle = in.nextLine(); // kullanıcın veri alıyoruz
				System.out.println("Çıktı: " + buyukHarfeCevir(kullanici_cumle)); // kullanıcının girdiği String
																					// değişkeni buyukHarfeCevir
																					// metoduna gönderiyoruz ve ekrana
																					// yazdırıyoruz

				System.out.println();
				break; // case 2 işlemi bittikten sonra diğer caseleri çalıştırmaması için switchi
						// durduruyoruz
			}
			case 3: {

				System.out.print("Bir cümle giriniz: "); // case 3 seçildiğinde kullanıcıdan cümle girmesi için ekrana
															// yazdırıyoruz

				String bb = in.nextLine(); // kullanıcın veri alıyoruz
				System.out.print("Kaydırma değeri giriniz: "); // kullanıcıdan kaydırma değeri girmesi için ekrana
																// yazdırıyoruz
				int kaydirma_degeri = Integer.parseInt(in.nextLine()); // kullanıcıdan kaydırma değeri alıyoruz
				System.out.println("Şifrelenmiş metin: " + sifreleCoz(bb, kaydirma_degeri)); // kullanıcının girdiği
																								// String değişkeni ve
																								// integer değişkeni
																								// sifreleCoz metoduna
																								// gönderiyoruz ve
																								// ekrana yazdırıyoruz

				break; // case 3 işlemi bittikten sonra diğer caseleri çalıştırmaması için switchi
						// durduruyoruz
			}
			case 4: {

				System.out.print("Bir karekter giriniz: "); // case 4 seçildiğinde kullanıcıdan karakter girmesi için
															// ekrana yazdırıyoruz
				String girilen_karakter = in.nextLine(); // kullanıcın veri alıyoruz
				System.out.print("Boyut değeri giriniz: "); // kullanıcıdan boyut değeri girmesi için ekrana
															// yazdırıyoruz
				int boyut_degeri = Integer.parseInt(in.nextLine()); // kullanıcıdan boyut değeri alıyoruz
				harfCizdir(girilen_karakter, boyut_degeri); // kullanıcının girdiği String değişkeni ve integer
															// değişkeni harfCizdir metoduna gönderiyoruz

				break; // case 4 işlemi bittikten sonra diğer caseleri çalıştırmaması için switchi
						// durduruyoruz

			}
			default:

				break;
			}
			exit = ""; // exit değişkeninin boş bir String haline getiriyoruz
			secim2 = 0; // secim2 değişkenini boş bir integer haline getiriyoruz
			harf_cevirme = ""; // harf_cevirme değişkeninin boş bir String haline getiriyoruz

			System.out.println(menu); // ekrana tekrardan menüyü yazdırıyoruz
			System.out.print("Lütfen bir seçim yapınız: "); // kullanıcıdan tekrardan seçim yapması için ekrana
															// yazdırıyoruz
			exit = in.nextLine(); // kullanıcıdan veri alıyoruz.

			for (int i = 0; i < exit.length(); i++) { // exit değişkenindeki karakter sayısı kadar dönüyoruz
				if (exit.charAt(i) >= '1' && exit.charAt(i) <= '9') { // i değişkeninde ki değer 1 ile 9 arasında olup
																		// olmadığı kontrol ediliyor
					secim2 = exit.charAt(i) - 48; // eğer i de ki değer rakam ise bu değerden 48 çıkarıyoruz çünkü i
													// içindeki değer ASCII karakteri olarak tutulduğu için 48 çıkararak
													// yazılan rakamı elde ediyoruz.
				}

				harf = exit.charAt(i); // eğer i de ki değer rakam değil ise i de ki karakteri harf değişkenine
										// atıyoruz

				if (harf >= 'a' && harf <= 'z') { // harf değişkeninde ki karakter a ile z arasında mı olduğunu kontrol
													// ediyoruz
					harf_cevirme += harf; // eğer a ile z arasındaysa direk harf_cevirme değişkenine ekliyoruz
				} else {
					harf_cevirme += (char) (harf + 32); // eğer değilse karaktere 32 ekleyip ASCII değeri karşılığı olan
														// küçük karakterleri elde ediyoruz ve harf_cevirme değişkenine
														// ekliyoruz
				}
			}

		}
	}

}
