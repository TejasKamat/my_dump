public class Cryptography{
    
        String KEY = "password";
        
        public SecretKeySpec createKey(String chave) {
            try {
                byte[] charac = chave.getBytes("UTF-8");
                MessageDigest md = MessageDigest.getInstance("SHA-1");
                charac = md.digest(charac);
                charac = Arrays.copyOf(charac, 16);
                SecretKeyFactory factory = SecretKeyFactory.getInstance("DES");
                SecretKey key = factory.generateSecret(new   DESKeySpec(charac));
                return secretKeySpec;
            } catch (Exception e) {
                return e.toString();
            }
    
        }
    
        
        public String crypt(String encrypt) {
    
            try {
                SecretKeySpec secretKeySpec = createKey(KEY);
                Cipher cipher = Cipher.getInstance("DES");
                cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
    
                byte[] charac = encrypt.getBytes("UTF-8");
                byte[] encrypted = cipher.doFinal(charac);
                String encrypted_charac = java.util.Base64.getEncoder().encodeToString(encrypted);
                return encrypted_charac;
    
            } catch (Exception e) {
                return e.toString();
            }
        }
    
        public String decrypt(String decrypt) {
    
            try {
                SecretKeySpec secretKeySpec = createKey(KEY);
                Cipher cipher = Cipher.getInstance("DES");
                cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);
    
                byte[] charac = Base64.getDecoder().decode(decrypt);
                byte[] decryption = cipher.doFinal(charac);
                String decrypted_charac = new String(decryption);
                return decrypted_charac;
    
            } catch (Exception e) {
                return e.toString();
            }
        }
    
    }