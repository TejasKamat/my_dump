package ExceptionTest;

import javax.naming.SizeLimitExceededException;
import java.io.*;

public class TestExceptions {
    public static int a, b;
    public static void main(String args[]) {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            a = Integer.parseInt(br.readLine());
            b = 76;
            while (a != 0) {
                a *= b;
                System.out.println(a);
            }
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException a) {
            System.err.println(a.getMessage());
        } catch (IOException no) {
            System.err.println("no such method");
            a = b;
            System.out.println("The value of a is : " + a + "(From exception)");
        } catch (OutOfMemoryError o) {
            System.out.println(o.getMessage() + "This is the exception");
        }
    }
}
/* *
 * ArrayIndexOutOfBoundsException
 * ArithmeticException
 * IOException
 * ClassNotFoundException
 * FileNotFoundException
 * NoSuchMethodException
 * RuntimeException
 * */