package Collections;

import java.util.Objects;

public class Points {
    int x;
    int y;
    String color;
    String pointName;

    public Points(int x, int y, String color, String pointName) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.pointName = pointName;
    }
    @Override
    public boolean equals(Object o) {
        if (o == null || o.getClass() != getClass()) {
            return false;
        }
        Points p = (Points) o;
        return (p.x == x && p.y == y && Objects.equals(p.color, color) && Objects.equals(p.pointName, pointName));
    }
    @Override
    public int hashCode() {
        return Objects.hash(x, y, color, pointName);
    }
    @Override
    public String toString() {
        return "Points{" +
                "x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                ", pointName='" + pointName + '\'' +
                '}';
    }
}
