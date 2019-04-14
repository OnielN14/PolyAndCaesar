/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unikomKsi.PolyAndCaesar.CryptoAlgorithm.model;

/**
 *
 * @author oniel
 */
public class CryptoTable {
    private char key;
    private char value;

    public CryptoTable(char key, char value) {
        this.key = key;
        this.value = value;
    }

    public char getKey() {
        return key;
    }

    public void setKey(char key) {
        this.key = key;
    }

    public char getValue() {
        return value;
    }

    public void setValue(char value) {
        this.value = value;
    }
    
    
}
