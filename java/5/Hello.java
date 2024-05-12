package rapidfastner;

// import java.util.StringTokenizer;

public class Hello {
    public static void main(String[] args) {
//        String str = "syco.mp.txt";
       
//        int a[] = new int[str.length()];
//        
//        System.out.println(str);
//        System.out.println(str.toLowerCase());
//        System.out.println(str.toUpperCase());
//        System.out.println(str.charAt(0));
//        for(int i = 0; i < str.length(); i++) {
//            System.out.println((int) str.charAt(i));
//            a[i] = (int)str.charAt(i);
//            a[i] += 3;
//            System.out.println((char)a[i]);
//        }
//        System.out.println(str.contains("co"));
//        int val = str.indexOf(".");
//        System.out.println(val);
//        
//        int val1 = str.lastIndexOf(".");
//        System.out.println(val1);
        
//        String str = "I am; the; student; of sy; co class";
//        StringTokenizer st = new StringTokenizer(str, "; ");
//        
//        while(st.hasMoreTokens()) {
//            System.out.println(st.nextToken());
//        }
//        
        String str1 = "1, Bharat, sy";
        String str2 = "2, Girish, sy";
        String str3 = "3, Tass, sy";
        
        StringBuffer sb = new StringBuffer();
        sb.append(str1);
        sb.append("\n" + str2);
        sb.append("\n" + str3);
        System.out.println(sb.toString());
    }
}