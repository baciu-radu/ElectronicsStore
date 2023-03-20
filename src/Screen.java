public enum Screen {
    FULL_HD(1920, 1080),
    ULTRA_HD(4096, 2560);

    private final int width;
    private final int height;

    Screen(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Screen{" +
                "resolution='" + this.name() + '\'' +
                '}';
    }
}
