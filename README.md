# PolyAndCaesar
Polyalphabetic and Caesar Technique in Cryptography. This project was initialized for research purposes and to fulfill an assignment in Information System Security Subject.

## Usage
1. Polyalphabetic

```java
class SimpleClass{

    public static void main(String[] argument){
        
        // 1. Getting the instance of the class
        Polyalphabetic polyalphabetic = Polyalphabetic.getInstance();

        // 2. Set the key. You can set more than one key
        ArrayList<PolyalphabeticKey> keyList = new ArrayList<>();
        keyList.add(new PolyalphabeticKey(0, "first key"));
        keyList.add(new PolyalphabeticKey(1, "second key"));

        polyalphabetic.setKeys(keyList);

        // 3. Call the encode or decode method
        // 3.a. encode 
        System.out.println(polyalphabetic.encode("Love Humanity"));

        // 3.b. decode 
        System.out.println(polyalphabetic.decode("obtr xmkdyslw"));
    }

}

```

2. Caesar

```java
class SimpleClass{

    public static void main(String[] argument){
        
        // 1. Getting the instance of the class
        CaesarSubtitution caesarSubtitution = CaesarSubtitution.getInstance();

        // 2. Set the key.
        caesarSubtitution.setKey(2);

        // 3. Call the encode or decode method
        // 3.a. encode 
        System.out.println(polyalphabetic.encode("Everyone is Amazing"));

        // 3.b. decode 
        System.out.println(polyalphabetic.decode("ctcpwmlc gq ykyxgle"));
    }

}

```

## Note
- Only alphabet. Cannot use symbol or number.
- The text would be converted into lower case.

## Credit
Thanks to humanity. Love You Everyone!!! Because You All Are **Amazing**!!!