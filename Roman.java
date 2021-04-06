public class Roman {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please provide a number as parameter");
            return;
        }

        int input = Integer.parseInt(args[0]);

        if (input == 0) {
            System.out.println("The number needs to be between 1 und 5000.");
        }

        runTests();

        System.out.println(generateRomanNumber(input));   
    }

    public static void runTests() {
        test1();
        test2();
        test3();
        test4(); 
        test5();
        test6();
        test7();
        test8();
        test9();
        test10();
        test11();
        test12();
        test13();
        test14();
        test15();
    }

    public static String generateRomanNumber(int value) {
        if (value > 5000) 
            return "The number needs to be between 1 und 5000.";

        if (value - 1000 >= 0) 
            return "M" + generateRomanNumber(value - 1000);

        if (value - 900 >= 0) 
            return "C" + generateRomanNumber(value + 100);

        if (value - 500 >= 0) 
            return "D" + generateRomanNumber(value - 500);

        if (value - 400 >= 0) 
            return "C" + generateRomanNumber(value + 100);

        if (value - 100 >= 0) 
            return "C" + generateRomanNumber(value - 100);

        if (value - 90 >= 0) 
            return "X" + generateRomanNumber(value + 10);

        if (value - 50 >= 0) 
            return "L" + generateRomanNumber(value - 50);

        if (value - 40 >= 0) 
            return "X" + generateRomanNumber(value + 10);

        if (value - 10 >= 0) 
            return "X" + generateRomanNumber(value - 10);

        if (value - 9 >= 0)
            return "I" + generateRomanNumber(value + 1);

        if (value - 5 >= 0)
            return "V" + generateRomanNumber(value - 5) ;

        if (value - 1 == 3) 
            return "I" + generateRomanNumber(value + 1);

        if (value - 1 < 3 && value - 1 > 0) 
            return "I" + (generateRomanNumber(value - 1));

        if (value - 1 == 0) 
            return "I";
                

        return "";
    }



    public static void test1() {
        int input = 1;
        String output = "I";
        if (!generateRomanNumber(input).equals(output)) {
            System.out.println("Test 1 failed");
        }
    }

    public static void test2() {
        int input = 3;
        String expectedOutput = "III";
        String actualOutput = generateRomanNumber(input);
        if (!actualOutput.equals(expectedOutput)) 
            System.out.println("Test 2 failed");
        
    }

    public static void test3() {
        int input = 5;
        String expectedOutput = "V";
        String actualOutput = generateRomanNumber(input);
        if(!actualOutput.equals(expectedOutput))
            System.out.println("Test 3 failed");
    }

    public static void test4() {
        int input = 4;
        String expectedOutput = "IV";
        String actualOutput = generateRomanNumber(input);
        if(!actualOutput.equals(expectedOutput))
            System.out.println("Test 4 failed");
    }

    public static void test5() {
        int input = 7;
        String expectedOutput = "VII";
        String actualOutput = generateRomanNumber(input);
        if(!actualOutput.equals(expectedOutput))
            System.out.println("Test 5 failed");
    }

    public static void test6() {
        int input = 10;
        String expectedOutput = "X";
        String actualOutput = generateRomanNumber(input);
        if(!actualOutput.equals(expectedOutput))
            System.out.println("Test 6 failed");
    }

    public static void test7() {
        int input = 9;
        String expectedOutput = "IX";
        String actualOutput = generateRomanNumber(input);
        if(!actualOutput.equals(expectedOutput))
            System.out.println("Test 7 failed");
    }

    public static void test8() {
        int input = 50;
        String expectedOutput = "L";
        String actualOutput = generateRomanNumber(input);
        if(!actualOutput.equals(expectedOutput))
            System.out.println("Test 8 failed");
    }

    public static void test9() {
        int input = 100;
        String expectedOutput = "C";
        String actualOutput = generateRomanNumber(input);
        if(!actualOutput.equals(expectedOutput))
            System.out.println("Test 9 failed");
    }

    public static void test10() {
        int input = 90;
        String expectedOutput = "XC";
        String actualOutput = generateRomanNumber(input);
        if(!actualOutput.equals(expectedOutput))
            System.out.println("Test 10 failed");
    }

    public static void test11() {
        int input = 500;
        String expectedOutput = "D";
        String actualOutput = generateRomanNumber(input);
        if(!actualOutput.equals(expectedOutput))
            System.out.println("Test 11 failed");
    }

    public static void test12() {
        int input = 92;
        String expectedOutput = "XCII";
        String actualOutput = generateRomanNumber(input);
        if(!actualOutput.equals(expectedOutput))
            System.out.println("Test 12 failed");
    }

    public static void test13() {
        int input = 999;
        String expectedOutput = "CMXCIX";
        String actualOutput = generateRomanNumber(input);
        if(!actualOutput.equals(expectedOutput))
            System.out.println("Test 13 failed");
    }

    public static void test14() {
        int input = 5500;
        String expectedOutput = "The number needs to be between 1 und 5000.";
        String actualOutput = generateRomanNumber(input);
        if(!actualOutput.equals(expectedOutput))
            System.out.println("Test 14 failed");
    }

    public static void test15() {
        int input = 448;
        String expectedOutput = "CDXLVIII";
        String actualOutput = generateRomanNumber(input);
        if(!actualOutput.equals(expectedOutput))
            System.out.println("Test 15 failed");
    }



    


}

