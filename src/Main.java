import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

//        List<Electronics> electronicsList = new ArrayList<Electronics>();
//        Electronics electronics1 = new Computer("Dell", df.parse("1999-08-12"), 1000, Screen.FULL_HD, Cpu.AMD, RamMemory.MIN);
//        electronicsList.add(electronics1);
//        Electronics electronics2 = new Electronics("Apple", df.parse("2005-05-11"), 2000);
//        electronicsList.add(electronics2);
//        Electronics electronics3 = new Electronics("Samsung", df.parse("2008-04-30"), 1850);
//        electronicsList.add(electronics3);
//        Electronics electronics4 = new Electronics("Dell", df.parse("2010-08-23"), 2050);
//        electronicsList.add(electronics4);
//        Electronics electronics5 = new Electronics("Dell", df.parse("2022-05-21"), 9000);
//        electronicsList.add(electronics5);
//        Electronics electronics6 = new Electronics("Huawei", df.parse("2019-02-11"), 8000);
//        electronicsList.add(electronics6);

        List<Electronics> electronicsList = List.of(
                new Computer("Dell", df.parse("1999-08-12"), 1000, Screen.FULL_HD, Cpu.AMD, RamMemory.MIN),
                new Electronics("Apple", df.parse("2005-05-11"), 2000),
                new Electronics("Samsung", df.parse("2008-04-30"), 1850),
                new Electronics("Dell", df.parse("2010-08-23"), 2050),
                new Electronics("Dell", df.parse("2022-05-21"), 9000),
                new Electronics("Huawei", df.parse("2019-02-11"), 8000));

//Print all the electronics manufactured after a certain date and are from the same manufacturer

        System.out.println("The electronics manufactured by Dell and produced after the year 2009 are: ");


        for (Electronics electronics : electronicsList) {
            if ((electronics.manufacturer == "Dell") && (electronics.dateOfProduction.compareTo(df.parse("2009-01-01")) > 0)) {
                System.out.println(electronics);
            }

        }

//        Create a new list with several laptops and filter the ones that have full HD screen and intel CPU
        List<Laptop> laptopList = new ArrayList<Laptop>();

        Laptop laptop1 = new Laptop("Dell", df.parse("2005-05-11"), 9815, Cpu.AMD, RamMemory.MIN, Screen.FULL_HD);
        laptopList.add(laptop1);
        Laptop laptop2 = new Laptop("HP", df.parse("2019-02-11"), 8454, Cpu.INTEL, RamMemory.MED, Screen.FULL_HD);
        laptopList.add(laptop2);
        Laptop laptop3 = new Laptop("Dell", df.parse("2022-05-21"), 18202, Cpu.AMD, RamMemory.MAX, Screen.ULTRA_HD);
        laptopList.add(laptop3);

        laptopList
                .stream()
                .filter(item -> item.screen == Screen.FULL_HD && item.cpu == Cpu.INTEL)
                .forEach(item -> System.out.println("\nThe laptop with Intel CPU and Full HD screen is: \n" + item));

        int totalPriceElectronics = 0;
        for (Electronics electronics : electronicsList) {
            totalPriceElectronics += electronics.price;
        }
        System.out.println("\nTotal price of electronics from list is: " + totalPriceElectronics);
    }
}