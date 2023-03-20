import java.util.Date;

public class Phone extends Electronics {

    public Screen screen;
    String type;

    public Phone(String manufacturer, Date dateOfProduction, int price, String type) {
        super(manufacturer, dateOfProduction, price);
        this.type = type;
    }
}
