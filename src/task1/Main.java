package task1;

public class Main {
    public static void main(String[] args) {
        VectorXY vector1 = new VectorXY(2, 4);
        VectorXY vector2 = new VectorXY(3, 6);
        VectorXYZ vector3 = new VectorXYZ(2, 4, 8);
        VectorXYZ vector4 = new VectorXYZ(4, 6, 10);




        vector1.vectorLength();
        vector3.vectorLength();

        vector1.scalarMultiply(vector2);
        vector3.scalarMultiply(vector4);

        VectorXY.initN(4);
        VectorXYZ.initN(3);

        VectorXY.showInfo(vector1);
        VectorXYZ.showInfo(vector4);

        System.out.println(vector1.equals(vector1));
        System.out.println(vector3.equals(vector4));

    }
}