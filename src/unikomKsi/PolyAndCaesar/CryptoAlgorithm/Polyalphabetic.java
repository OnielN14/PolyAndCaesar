package unikomKsi.PolyAndCaesar.CryptoAlgorithm;

import java.util.*;
import unikomKsi.PolyAndCaesar.CryptoAlgorithm.model.CryptoTable;
import unikomKsi.PolyAndCaesar.CryptoAlgorithm.model.PolyalphabeticKey;
/**
 *
 * @author oniel
 */
public class Polyalphabetic extends CryptoAlgorithm{
    
    private ArrayList<PolyalphabeticKey> keys = new ArrayList<>();

    private static Polyalphabetic instance = null;
    
    public static Polyalphabetic getInstance(){
        if (instance == null) {
            instance = new Polyalphabetic();
        }
        
        return instance;
    }
    
    public ArrayList<PolyalphabeticKey> getKeys() {
        return keys;
    }

    public void setKeys(ArrayList<PolyalphabeticKey> keys) {
        this.keys = keys;
        this.fillingKey();
    }
    
    @Override
    public String encode(Object str) {
        char[] strToChars = str.toString().toLowerCase().toCharArray();
        for(int indexPlainText = 0; indexPlainText < strToChars.length; indexPlainText++){
            for(int indexKeys = 0; indexKeys < this.keys.size(); indexKeys++){
                for(CryptoTable item : this.encryptionTable(this.keys.get(indexKeys))){
                    if (strToChars[indexPlainText] == item.getValue()) {
                        strToChars[indexPlainText] = item.getKey();
                        break;
                    }
                }
            }
        }
        return new String(strToChars);
    }

    @Override
    public String decode(Object str) {
        char[] strToChars = str.toString().toLowerCase().toCharArray();
        for(int indexPlainText = 0; indexPlainText < strToChars.length; indexPlainText++){
            for(int indexKeys = this.keys.size()-1; indexKeys >= 0; indexKeys--){
                for(CryptoTable item : this.encryptionTable(this.keys.get(indexKeys))){
                    if (strToChars[indexPlainText] == item.getKey()) {
                        strToChars[indexPlainText] = item.getValue();
                        break;
                    }
                }
            }
        }
        return new String(strToChars);
    }
    
    public ArrayList<CryptoTable> encryptionTable(PolyalphabeticKey key){
        ArrayList<CryptoTable> table = new ArrayList<>();
        char[] polyTableKeys = this.createPolyTableKeys(key);
        for(int index =0; index<this.alphabets.length;index++){
            table.add(new CryptoTable(polyTableKeys[index], this.alphabets[index]));
        }
        
        return table;
    }
    
    private char[] createPolyTableKeys(PolyalphabeticKey key) {
        char[] polyKey = new char[this.alphabets.length];
        
        int index, lastIndex = 0;
        for(index = 0; index < key.getKey().length(); index++){
            polyKey[index] = key.getKey().toCharArray()[index];
        }
        
        lastIndex = index;
        for(index = lastIndex; index < this.alphabets.length ;index++){
            for(int alphabetsIndex = 0; alphabetsIndex < this.alphabets.length; alphabetsIndex++){
                if (!this.isCharExistInKey(this.alphabets[alphabetsIndex], new String(polyKey))) {
                    polyKey[index] = this.alphabets[alphabetsIndex];
                    break;
                }
            }
        }
        
        return polyKey;
    }
    
    private boolean isCharExistInKey(char alphabet, String key) {
        List<Character> keyAsList = this.charsToCharList(key.toCharArray());
        return keyAsList.contains(alphabet);
    }
    
    private List<Character> charsToCharList(char[] charArray) {
        List<Character> charList = new ArrayList<>();
        for (int i = 0; i < charArray.length; i++) {
            charList.add(charArray[i]);
        }
        
        return charList;
    }
    
    private void fillingKey(){
        for(PolyalphabeticKey key : this.keys){
            key.setKey(this.polyKeyBuilder(key.getText()));
        }
    }
    
    public String polyKeyBuilder(String text){
        char[] chars = this.spaceRemover(text).toLowerCase().toCharArray();
        List<Character> characterList = new ArrayList<>();
        for(char i : chars){
            characterList.add(i);
        }
        Set<Character> set = new LinkedHashSet<>(characterList);
        
        char[] uniqueChars = new char[set.size()];
        for (int i = 0; i < set.size(); i++) {
            uniqueChars[i] = (char) set.toArray()[i];
        }
        
        return new String(uniqueChars);
    }
    
    private String spaceRemover(String text){
        return text.replaceAll(" ", "");
    }
    
}
