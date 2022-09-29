package task1;

import java.util.Objects;
import java.util.Random;

public class VectorXYZ {
    private int x;
    private int y;

    private int z;

    private final String description;

    public VectorXYZ(String description) {
        this.description = "This is a vector for a three-dimensional coordinate system";
    }

    public VectorXYZ(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.description = "This is a vector for a three-dimensional coordinate system";
    }


    public int vectorLength() {
        int result = (int) Math.sqrt(Math.pow(this.x, 2) + (Math.pow(this.y, 2)) + (Math.pow(this.z, 2)));
        System.out.println("Lenght of " + this.getClass().getName() + " is " + result);
        return result;
    }

    public int scalarMultiply(VectorXYZ vector) {
        int result = 0;
        result = (this.x * vector.x + this.y * vector.y + this.z * vector.z);
        System.out.println("Scalar multiply of vectors" + " = " + result);
        return result;
    }

    public VectorXYZ vectorSum(VectorXYZ vector) {
        VectorXYZ result = null;
        result = new VectorXYZ(this.x + vector.x, this.y + vector.y, this.z + vector.z);
        System.out.println("Sum of the vectors" + result);
        return result;
    }

    public VectorXYZ vectorDiff(VectorXYZ vector) {
        VectorXYZ result = null;
        result = new VectorXYZ(Math.abs(this.x - vector.x), Math.abs(this.y - vector.y), Math.abs(this.z - vector.z));
        System.out.println("Difference of the vectors" + result);
        return result;
    }

    public static VectorXYZ[] initN(int N) {
        VectorXYZ[] result = new VectorXYZ[N];
        Random random = new Random();
        for (int i = 0; i < result.length; i++) {
            result[i] = new VectorXYZ(random.nextInt(10, 20), random.nextInt(10, 20), random.nextInt(10, 20));
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        return result;
    }

    @Override
    public String toString() {
        return "VectorXYZ{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +"}"+
                "," + description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VectorXYZ vectorXYZ = (VectorXYZ) o;
        return x == vectorXYZ.x && y == vectorXYZ.y && z == vectorXYZ.z && Objects.equals(description, vectorXYZ.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z, description);
    }

    public static void showInfo(VectorXYZ vector){
        System.out.println(vector.toString());
    }
}
