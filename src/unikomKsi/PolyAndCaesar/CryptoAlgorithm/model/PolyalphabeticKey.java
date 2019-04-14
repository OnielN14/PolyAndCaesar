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
public class PolyalphabeticKey {
    private String key;
    private String text;
    private int index;

    public PolyalphabeticKey(int index, String text) {
        this.text = text;
        this.index = index;
    }
    
    public PolyalphabeticKey(int index, String text, String key) {
        this.key = key;
        this.text = text;
        this.index = index;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
