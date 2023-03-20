public enum Cpu {
    INTEL,
    AMD;

    @Override
    public String toString() {
        return "Cpu{" +
                "brand='" + this.name() + '\'' +
                '}';
    }
}
