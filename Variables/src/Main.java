public class Main {
    public static void main(String[] args) {
        String name = "Aadarsh";
        int age = 21;
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello " + name + " Your age is " + age);
        }

        int maxInt = Integer.MAX_VALUE;
        int minInt = Integer.MIN_VALUE;
        System.out.println(maxInt);
        System.out.println(minInt);

        byte maxByte = Byte.MAX_VALUE;
        byte minByte = Byte.MIN_VALUE;
        System.out.println(maxByte);
        System.out.println(minByte);

        short maxShort = Short.MAX_VALUE;
        short minShort = Short.MIN_VALUE;
        System.out.println(maxShort);
        System.out.println(minShort);

        long maxLong = Long.MAX_VALUE;
        long minLong = Long.MIN_VALUE;
        System.out.println(maxLong);
        System.out.println(minLong);

        float maxFloat = Float.MAX_VALUE;
        float minFloat = Float.MIN_VALUE;
        System.out.println(maxFloat);
        System.out.println(minFloat);

        double maxDouble = Double.MAX_VALUE;
        double minDouble = Double.MIN_VALUE;
        System.out.println(maxDouble);
        System.out.println(minDouble);

        char ch = 'a';
        System.out.println(ch);

        boolean b = false;
        System.out.println(!b);
    }
}
