package unikomKsi.PolyAndCaesar.CryptoAlgorithm;

/**
 *
 * @author oniel
 */
public abstract class CryptoAlgorithm {
    protected char[] alphabets = {'a','b','c','d','e','f','g','h','i','j','k',
        'l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    public abstract String encode(Object str);
    public abstract String decode(Object str);
}
