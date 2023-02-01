import java.util.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class F8 {
    public static void main(String[] args) {
        
        List<Integer> data = Arrays.asList(1,4,5,7,8,3,2,7);
        Collections.sort(data);
        PriorityQueue<Integer> out = new PriorityQueue<>();
        Car []a = new Car[5];
        a[0]=new Car("toyota:",1,12000);
        a[1]= new Car("md", 2, 10000);
        a[2]= new Car("mg", 3, 15000);
        a[3]= new Car("mm", 4, 18000);

        //Arrays.sort(a);//we will get car cast exception(comparable type exception) --
        List<Car> res = new ArrayList<>();
        for( Car c : a){
            res.add(c);
        }

        Collections.sort(res); //-- need to exdents the comapoarable interaface with out comparable it wont work
        Collections.reverseOrder(new Carcomparator());
        Collections.sort(res,new Carcomparator());
        

        //We can implements the comparable interface and the we implement the compareTo(T o) method and we sort based ont he request variable in object


         



        
    }
    static class Car implements Comparable<Car>{
        String name;
        int modeversion;
        int price;

        public Car(String name,int modeversion,int price){
            this.name=name;
            this.modeversion=modeversion;
            this.price=price;

        }

        @Override
        public int compareTo(Car o) {
            return this.price - o.price;
            
        }



    }
    static class Carcomparator implements Comparator<Car>{
        @Override
       public  int compare(Car l1 , Car l2){
            return l1.price - l2.price; 
        }
    }
}
