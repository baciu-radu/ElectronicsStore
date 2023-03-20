public enum RamMemory {
    MIN(16),
    MED(32),
    MAX(64);
    private int amount;

    RamMemory(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "RamMemory{" +
                "size=" + this.amount +
                '}';
    }
}
