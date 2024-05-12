public class CryptographyDES {

    String KEY = "password";
    
    public SecretKeySpec createKey(String chave) {
        try {
            byte[] charac = chave.getBytes("UTF-8");
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            charac = md.digest(charac);
            charac = Arrays.copyOf(charac, 16);
            SecretKeySpec secretKeySpec = new SecretKeySpec(charac, "DES/ECB/PKCS5Padding");
            return secretKeySpec;
        } catch (Exception e) {
            return null;
        }

    }

    
    public String crypt(String encrypt) {

        try {
            SecretKeySpec secretKeySpec = createKey(KEY);
            Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);

            byte[] charac = encrypt.getBytes("UTF-8");
            byte[] encrypted = cipher.doFinal(charac);
            String encrypted_charac = java.util.Base64.getEncoder().encodeToString(encrypted);
            return encrypted_charac;

        } catch (Exception e) {
            return "fail";
        }
    }

    public String decrypt(String decrypt) {

        try {
            SecretKeySpec secretKeySpec = createKey(KEY);
            Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);

            byte[] charac = Base64.getDecoder().decode(decrypt);
            byte[] decryption = cipher.doFinal(charac);
            String decrypted_charac = new String(decryption);
            return decrypted_charac;

        } catch (Exception e) {
            return "fail decrp";
        }
    }

}

public class Test {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        String encrypted = "";
        
        String pass = "";

        CryptographyDES cryptography = new CryptographyDES();   

        
        UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");          
        UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 14));          
        pass = JOptionPane.showInputDialog("Enter a password to be encrypted of up to 8 characters: ");
        if (pass.length() <= 8) {
            System.out.println(cryptography.crypt(pass));
            System.out.println(pass);               
            encrypted = cryptography.crypt(pass);
            JOptionPane.showMessageDialog(null, encrypted);
            System.out.println(encrypted);
            JOptionPane.showMessageDialog(null, "decrypted password: " + cryptography.decrypt(encrypted));
            
            
        } else {
            JOptionPane.showMessageDialog(null, "Error. Password longer than 8 characters. ");
            System.exit(0);
        }

    }

}