package me.Blen;

import java.util.*;

public class Main {
    static  Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here
        multipleMethod();
    }

    public static void multipleMethod()
    {
        System.out.println("Please enter the number to see the multiples of 5 and  7 ");
        int num = scan.nextInt();
        scan.nextLine();
        List<Object> list= new ArrayList<Object>();

        for (int i= 1; i<=num; i++){
            if(i%5==0 && i%7==0){
                list.add("CopyCat");
            }else if(i%5==0){
                list.add("copy");
            }else if(i%7==0){
                list.add("cat");
            }
            else
                list.add(i);
        }
        Collections.reverse(list);

        for (Object number : list){
            System.out.println(number);
        }
        choiceMethod();

    }

    public static void choiceMethod(){
        System.out.println("Would you like to enter another number? If yes enter Y and if no enter N");
        String choice = scan.nextLine();
        if(choice.equalsIgnoreCase("y")){
            multipleMethod();

        }else if(choice.equalsIgnoreCase("n"))
            System.out.println("Thank you");
    }

}
