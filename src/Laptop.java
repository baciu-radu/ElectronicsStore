import java.util.Date;

public class Laptop extends Computer {

    public Laptop(String manufacturer, Date dateOfProduction, int price, Cpu cpu, RamMemory ramMemory, Screen screen) {
        super(manufacturer, dateOfProduction, price);
        this.cpu = cpu;
        this.ramMemory = ramMemory;
        this.screen = screen;

    }

    @Override
    public String toString() {
        return "Laptop{" +
                "screen=" + screen +
                ", cpu=" + cpu +
                ", ramMemory=" + ramMemory +
                ", manufacturer='" + manufacturer + '\'' +
                ", dateOfProduction=" + dateOfProduction +
                ", price=" + price +
                '}';
    }
}
