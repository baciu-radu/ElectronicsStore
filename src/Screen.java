public class Screen {
    String resolution;

    public Screen(String resolution) {
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return "Screen{" +
                "resolution='" + resolution + '\'' +
                '}';
    }
}
