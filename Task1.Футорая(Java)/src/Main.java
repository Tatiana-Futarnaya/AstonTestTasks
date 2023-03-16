import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in,"utf8");
        while(true) {
            System.out.println("----------------------");
            System.out.println("List algorithm");
            System.out.println("1. algorithm");
            System.out.println("2. algorithm");
            System.out.println("3. algorithm");
            System.out.println("4. Exit");
            System.out.println("----------------------");

            int command=scanner.nextInt();

            switch (command) {
                case 1:
                    System.out.println("Enter the number");
                    double number=scanner.nextDouble();
                    if(number==7) {
                        System.out.println("Привет");
                    }
                    break;
                case 2:
                    System.out.println("Enter any name");
                    String name=System.console().readLine();
                    while (!name.equals("Vyacheslav")){
                        if(name.equals("Вячеслав")) break;
                        System.out.println("Invalid input, please try again");
                        name=System.console().readLine();
                    }
                    System.out.printf("Привет, %s\n",name);
                    break;
                case 3:
                    System.out.println("Please enter a positive integer number");
                        String sizeString=scanner.next();
                        int size=sizeValidArray(sizeString,scanner);
                    System.out.println("Specify the range of integers included in the array (x1<x2)");
                    System.out.println("Enter the first number");
                        String numb1String=scanner.next();
                    System.out.println("Enter the second number");
                        String numb2String=scanner.next();

                      List<Integer> list=rangValid(numb1String,numb2String,scanner);
                      int numb1=list.get(0);
                      int numb2=list.get(1);
                        int[] arr=new int[size];
                        for (int i=0; i<arr.length; i++) {
                            arr[i]=(int)(Math.random()*(numb2-numb1+1)+numb1);
                        }
                    System.out.println(Arrays.toString(arr));
                        List<Integer> numbers=new ArrayList<>();
                    System.out.println("Output array elements divisible by 3");
                        for (int i=0; i<arr.length; i++) {
                           if(arr[i]%3==0) {
                               numbers.add(arr[i]);
                           }
                        }

                        if(!numbers.isEmpty()){
                            System.out.println(numbers);
                        }else {
                            System.out.println("No multiples of 3");
                        }
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nThere is no such item! Make another choice\n");
            }
        }
    }

    public static boolean isIntegerNumber(String number){
        try {
            Integer.parseInt(number);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    public static int sizeValidArray(String sizeString, Scanner scanner){
        while (!isIntegerNumber(sizeString)){
            System.out.println("Invalid input, please try again");
            sizeString=scanner.next();
        }
        int size=Integer.parseInt(sizeString);
        while (size<=0) {
            System.out.println("Invalid input, please try again");
            size=scanner.nextInt();
        }
        return size;
    }

    public static List<Integer> rangValid(String numb1String,String numb2String, Scanner scanner){
        List<Integer> list=new ArrayList<>();
        while ((!isIntegerNumber(numb1String) || !isIntegerNumber(numb2String))||(Integer.parseInt(numb1String)>=Integer.parseInt(numb2String))){
            System.out.println("Invalid input, please try again");
            System.out.println("x1:");
            numb1String=scanner.next();
            System.out.println("x2:");
            numb2String=scanner.next();
        }
        int numb1=Integer.parseInt(numb1String);
        int numb2=Integer.parseInt(numb2String);
        list.add(numb1);
        list.add(numb2);
        return list;
    }
}

