import java.lang.*;

class exorencrypt {
    String PT = "hello";
    String key_str="hi";PT=PT.toLowerCase();
    // str to binary
    byte[] bytes = PT.getBytes();
    StringBuilder binary = new StringBuilder();for(
    byte b:bytes)
    {
        int val = b;
        for (int i = 0; i < 8; i++) {
            binary.append((val & 128) == 0 ? 0 : 1);
            val <<= 1;
        }
        binary.append(' ');
    }System.out.println("'"+PT+"' to binary: "+binary);

    // str to binary
    byte[] bytes_key = key_str.getBytes();
    StringBuilder key = new StringBuilder();for(
    byte b:bytes_key)
    {
        int val = b;
        for (int i = 0; i < 8; i++) {
            key.append((val & 128) == 0 ? 0 : 1);
            val <<= 1;
        }
        key.append(' ');
    }System.out.println("'"+key_str+"' to binary: "+key);

    int PT_int = binaryToDecimal(binary);
    int Key_int = binaryToDecimal(key);

    System.out.println("' binary: "+PT_int);System.out.println("' key: "+Key_int);

    // int CT= (binary ^ key);
    // System.out.println("CT"+ binary);

}
