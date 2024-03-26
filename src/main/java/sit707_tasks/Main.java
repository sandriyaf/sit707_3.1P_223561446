package sit707_tasks;

import java.util.Random;


public class Main 
{
    public static void main( String[] args )
    {   
    	/*
    	 * January max boundary area: max-1, max+1
    	 */
    	System.out.println("January max: increment should go to February.");
    	DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println(date);
        date.increment();
        System.out.println(date);
        
        System.out.println("January max: decrement should be 30 January.");
    	date = new DateUtil(31, 1, 2024);
        System.out.println(date);
        date.decrement();
        System.out.println(date);
        
        /*
         * January nominal (somewhere between min and max)
         */
        System.out.println("January random day between (1, 31): increment should be 1 day next.");
        int rand_day_1_to_31 = 1 + new Random().nextInt(31);
        date = new DateUtil(rand_day_1_to_31, 1, 2024);
        System.out.println(date);
        date.increment();
        System.out.println(date);
        
        /*
         * January min boundary area: min+1, min-1
         */
        System.out.println("January min: increment should be 2nd January.");
    	date = new DateUtil(1, 1, 2024);
        System.out.println(date);
        date.increment();
        System.out.println(date);
        
        System.out.println("January min: decrement should be 31 December previous year.");
        date = new DateUtil(1, 1, 2024);
        System.out.println(date);
        date.decrement();
        System.out.println(date); 
        
        System.out.println("June max: increment should be 2nd June.");
    	date = new DateUtil(1, 6, 1994);
        System.out.println(date);
        date.increment();
        System.out.println(date);
        
        System.out.println("June max: increment should be 3rd June.");
    	date = new DateUtil(2, 6, 1994);
        System.out.println(date);
        date.increment();
        System.out.println(date);
        
        System.out.println("June max: increment should be 16th June.");
    	date = new DateUtil(15, 6, 1994);
        System.out.println(date);
        date.increment();
        System.out.println(date);
        
        System.out.println("June max: increment should be 1st July.");
    	date = new DateUtil(30, 6, 1994);
        System.out.println(date);
        date.increment();
        System.out.println(date);
        
        
        
        System.out.println("Jan max: increment should be 16th Jan.");
    	date = new DateUtil(15, 1, 1994);
        System.out.println(date);
        date.increment();
        System.out.println(date);
        
        System.out.println("Feb max: increment should be 16th Feb.");
    	date = new DateUtil(15, 2, 1994);
        System.out.println(date);
        date.increment();
        System.out.println(date);
        
        System.out.println("Nov max: increment should be 16th Nov.");
    	date = new DateUtil(15, 11, 1994);
        System.out.println(date);
        date.increment();
        System.out.println(date);
        
        System.out.println("Dec max: increment should be 16th Dec.");
    	date = new DateUtil(15, 12, 1994);
        System.out.println(date);
        date.increment();
        System.out.println(date);
        
        System.out.println("June max: increment should be 16th June,1700.");
    	date = new DateUtil(15, 6, 1700);
        System.out.println(date);
        date.increment();
        System.out.println(date);
        
        System.out.println("June max: increment should be 16th June,1701.");
     	date = new DateUtil(15, 6, 1701);
        System.out.println(date);
        date.increment();
        System.out.println(date);
        
        System.out.println("June max: increment should be 16th June,2023.");
     	date = new DateUtil(15, 6, 2023);
        System.out.println(date);
        date.increment();
        System.out.println(date);
        
        System.out.println("June max: increment should be 16th June,2024.");
     	date = new DateUtil(15, 6, 2024);
        System.out.println(date);
        date.increment();
        System.out.println(date);
        
        System.out.println("February maxLeap: increment should be 1st March.");
    	date = new DateUtil(29, 2, 2024);
        System.out.println(date);
        date.increment();
        System.out.println(date);
        
        System.out.println("February minLeap: decrement should be 28 Feb.");
        date = new DateUtil(29, 2, 2024);
        System.out.println(date);
        date.decrement();
        System.out.println(date);   
        
        System.out.println("June 31: increment should be 1st July.");
    	date = new DateUtil(31, 6, 1994);
        System.out.println(date);
        date.increment();
        System.out.println(date);
    }
}
