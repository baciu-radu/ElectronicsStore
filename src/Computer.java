import java.util.Date;

public class Computer extends Electronics {

    public Screen screen;
    public Cpu cpu;
    public RamMemory ramMemory;

    public Computer(String manufacturer, Date dateOfProduction, int price, Screen screen, Cpu cpu, RamMemory ramMemory) {
        super(manufacturer, dateOfProduction, price);
        this.screen = screen;
        this.cpu = cpu;
        this.ramMemory = ramMemory;

    }

    public Computer(String manufacturer, Date yearOfProduction, int price) {
        super(manufacturer, yearOfProduction, price);
    }
}
