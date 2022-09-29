package task1;

import java.util.Objects;
import java.util.Random;

public class VectorXY {

    private int x;
    private int y;
    private final String description;

    public VectorXY() {
        this.description = "This is a vector for a two-dimensional coordinate system";
    }

    public VectorXY(int x, int y) {
        this.x = x;
        this.y = y;
        this.description = "This is a vector for a two-dimensional coordinate system";
    }

    public int vectorLength() {
        int result = (int) Math.sqrt(Math.pow(this.x, 2) + (Math.pow(this.y, 2)));
        System.out.println("Lenght of " + this.getClass().getName() + " is " + result);
        return result;
    }

    public int scalarMultiply(VectorXY vectorXY) {
        int result = 0;
        result = (this.x * vectorXY.x + this.y * vectorXY.y);
        System.out.println("Scalar multiply of vectors" + " = " + result);
        return result;
    }

    public VectorXY vectorSum(VectorXY vectorXY) {
        VectorXY result = null;
        result = new VectorXY(this.x + vectorXY.x, this.y + vectorXY.y);
        System.out.println("Sum of the vectors" + result);
        return result;
    }

    public VectorXY vectorDiff(VectorXY vectorXY) {
        VectorXY result = null;
        result = new VectorXY(Math.abs(this.x - vectorXY.x), Math.abs(this.y - vectorXY.y));
        System.out.println("Difference of the vectors" + result);
        return result;
    }

    public static VectorXY[] initN(int N) {
        VectorXY[] result = new VectorXY[N];
        Random random = new Random();
        for (int i = 0; i < result.length; i++) {
            result[i] = new VectorXY(random.nextInt(10, 20), random.nextInt(10, 20));
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        result.toString();
        return result;
    }


    @Override
    public String toString() {
        return "VectorXY {" +
                "x=" + x +
                ", y=" + y +
                "}," + description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VectorXY vectorXY = (VectorXY) o;

        return x == vectorXY.x && y == vectorXY.y && Objects.equals(description, vectorXY.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, description);
    }

    public static void showInfo(VectorXY vector) {
        System.out.println(vector.toString());
    }

}
