import java.util.Objects;

public class Cords {
    private final int x;
    private final int y;

    public Cords(int x, int y) {

        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cords cords = (Cords) o;
        return x == cords.x &&
                y == cords.y;
    }

    @Override
    public int hashCode() {

        return Objects.hash(x, y);
    }
}
