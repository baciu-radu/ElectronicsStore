import java.util.Date;

public class Electronics {

    String manufacturer;
    Date dateOfProduction;
    int price;

    public Electronics(String manufacturer, Date dateOfProduction, int price) {
        this.manufacturer = manufacturer;
        this.dateOfProduction = dateOfProduction;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Electronics{" +
                "manufacturer='" + manufacturer + '\'' +
                ", yearOfProduction=" + dateOfProduction +
                ", price=" + price +
                '}';
    }
}
