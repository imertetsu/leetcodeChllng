package MediumPractices;

import java.util.HashMap;
import java.util.Map;

public class OrderLikeDictionary {

    public boolean isOrdered(String[] palabras){
        String orderDictionary = "abcdefghijklmnopqrstuvwxyz";
        Map<Character, Integer> dictionary = new HashMap<>();
        int max = 0;
        for (int i = 0; i < orderDictionary.length(); i++){
            dictionary.put(orderDictionary.charAt(i), i);
        }
        System.out.println("Valor: " + dictionary.values());
        System.out.println("Key: " + dictionary.keySet());
        System.out.println("Key a "+ dictionary.get('h'));

        interno:for (int i = 0; i < palabras.length -1; i++){
            if(palabras[i].length() <= palabras[i+1].length()){
                externo:for (int j = 0; j < palabras[i].length(); j++){
                    if(dictionary.get(palabras[i].charAt(j)) == dictionary.get(palabras[i+1].charAt(j))){
                        continue;
                    }else {
                        if(dictionary.get(palabras[i].charAt(j)) > dictionary.get(palabras[i+1].charAt(j))){
                            return false;
                        }else{
                            continue interno;
                        }
                    }
                }
            }else{
                externo:for (int j = 0; j < palabras[i+1].length(); j++){
                    if(dictionary.get(palabras[i].charAt(j)) == dictionary.get(palabras[i+1].charAt(j))){
                        continue;
                    }else {
                        if(dictionary.get(palabras[i].charAt(j)) > dictionary.get(palabras[i+1].charAt(j))){
                            return false;
                        }else{
                            continue interno;
                        }
                    }
                }
            }
            if (palabras[i].length() >= palabras[i+1].length()){
                return false;
            }
        }
        return true;
    }
}
