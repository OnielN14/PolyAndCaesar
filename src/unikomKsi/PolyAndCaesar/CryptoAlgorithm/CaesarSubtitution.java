package unikomKsi.PolyAndCaesar.CryptoAlgorithm;

import java.util.ArrayList;
import unikomKsi.PolyAndCaesar.CryptoAlgorithm.model.CryptoTable;

/**
 *
 * @author oniel
 */
public class CaesarSubtitution extends CryptoAlgorithm{
       
    private int key;

    private static CaesarSubtitution instance = null;
    
    public static CaesarSubtitution getInstance(){
        if (instance == null) {
            instance = new CaesarSubtitution();
        }
        
        return instance;
    }
    
    @Override
    public String encode(Object str) {
        char[] strToChars = str.toString().toLowerCase().toCharArray();
        for(int index = 0; index < strToChars.length; index++){
            for(CryptoTable item : this.encryptionTable()){
                if(strToChars[index] == item.getValue()){
                    strToChars[index] = item.getKey();
                    break;
                }
            }
        }
        return new String(strToChars);
    }

    @Override
    public String decode(Object str) {
        char[] strToChars = str.toString().toLowerCase().toCharArray();
        for(int index = 0; index < strToChars.length; index++){
            for(CryptoTable item : this.encryptionTable()){
                if(item.getKey()== strToChars[index]){
                    strToChars[index] = item.getValue();
                    break;
                }
            }
        }
        return new String(strToChars);
    }
    
    public ArrayList<CryptoTable> encryptionTable(){
        ArrayList<CryptoTable> table = new ArrayList<>();
        char[] keys = createKey(this.alphabets.clone());
        for(int index =0; index<keys.length;index++){
            table.add(new CryptoTable(keys[index], this.alphabets[index]));
        }
        
        return table;
    }
    
    private char[] createKey(char[] alphabets) {
        int length = alphabets.length;
        for(int iteration = 0; iteration < this.key; iteration++){
            char temp = alphabets[length-1];
            for(int keyIndex = length-1;keyIndex>0;keyIndex--){
                alphabets[keyIndex] = alphabets[keyIndex-1];
            }
            alphabets[0] = temp;
        }
        
        return alphabets;
    }
     
    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    
}
