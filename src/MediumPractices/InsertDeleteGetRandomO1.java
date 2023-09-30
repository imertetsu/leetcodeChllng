package MediumPractices;

import java.util.*;

public class InsertDeleteGetRandomO1 {

    //List<Integer> list;
    Map<Integer, Integer> hash;
    public InsertDeleteGetRandomO1(){
        //list = new ArrayList<>();
        hash = new HashMap<>();
    }

    public boolean insert(int val) {
        if(hash.containsKey(val)){
            System.out.println("FALSE");
            System.out.println(hash.toString());
            return false;
        }
        //list.add(val);
        System.out.println("SIZE: "+hash.size());
        hash.put(val, hash.size());
        System.out.println("TRUE");
        System.out.println(hash.toString());
        return true;
    }

    public boolean remove(int val) {
        if(!hash.containsKey(val)){
            System.out.println("FALSE");
            System.out.println(hash.toString());
            return false;
        }
        int index = hash.get(val);
        //list.remove(index);
        hash.remove(val);
        System.out.println("TRUE");
        System.out.println(hash.toString());
        return true;
    }

    public int getRandom() {
        Random random = new Random();
        List<Integer> list = new ArrayList<>(hash.keySet());
        System.out.println(list.toString());
        int randomValue = random.nextInt(list.size());
        System.out.println("RANDOM VALUE: "+ list.get(randomValue));
        return list.get(randomValue);
    }

}
