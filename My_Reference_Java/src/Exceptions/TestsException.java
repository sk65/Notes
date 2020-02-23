package Exceptions;

public class TestsException {

    public static void main(String[] args) throws MyException {

        try {
            testException("1");
        } catch (MyException e) {
            e.printStackTrace();
        } finally {
            System.out.println("That is all");
        }
        testException("1");

    }

    static void testException(String string) throws MyException {
        if (string.equals("1")) {
            throw new MyException("string should not be one");
        } else {
            System.out.println(string);
        }

    }

    static void testRuntimeException(String string) {
        if (string.equals("1")) {
            throw new myRuntimeException(("Runtime string should not be one"));
        } else {
            System.out.println(string);
        }

    }
}


