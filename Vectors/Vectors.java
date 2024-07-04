package Vectors;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class Vectors {
    public static void main(String[] args) {
        List<Integer>v = new ArrayList<>();
        for(int i=0;i<10;i++){
            v.add(i);
        }
        System.out.println(v.get(2));
        System.out.println(v);
    }
}
