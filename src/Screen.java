public class Screen {
    String resolution;

    public Screen(String resolution) {
        this.resolution = resolution;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Screen)){
            return false;
        }
        return resolution.equals(((Screen)obj).resolution);
    }

    @Override
    public String toString() {
        return "Screen{" +
                "resolution='" + resolution + '\'' +
                '}';
    }
}
