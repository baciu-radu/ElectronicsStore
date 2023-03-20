public class Cpu {


    String brand;

    public Cpu(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Cpu{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
