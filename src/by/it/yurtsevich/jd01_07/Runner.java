package by.it.yurtsevich.jd01_07;

public class Runner {
    public static void main(String[] args) {
        Scalar v1 = new Scalar(4.4);
        Var v2 = new Scalar(4.4);
        Var v3 = new Scalar("123.456");

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);

        Vector v4 = new Vector(new double[]{1, 5, 7, 9});
        Var v5 = new Vector(v4);
        String str = "{1.0, 2.0, 4.0}";
        Var v6 = new Vector(str);

        System.out.println(v4);
        System.out.println(v5);
        System.out.println(v6);


        Matrix v7 = new Matrix(new double[][]{{1, 2}, {3, 4}});
        Var v8 = new Matrix(v7);
        Var v9 = new Matrix("{{1.0, 2.0}, {3.0, 4.0}}");

        System.out.println(v7);
        System.out.println(v8);
        System.out.println(v9);



    }
}
