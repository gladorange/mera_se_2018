package atarasov.lesson10;

public class ClassWithMethods {


    public  Integer plus(Integer a, Integer b) {
        return a + b;
    }
    public  Integer minus(Integer a, Integer b) {
        return a - b;
    }
    public  Integer star(Integer a, Integer b) {
        return a * b;
    }
    public  Integer slash(Integer a, Integer b) {
        return a / b;
    }

    interface MathOperation {
        int calc(Integer one, Integer another);
    }

    static class SummClass implements MathOperation {
        @Override
        public int calc(Integer one, Integer another) {
            return new ClassWithMethods().plus(one,another);
        }
    }

    public static void main(String[] args) {

        MathOperation summClass = new SummClass();
        System.out.println(summClass.calc(42, 2));

        ClassWithMethods instance = new ClassWithMethods();

        MathOperation lambda = (a, b) -> instance.plus(a, b);

        MathOperation methodReference = instance::plus;

















   /*     MathOperation sum = ClassWithMethods::plus;
        MathOperation subtraction = ClassWithMethods::minus;
        MathOperation product = ClassWithMethods::star;
        MathOperation dividing = ClassWithMethods::slash;

        subtraction.calc(2, 4);

        Stream.of(3, 2, 1);
        Optional<String> reduced =
                Stream.of("c","b","a")
                        .sorted()
                        .reduce((s1, s2) -> s1 + "#" + s2);
                        */
    }
}
