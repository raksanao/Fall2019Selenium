package com.automation.officeHour;



import java.util.*;

public class Sets {
    public static void main(String[] args) {
        HashSet<String> hash = new HashSet<>();//prints mixed
        LinkedHashSet<String> link = new LinkedHashSet<>();//printes as it is
        TreeSet<String> tre = new TreeSet<>();// prints sorted
        for (String each : Arrays.asList("2jjj", "3kk", "1cnng", "3kk")) {
            hash.add(each);
            link.add(each);
            tre.add(each);
        }

        System.out.println(hash);
        System.out.println(link);
        System.out.println(tre);
        Iterator<String> iteretSEt = hash.iterator();
        while (iteretSEt.hasNext()) {
            System.out.println(iteretSEt.next());
        }

        ArrayList<Integer>dropDown=new ArrayList<>(Arrays.asList(1,1,2,3,4,5));
        System.out.println(dropDown);
HashSet<Integer>optionSet=new HashSet<>(dropDown);
        System.out.println(optionSet);
        if(optionSet.size()==dropDown.size())
        {
            System.out.println("expected is same as actual");
        }else{
            System.out.println("option contains duplicate");
        }
        PriorityQueue<String>priority=new PriorityQueue<>();
        priority.add("john");
        priority.add("kate");
        priority.add("tom");
        System.out.println(priority.peek());
    }


}
