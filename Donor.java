package krwiodawca;
import java.util.Scanner;
import java.time.Duration;
import java.time.LocalDate;
//import java.time.LocalTime;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.io.IOException;
import java.text.ParseException;

public class Donor {
	static void Main(String[] args) throws ParseException, IOException
    {
		Scanner scan = new Scanner(System.in);
        Human first = new Human(); 													//zdefiniowanie człowieka
        double quantityDonated = 0.45;
        int daysLeft = 56, donations;
        double quantityYear, taxBack;
        //Date date1 = new Date();
        //SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        System.out.print("Witaj w arkuszu krwiodawcy, jak masz na imię? ");
        first.firstName = scan.nextLine();

        System.out.print("Potrzebuję Twojego wieku ");
        first.age = scan.nextInt();

        System.out.print("Jaka jest Twoja waga? ");
        first.weight = scan.nextInt();

        System.out.print("Potwierdź swoją płeć wciskając: \nK - Kobieta\nM - Mężczyzna ");
        first.gender = scan.nextLine();

        if ((first.gender == "M") || (first.gender == "m"))
        {
            System.out.println("\nImię: " + first.firstName + "\nPłeć: " + first.gender + "ężczyzna" + "\nWaga: " + first.weight + "kg\nWiek: " + first.age);

            System.out.print("\nCzy potwierdzasz kartę? \nT - Tak\nN - Nie ");
            String strTN = scan.nextLine();
            if ((strTN == "T") || (strTN == "t"))
            {
                
                if (first.age >= 18 && first.age <= 65)
                {
                    if (first.weight <= 50)
                    {
                        System.out.println("\nPrzykro mi ale nie możesz zostać krwiodawcą, musisz ważyć minimum 50kg");
                        System.in.read();
                    } else if (first.weight > 50)
                    {
                        System.out.println("\nSuper, spełniasz warunki krwiodawcy, zapraszamy do najbliższego RCKiK wraz z dowodem osobistym");
                        System.out.print("Czy oddałeś dziś krew? ");
                        String TN = scan.nextLine();
                        if (TN == "T" || TN == "t")
                        {
                            donations = 1;
                            taxBack = donations * quantityDonated * 130;
                            Date donationDate = new Date();//.AddDays(daysLeft);
                            System.out.println("\nSuper! Następna donacja możliwa " + Duration.ofDays(56));
                            System.out.println("Czy oddawałeś krew jeszcze w tym roku?");
                            strTN = scan.nextLine();
                            if ((strTN == "T") || (strTN == "t"))
                            {
                                System.out.println("Ile razy? ");                //dodawanie dat donacji
                                int howManyTimes = scan.nextInt();
                                quantityYear = (howManyTimes + 1) * quantityDonated;
                                switch (howManyTimes)
                                {
                                    case 1:
                                        {
                                            donations += donations;
                                            taxBack = donations * quantityDonated * 130;
                                            System.out.println("Podaj datę w formacie rrrr-mm-dd");
                                            String strDate2 = scan.nextLine();
                                            SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
                                            Date date2 = sdf2.parse(strDate2);
                                            System.out.println(date2);
                                            break;
                                        }
                                    case 2:
                                        {
                                            donations = howManyTimes + 1;
                                            taxBack = donations * quantityDonated * 130;
                                            System.out.println("Podaj datę donacji w formacie rrrr-mm-dd");
                                            String strDate2 = scan.nextLine();
                                            SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
                                            Date date2 = sdf2.parse(strDate2);
                                            System.out.println("Podaj datę kolejnej donacji w formacie rrrr-mm-dd");
                                            String strDate3 = scan.nextLine();
                                            SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd");
                                            Date date3 = sdf3.parse(strDate3);
                                            break;
                                        }
                                    case 3:
                                        {
                                            donations = howManyTimes + 1;
                                            taxBack = donations * quantityDonated * 130;
                                            System.out.println("Podaj datę donacji w formacie rrrr-mm-dd");
                                            String strDate2 = scan.nextLine();
                                            SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
                                            Date date2 = sdf2.parse(strDate2);
                                            System.out.println("Podaj datę kolejnej donacji w formacie rrrr-mm-dd");
                                            String strDate3 = scan.nextLine();
                                            SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd");
                                            Date date3 = sdf3.parse(strDate3);
                                            System.out.println("Podaj datę kolejnej donacji w formacie rrrr-mm-dd");
                                            String strDate4 = scan.nextLine();
                                            SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM-dd");
                                            Date date4 = sdf4.parse(strDate4);
                                            break;
                                        }
                                    case 4:
                                        {
                                            donations = howManyTimes + 1;
                                            taxBack = donations * quantityDonated * 130;
                                            System.out.println("Podaj datę donacji w formacie rrrr-mm-dd");
                                            String strDate2 = scan.nextLine();
                                            SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
                                            Date date2 = sdf2.parse(strDate2);
                                            System.out.println("Podaj datę kolejnej donacji w formacie rrrr-mm-dd");
                                            String strDate3 = scan.nextLine();
                                            SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd");
                                            Date date3 = sdf3.parse(strDate3);
                                            System.out.println("Podaj datę kolejnej donacji w formacie rrrr-mm-dd");
                                            String strDate4 = scan.nextLine();
                                            SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM-dd");
                                            Date date4 = sdf4.parse(strDate4);
                                            System.out.println("Podaj datę kolejnej donacji w formacie rrrr-mm-dd");
                                            String strDate5 = scan.nextLine();
                                            SimpleDateFormat sdf5 = new SimpleDateFormat("yyyy-MM-dd");
                                            Date date5 = sdf5.parse(strDate5);
                                            break;
                                        }
                                    case 5:
                                        {
                                            donations = howManyTimes + 1;
                                            taxBack = donations * quantityDonated * 130;
                                            System.out.println("Podaj datę donacji w formacie rrrr-mm-dd");
                                            String strDate2 = scan.nextLine();
                                            SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
                                            Date date2 = sdf2.parse(strDate2);
                                            System.out.println("Podaj datę kolejnej donacji w formacie rrrr-mm-dd");
                                            String strDate3 = scan.nextLine();
                                            SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd");
                                            Date date3 = sdf3.parse(strDate3);
                                            System.out.println("Podaj datę kolejnej donacji w formacie rrrr-mm-dd");
                                            String strDate4 = scan.nextLine();
                                            SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM-dd");
                                            Date date4 = sdf4.parse(strDate4);
                                            System.out.println("Podaj datę kolejnej donacji w formacie rrrr-mm-dd");
                                            String strDate5 = scan.nextLine();
                                            SimpleDateFormat sdf5 = new SimpleDateFormat("yyyy-MM-dd");
                                            Date date5 = sdf5.parse(strDate5);
                                            System.out.println("Podaj datę kolejnej donacji w formacie rrrr-mm-dd");
                                            String strDate6 = scan.nextLine();
                                            SimpleDateFormat sdf6 = new SimpleDateFormat("yyyy-MM-dd");
                                            Date date6 = sdf6.parse(strDate6);
                                            break;
                                        }
                                }
                                System.out.println("Masz oddane: " + quantityYear + "l krwi co przekłada się na: " + taxBack + "zł zwrotu podatku, ekstra, nie?");
                            System.in.read();
                        }
                    }
                } else if (first.age < 18)
                {
                    System.out.println("\nPrzykro mi ale jesteś za młody na oddawanie krwi, minimalny wiek to 18 lat");
                    System.in.read();
                } else if (first.age > 65)
                {
                    System.out.println("\nPrzykro mi ale maksymalny wiek krwiodawcy to 65 lat.");
                    System.in.read();
                }
            } else if (strTN == "N" || strTN == "n")
            {
                System.out.print("\nKtóra dana jest niewłaściwa? \n[1] Imię\n[2] Płeć\n[3] Waga\n[4] Wiek ");
                int Error = scan.nextInt();
                switch (Error)
                {
                    case 1:
                        System.out.println("Podaj poprawne imię: ");
                        first.firstName = scan.nextLine();
                        break;
                    case 2:
                        System.out.println("Podaj swoją płeć: M lub K");
                        first.gender = scan.nextLine();
                        break;
                    case 3:
                        System.out.println("Podaj poprawną wagę: ");
                        first.weight = scan.nextFloat();
                        break;
                    case 4:
                        System.out.println("Podaj poprawny wiek: ");
                        first.age = scan.nextInt();
                        break;
                }
                System.out.println("\nImię: " + first.firstName + "\nPłeć: " + first.gender + "ężczyzna" + "\nWaga: " + first.weight + "kg\nWiek: " + first.age);
                System.out.print("Czy oddałeś dziś krew? " );
                String TN = scan.nextLine();
                if (TN == "T" || TN == "t")
                {
                    donations = 1;
                    taxBack = donations * quantityDonated * 130;
                    LocalDate date = LocalDate.now();
                    LocalDate futureDate = date.plusDays(daysLeft);
                    System.out.println("\nSuper! Następna donacja możliwa " + futureDate);
                    
                           
                        donations += donations;
                        taxBack = donations * quantityDonated * 130;
                        System.out.println("Podaj datę w formacie rrrr-mm-dd");
                        String strDate2 = scan.nextLine();
                        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
                        Date date2 = sdf2.parse(strDate2);
                        System.out.println("Masz oddane: " + quantityDonated + "l krwi co przekłada się na: " + taxBack + "zł zwrotu podatku, ekstra, nie?");
                        
                    }
                    
                }
                System.in.read();
            }
        } else if (first.gender == "K" || first.gender == "k")
        {
        }
    }
}
