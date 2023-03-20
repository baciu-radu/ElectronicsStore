import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ParseException {

        Cpu cpuAMD = new Cpu("AMD");
        Cpu cpuIntel = new Cpu("Intel");
        RamMemory ram16 = new RamMemory(16);
        RamMemory ram32 = new RamMemory(32);
        RamMemory ram64 = new RamMemory(64);
        Screen fullHD = new Screen("Full HD");
        Screen ultraHD = new Screen("Ultra HD");
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        List<Electronics> electronicsList = new ArrayList<Electronics>();
        Electronics electronics1 = new Computer("Dell", df.parse("1999-08-12"), 1000, fullHD, cpuAMD, ram16);
        electronicsList.add(electronics1);
        Electronics electronics2 = new Electronics("Apple", df.parse("2005-05-11"), 2000);
        electronicsList.add(electronics2);
        Electronics electronics3 = new Electronics("Samsung", df.parse("2008-04-30"), 1850);
        electronicsList.add(electronics3);
        Electronics electronics4 = new Electronics("Dell", df.parse("2010-08-23"), 2050);
        electronicsList.add(electronics4);
        Electronics electronics5 = new Electronics("Dell", df.parse("2022-05-21"), 9000);
        electronicsList.add(electronics5);
        Electronics electronics6 = new Electronics("Huawei", df.parse("2019-02-11"), 8000);
        electronicsList.add(electronics6);


        System.out.println("The electronics manufactured by Dell and produced after the year 2009 are: ");
        for (Electronics electronics : electronicsList) {
            if ((electronics.manufacturer == "Dell") && (electronics.dateOfProduction.compareTo(df.parse("2009-01-01")) > 0)) {
                System.out.println(electronics);
            }

        }

        List<Laptop> laptopList = new ArrayList<Laptop>();

        Laptop laptop1 = new Laptop("Dell", df.parse("2005-05-11"), 9815, cpuAMD, ram16, fullHD);
        laptopList.add(laptop1);
        Laptop laptop2 = new Laptop("HP", df.parse("2019-02-11"), 8454, cpuIntel, ram32, fullHD);
        laptopList.add(laptop2);
        Laptop laptop3 = new Laptop("Dell", df.parse("2022-05-21"), 18202, cpuAMD, ram64, ultraHD);
        laptopList.add(laptop3);

        for (Laptop laptop : laptopList) {
            if ((laptop.screen.equals(fullHD)) && (laptop.cpu == cpuIntel)) {
                System.out.println("\nThe laptop with Intel CPU and Full HD screen is: \n" + laptop);
            }
        }

        int totalPriceElectronics = 0;
        for (Electronics electronics : electronicsList) {
            totalPriceElectronics += electronics.price;
        }
        System.out.println("\nTotal price of electronics from list is: " + totalPriceElectronics);
    }
}