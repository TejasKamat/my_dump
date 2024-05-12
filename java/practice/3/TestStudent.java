import java.io.*;

public class TestStudent {
    public static void main(String args[]) {
        Student s1 = new Student();

		s1.setStudentName("Tejas");
		s1.setStudentId("32");
		s1.setStudentAddress("Ponda");
		s1.displayStudentInfo();
		
		Student s2 = new Student("Girish", "58", "shiroda");
		s2.displayStudentInfo();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String a = br.readLine();
        } catch(IOException a) {
            System.out.println("gsdfnhj");

        }
    }
}