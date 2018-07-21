package shiro;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

public class TestMd5 {
   public static void main(String[] args) {
	   String hashAlgorithmName = "MD5";
       String credentials = "123456";
       int hashIterations = 2;
       ByteSource credentialsSalt = ByteSource.Util.bytes("admin");
       Object obj = new SimpleHash(hashAlgorithmName, credentials, credentialsSalt, hashIterations);
       System.out.println(obj);	
    }
    
}
