import java.time.*;
import java.time.format.*;
import java.io.*;

public class Donor {

	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        Human first = new Human(); 													//zdefiniowanie człowieka
        double quantity = 0.45, quantityYear, taxBack;
        int donations;
        
        System.out.print("Witaj w arkuszu krwiodawcy, jak masz na imię? ");
        first.firstName = scan.readLine();
        System.out.print("Potrzebuję Twojego wieku ");
        first.age = Integer.parseInt(scan.readLine());
        System.out.print("Jaka jest Twoja waga? ");
        first.weight = Integer.parseInt(scan.readLine());
        System.out.print("Potwierdź swoją płeć wciskając: \nK - Kobieta\tM - Mężczyzna\n");
        first.gender = scan.readLine();
        if ((first.gender.equals("M")) || (first.gender.equals("m"))) {
            System.out.println("\nImię: " + first.firstName + "\nPłeć: " + first.gender + "ężczyzna" + "\nWaga: " + first.weight + "kg\nWiek: " + first.age);
            System.out.print("\nCzy potwierdzasz kartę? \nT - Tak\nN - Nie ");
            String strTN = scan.readLine();
            if ((strTN.equals("T")) || (strTN.equals("t"))) {
                if (first.age >= 18 && first.age <= 65) {
                    if (first.weight <= 50) {
                        System.out.println("\nPrzykro mi ale nie możesz zostać krwiodawcą, musisz ważyć minimum 50kg");
                        //System.in.read();
                    } else if (first.weight > 50) {
                        System.out.println("\nSuper, spełniasz warunki krwiodawcy, zapraszamy do najbliższego RCKiK wraz z dowodem osobistym");
                        System.out.print("Czy oddałeś dziś krew? ");
                        String TN = scan.readLine();
                        if ((TN.equals("T")) || (TN.equals("t"))) {
                            donations = 1;
                            quantityYear = donations * quantity;
                            taxBack = quantityYear * 130;
                            LocalDate donationDate = LocalDate.now();
                            LocalDate nextDonationDate = donationDate.plusDays(56);
                            System.out.println("\nSuper! Następna donacja możliwa " + nextDonationDate + "\nW tym roku oddałeś: " + quantityYear + "l krwi, przysługuje Ci zwrot podatku w wysokości: " + taxBack + "zł.");
                            System.out.println("Czy oddawałeś krew jeszcze w tym roku?");
                            strTN = scan.readLine();
                            if ((strTN.equals("T")) || (strTN.equals("t"))) {
                                System.out.println("Ile razy? ");                //dodawanie dat donacji
                                int howManyTimes = Integer.parseInt(scan.readLine());
                                quantityYear = (howManyTimes + 1) * quantity;
                                
                                switch (howManyTimes) {
                                    case 1:
                                        {
                                            donations += donations;
                                            quantityYear = donations * quantity;
                                            taxBack = quantityYear * 130;
                                            System.out.println("Podaj datę w formacie rrrr-MM-dd");
                                            String date2 = scan.readLine();
                                            LocalDate donation2 = LocalDate.parse(date2, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                                            LocalDate nextDonation = donation2.plusDays(56);
                                            System.out.println("\nSuper! Następna donacja możliwa " + nextDonation + "\nW tym roku oddałeś: " + quantityYear + "l krwi, przysługuje Ci zwrot podatku w wysokości: " + taxBack + "zł.");
                                            break;
                                        }
                                    case 2:
                                        {
                                            donations = howManyTimes + 1;
                                            quantityYear = donations * quantity;
                                            taxBack = quantityYear * 130;
                                            System.out.println("Podaj datę donacji w formacie rrrr-MM-dd");
                                            String date2 = scan.readLine();
                                            LocalDate donation2 = LocalDate.parse(date2, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                                            System.out.println("Podaj datę kolejnej donacji w formacie rrrr-MM-dd");
                                            String date3 = scan.readLine();
                                            LocalDate donation3 = LocalDate.parse(date3, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                                            LocalDate nextDonation = donation3.plusDays(56);
                                            System.out.println("\nSuper! Następna donacja możliwa " + nextDonation + "\nW tym roku oddałeś: " + quantityYear + "l krwi, przysługuje Ci zwrot podatku w wysokości: " + taxBack + "zł.");
                                            break;
                                        }
                                    case 3:
                                        {
                                            donations = howManyTimes + 1;
                                            quantityYear = donations * quantity;
                                            taxBack = quantityYear * 130;
                                            System.out.println("Podaj datę donacji w formacie rrrr-MM-dd");
                                            String date2 = scan.readLine();
                                            LocalDate donation2 = LocalDate.parse(date2, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                                            System.out.println("Podaj datę kolejnej donacji w formacie rrrr-MM-dd");
                                            String date3 = scan.readLine();
                                            LocalDate donation3 = LocalDate.parse(date3, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                                            System.out.println("Podaj datę kolejnej donacji w formacie rrrr-MM-dd");
                                            String date4 = scan.readLine();
                                            LocalDate donation4 = LocalDate.parse(date4, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                                            LocalDate nextDonation = donation4.plusDays(56);
                                            System.out.println("\nSuper! Następna donacja możliwa " + nextDonation + "\nW tym roku oddałeś: " + quantityYear + "l krwi, przysługuje Ci zwrot podatku w wysokości: " + taxBack + "zł.");
                                            break;
                                        }
                                    case 4:
                                        {
                                            donations = howManyTimes + 1;
                                            quantityYear = donations * quantity;
                                            taxBack = quantityYear * 130;
                                            System.out.println("Podaj datę donacji w formacie rrrr-MM-dd");
                                            String date2 = scan.readLine();
                                            LocalDate donation2 = LocalDate.parse(date2, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                                            System.out.println("Podaj datę kolejnej donacji w formacie rrrr-MM-dd");
                                            String date3 = scan.readLine();
                                            LocalDate donation3 = LocalDate.parse(date3, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                                            System.out.println("Podaj datę kolejnej donacji w formacie rrrr-MM-dd");
                                            String date4 = scan.readLine();
                                            LocalDate donation4 = LocalDate.parse(date4, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                                            System.out.println("Podaj datę kolejnej donacji w formacie rrrr-MM-dd");
                                            String date5 = scan.readLine();
                                            LocalDate donation5 = LocalDate.parse(date5, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                                            LocalDate nextDonation = donation5.plusDays(56);
                                            System.out.println("\nSuper! Następna donacja możliwa " + nextDonation + "\nW tym roku oddałeś: " + quantityYear + "l krwi, przysługuje Ci zwrot podatku w wysokości: " + taxBack + "zł.");
                                            break;
                                        }
                                    case 5:
                                        {
                                            donations = howManyTimes + 1;
                                            quantityYear = donations * quantity;
                                            taxBack = quantityYear * 130;
                                            System.out.println("Podaj datę donacji w formacie rrrr-MM-dd");
                                            String date2 = scan.readLine();
                                            LocalDate donation2 = LocalDate.parse(date2, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                                            System.out.println("Podaj datę kolejnej donacji w formacie rrrr-MM-dd");
                                            String date3 = scan.readLine();
                                            LocalDate donation3 = LocalDate.parse(date3, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                                            System.out.println("Podaj datę kolejnej donacji w formacie rrrr-MM-dd");
                                            String date4 = scan.readLine();
                                            LocalDate donation4 = LocalDate.parse(date4, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                                            System.out.println("Podaj datę kolejnej donacji w formacie rrrr-MM-dd");
                                            String date5 = scan.readLine();
                                            LocalDate donation5 = LocalDate.parse(date5, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                                            System.out.println("Podaj datę kolejnej donacji w formacie rrrr-MM-dd");
                                            String date6 = scan.readLine();
                                            LocalDate donation6 = LocalDate.parse(date6, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                                            LocalDate nextDonation = donation6.plusDays(56);
                                            System.out.println("\nSuper! Następna donacja możliwa " + nextDonation + "\nW tym roku oddałeś: " + quantityYear + "l krwi, przysługuje Ci zwrot podatku w wysokości: " + taxBack + "zł.");
                                            break;
                                        }
                                }
                                System.out.println("Masz oddane: " + quantityYear + "l krwi co przekłada się na: " + taxBack + "zł zwrotu podatku, ekstra, nie?");
                            
                        }
                    }
                } else if (first.age < 18) {
                    System.out.println("\nPrzykro mi ale jesteś za młody na oddawanie krwi, minimalny wiek to 18 lat");
                } else if (first.age > 65) {
                    System.out.println("\nPrzykro mi ale maksymalny wiek krwiodawcy to 65 lat.");
                }
            } else if ((strTN.equals("N")) || (strTN.equals("n"))) {
                System.out.print("\nKtóra dana jest niewłaściwa? \n[1] Imię\n[2] Płeć\n[3] Waga\n[4] Wiek ");
                int Error = Integer.parseInt(scan.readLine());
                switch (Error) {
                    case 1:
                        System.out.println("Podaj poprawne imię: ");
                        first.firstName = scan.readLine();
                        break;
                    case 2:
                        System.out.println("Podaj swoją płeć: M lub K");
                        first.gender = scan.readLine();
                        break;
                    case 3:
                        System.out.println("Podaj poprawną wagę: ");
                        first.weight = Float.parseFloat(scan.readLine());
                        break;
                    case 4:
                        System.out.println("Podaj poprawny wiek: ");
                        first.age = Integer.parseInt(scan.readLine());
                        break;
                }
                System.out.println("\nImię: " + first.firstName + "\nPłeć: " + first.gender + "ężczyzna" + "\nWaga: " + first.weight + "kg\nWiek: " + first.age);
                System.out.print("Czy oddałeś dziś krew? " );
                String TN = scan.readLine();
                if ((TN.equals("T")) || (TN.equals("t"))) {
                    donations = 1;
                    quantityYear = donations * quantity;
                    taxBack = quantityYear * 130;
                    LocalDate donationDate = LocalDate.now();
                    LocalDate nextDonationDate = donationDate.plusDays(56);
                    System.out.println("\nSuper! Następna donacja możliwa " + nextDonationDate);
                           
                        donations += donations;
                        quantityYear = donations * quantity;
                        taxBack = quantityYear * 130;
                        System.out.println("Podaj datę w formacie rrrr-MM-dd");
                        String date2 = scan.readLine();
                        LocalDate donation2 = LocalDate.parse(date2, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                        LocalDate nextDonation = donation2.plusDays(56);
                        System.out.println("\nSuper! Następna donacja możliwa " + nextDonation + "\nW tym roku oddałeś: " + quantityYear + "l krwi, przysługuje Ci zwrot podatku w wysokości: " + taxBack + "zł.");
                    }
                }
            }
        } else if ((first.gender.equals("K")) || (first.gender.equals("k"))) {
        	class Woman extends Human {
        		int age;
        	 	float weight;
        	 	String firstName;
        	}
        	Woman female = new Woman();
        	female.age = first.age;
        	female.weight = first.weight;
        	female.firstName = first.firstName;
        	System.out.println("\nImię: " + female.firstName + "\nPłeć: Kobieta" + "\nWaga: " + female.weight + "kg\nWiek: " + female.age);
            System.out.print("\nCzy potwierdzasz kartę? \nT - Tak\nN - Nie ");
            String strTN = scan.readLine();
            if ((strTN.equals("T")) || (strTN.equals("t"))) {
                if (female.age >= 18 && female.age <= 65) {
                    if (female.weight <= 50) {
                        System.out.println("\nPrzykro mi ale nie możesz zostać krwiodawcą, musisz ważyć minimum 50kg");
                        //System.in.read();
                    } else if (female.weight > 50) {
                        System.out.println("\nSuper, spełniasz warunki krwiodawcy, zapraszamy do najbliższego RCKiK wraz z dowodem osobistym");
                        System.out.print("Czy oddałeś dziś krew? ");
                        String TN = scan.readLine();
                        if ((TN.equals("T")) || (TN.equals("t"))) {
                            donations = 1;
                            quantityYear = donations * quantity;
                            taxBack = quantityYear * 130;
                            LocalDate donationDate = LocalDate.now();
                            LocalDate nextDonationDate = donationDate.plusDays(56);
                            System.out.println("\nSuper! Następna donacja możliwa " + nextDonationDate + "\nW tym roku oddałeś: " + quantityYear + "l krwi, przysługuje Ci zwrot podatku w wysokości: " + taxBack + "zł.");
                            System.out.println("Czy oddawałeś krew jeszcze w tym roku?");
                            strTN = scan.readLine();
                            if ((strTN.equals("T")) || (strTN.equals("t"))) {
                                System.out.println("Ile razy? ");                //dodawanie dat donacji
                                int howManyTimes = Integer.parseInt(scan.readLine());
                                quantityYear = (howManyTimes + 1) * quantity;
                                
                                switch (howManyTimes) {
                                    case 1:
                                        {
                                            donations += donations;
                                            quantityYear = donations * quantity;
                                            taxBack = quantityYear * 130;
                                            System.out.println("Podaj datę w formacie rrrr-MM-dd");
                                            String date2 = scan.readLine();
                                            LocalDate donation2 = LocalDate.parse(date2, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                                            LocalDate nextDonation = donation2.plusDays(56);
                                            System.out.println("\nSuper! Następna donacja możliwa " + nextDonation + "\nW tym roku oddałeś: " + quantityYear + "l krwi, przysługuje Ci zwrot podatku w wysokości: " + taxBack + "zł.");
                                            break;
                                        }
                                    case 2:
                                        {
                                            donations = howManyTimes + 1;
                                            quantityYear = donations * quantity;
                                            taxBack = quantityYear * 130;
                                            System.out.println("Podaj datę donacji w formacie rrrr-MM-dd");
                                            String date2 = scan.readLine();
                                            LocalDate donation2 = LocalDate.parse(date2, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                                            System.out.println("Podaj datę kolejnej donacji w formacie rrrr-MM-dd");
                                            String date3 = scan.readLine();
                                            LocalDate donation3 = LocalDate.parse(date3, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                                            LocalDate nextDonation = donation3.plusDays(56);
                                            System.out.println("\nSuper! Następna donacja możliwa " + nextDonation + "\nW tym roku oddałeś: " + quantityYear + "l krwi, przysługuje Ci zwrot podatku w wysokości: " + taxBack + "zł.");
                                            break;
                                        }
                                    case 3:
                                        {
                                            donations = howManyTimes + 1;
                                            quantityYear = donations * quantity;
                                            taxBack = quantityYear * 130;
                                            System.out.println("Podaj datę donacji w formacie rrrr-MM-dd");
                                            String date2 = scan.readLine();
                                            LocalDate donation2 = LocalDate.parse(date2, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                                            System.out.println("Podaj datę kolejnej donacji w formacie rrrr-MM-dd");
                                            String date3 = scan.readLine();
                                            LocalDate donation3 = LocalDate.parse(date3, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                                            System.out.println("Podaj datę kolejnej donacji w formacie rrrr-MM-dd");
                                            String date4 = scan.readLine();
                                            LocalDate donation4 = LocalDate.parse(date4, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                                            LocalDate nextDonation = donation4.plusDays(56);
                                            System.out.println("\nSuper! Następna donacja możliwa " + nextDonation + "\nW tym roku oddałeś: " + quantityYear + "l krwi, przysługuje Ci zwrot podatku w wysokości: " + taxBack + "zł.");
                                            break;
                                        }
                                    case 4:
                                        {
                                            donations = howManyTimes + 1;
                                            quantityYear = donations * quantity;
                                            taxBack = quantityYear * 130;
                                            System.out.println("Podaj datę donacji w formacie rrrr-MM-dd");
                                            String date2 = scan.readLine();
                                            LocalDate donation2 = LocalDate.parse(date2, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                                            System.out.println("Podaj datę kolejnej donacji w formacie rrrr-MM-dd");
                                            String date3 = scan.readLine();
                                            LocalDate donation3 = LocalDate.parse(date3, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                                            System.out.println("Podaj datę kolejnej donacji w formacie rrrr-MM-dd");
                                            String date4 = scan.readLine();
                                            LocalDate donation4 = LocalDate.parse(date4, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                                            System.out.println("Podaj datę kolejnej donacji w formacie rrrr-MM-dd");
                                            String date5 = scan.readLine();
                                            LocalDate donation5 = LocalDate.parse(date5, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                                            LocalDate nextDonation = donation5.plusDays(56);
                                            System.out.println("\nSuper! Następna donacja możliwa " + nextDonation + "\nW tym roku oddałeś: " + quantityYear + "l krwi, przysługuje Ci zwrot podatku w wysokości: " + taxBack + "zł.");
                                            break;
                                        }
                                    case 5:
                                        {
                                            donations = howManyTimes + 1;
                                            quantityYear = donations * quantity;
                                            taxBack = quantityYear * 130;
                                            System.out.println("Podaj datę donacji w formacie rrrr-MM-dd");
                                            String date2 = scan.readLine();
                                            LocalDate donation2 = LocalDate.parse(date2, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                                            System.out.println("Podaj datę kolejnej donacji w formacie rrrr-MM-dd");
                                            String date3 = scan.readLine();
                                            LocalDate donation3 = LocalDate.parse(date3, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                                            System.out.println("Podaj datę kolejnej donacji w formacie rrrr-MM-dd");
                                            String date4 = scan.readLine();
                                            LocalDate donation4 = LocalDate.parse(date4, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                                            System.out.println("Podaj datę kolejnej donacji w formacie rrrr-MM-dd");
                                            String date5 = scan.readLine();
                                            LocalDate donation5 = LocalDate.parse(date5, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                                            System.out.println("Podaj datę kolejnej donacji w formacie rrrr-MM-dd");
                                            String date6 = scan.readLine();
                                            LocalDate donation6 = LocalDate.parse(date6, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                                            LocalDate nextDonation = donation6.plusDays(56);
                                            System.out.println("\nSuper! Następna donacja możliwa " + nextDonation + "\nW tym roku oddałeś: " + quantityYear + "l krwi, przysługuje Ci zwrot podatku w wysokości: " + taxBack + "zł.");
                                            break;
                                        }
                                }
                                System.out.println("Masz oddane: " + quantityYear + "l krwi co przekłada się na: " + taxBack + "zł zwrotu podatku, ekstra, nie?");
                            
                        }
                    }
                } else if (female.age < 18) {
                    System.out.println("\nPrzykro mi ale jesteś za młody na oddawanie krwi, minimalny wiek to 18 lat");
                } else if (female.age > 65) {
                    System.out.println("\nPrzykro mi ale maksymalny wiek krwiodawcy to 65 lat.");
                }
            } else if ((strTN.equals("N")) || (strTN.equals("n"))) {
                System.out.print("\nKtóra dana jest niewłaściwa? \n[1] Imię\n[2] Płeć\n[3] Waga\n[4] Wiek ");
                int Error = Integer.parseInt(scan.readLine());
                switch (Error) {
                    case 1:
                        System.out.println("Podaj poprawne imię: ");
                        female.firstName = scan.readLine();
                        break;
                    case 2:
                        System.out.println("Podaj swoją płeć: M lub K");
                        first.gender = scan.readLine();
                        break;
                    case 3:
                        System.out.println("Podaj poprawną wagę: ");
                        female.weight = Float.parseFloat(scan.readLine());
                        break;
                    case 4:
                        System.out.println("Podaj poprawny wiek: ");
                        female.age = Integer.parseInt(scan.readLine());
                        break;
                }
                System.out.println("\nImię: " + female.firstName + "\nPłeć: Kobieta" + "\nWaga: " + female.weight + "kg\nWiek: " + female.age);
                System.out.print("Czy oddałaś dziś krew? " );
                String TN = scan.readLine();
                if ((TN.equals("T")) || (TN.equals("t"))) {
                    donations = 1;
                    quantityYear = donations * quantity;
                    taxBack = quantityYear * 130;
                    LocalDate donationDate = LocalDate.now();
                    LocalDate nextDonationDate = donationDate.plusDays(56);
                    System.out.println("\nSuper! Następna donacja możliwa " + nextDonationDate);
                           
                        donations += donations;
                        quantityYear = donations * quantity;
                        taxBack = quantityYear * 130;
                        System.out.println("Podaj datę w formacie rrrr-MM-dd");
                        String date2 = scan.readLine();
                        LocalDate donation2 = LocalDate.parse(date2, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                        LocalDate nextDonation = donation2.plusDays(56);
                        System.out.println("\nSuper! Następna donacja możliwa " + nextDonation + "\nW tym roku oddałaś: " + quantityYear + "l krwi, przysługuje Ci zwrot podatku w wysokości: " + taxBack + "zł.");
                    }
                }
            }
        }
	}
}
