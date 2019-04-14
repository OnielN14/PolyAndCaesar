package unikomKsi.PolyAndCaesar;

import unikomKsi.PolyAndCaesar.CryptoAlgorithm.CaesarSubtitution;

/**
 *
 * @author oniel
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CaesarSubtitution caesarSubtitution = CaesarSubtitution.getInstance();
        
        caesarSubtitution.setKey(2);
        String strEncrypted = caesarSubtitution.encode("Nama Saya");
        String strDecrypted = caesarSubtitution.decode(strEncrypted);
        
        System.out.println("encrypted :" + strEncrypted);
        System.out.println("decrypted :" + strDecrypted);
    }
    
}
