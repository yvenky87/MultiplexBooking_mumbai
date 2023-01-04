package booking.util;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

public class JavaSecurity {
	static Cipher cipher = null;
	public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
		// TODO Auto-generated method stub
		KeyGenerator generator = KeyGenerator.getInstance("AES");
		generator.init(128);
		SecretKey key = generator.generateKey();
		
		cipher = Cipher.getInstance("AES");
		
		String text = "Hello Java";
		System.out.println("Before Encryption : "+text);
		String encrypted = encrypt(text, key);
		System.out.println("After Encryption :"+encrypted);
		String newEncrypted = decrypt(encrypted, key);
		System.out.println("After Decryption :"+newEncrypted);
	}	
	
	private static String encrypt(String text, SecretKey key) throws InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
		byte[] textBytes = text.getBytes();
		cipher.init(Cipher.ENCRYPT_MODE, key);
		byte[] encryptedBytes = cipher.doFinal(textBytes);
		Base64.Encoder encoder = Base64.getEncoder();
		String encrypted = encoder.encodeToString(encryptedBytes);
		return encrypted;
	}
	
	private static String decrypt(String text, SecretKey key) throws InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
		Base64.Decoder decoder = Base64.getDecoder();
		byte[] textBytes = decoder.decode(text);
		cipher.init(Cipher.DECRYPT_MODE, key);
		byte[] decryptedBytes = cipher.doFinal(textBytes);
		String decrypted = new String(decryptedBytes);
		return decrypted;
	}

}
