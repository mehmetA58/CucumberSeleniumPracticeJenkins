package com.vytrack.practice;

import java.util.*;

public class iterator {

    private static Iterator<String> Itrnames;

    public static void main(String[] args) {


        Collection <Integer> nums = new ArrayList <>();
        nums.add(5);
        nums.add(10);
        nums.add(15);
        nums.add(19);
        System.out.println(nums);
        Iterator <Integer> itrNums = nums.iterator();
        while (itrNums.hasNext())
            if(itrNums.next()>10)
                itrNums.remove();

        System.out.println(nums);

    System.out.println("====================");

        List<String > names=new LinkedList <>();
        names.add("Holy");
        names.add("Elif");
        names.add("Basak");
        System.out.println(names);
          Itrnames=names.iterator();
          while (Itrnames.hasNext()){
              if(Itrnames.next()=="Basak"){
                  Itrnames.remove();
              }

          }

        System.out.println(names);


    }
}