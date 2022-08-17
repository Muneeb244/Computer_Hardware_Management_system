package com.company;
import java.io.*;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Computer_Hardware_Management {
    public static void main(String[] args) {
        while (true){
            try{
                Scanner nes = new Scanner(System.in);
                System.out.println("""
                \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t**********************************************
                \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tWelcome to Computer Hardware Management System
                \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t**********************************************
                """);
                System.out.print("""
                    Enter your choice
                    1. User Panel.
                    2. Admin panel.
                    3. Exit
                    """);
                int choice = nes.nextInt();
                switch (choice) {
                    case 1 -> User();
                    case 2 -> admin();
                    case 3 -> System.exit(0);
                    default -> System.out.println("Invalid Input!!!");
                }
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
    //User First portion````````````````````````````````````````````````````````````````````````````````````````````````
    public static void User() {
        try{
//            object to read input from console
            Scanner nes = new Scanner(System.in);
            System.out.print("""
                        Enter your choice
                        1. Buy product.
                        2. Exchange or return product.
                        3. Product information.
                        """);
            int prod = nes.nextInt();
            switch (prod) {
                case 1 -> buy();
                case 2 -> exchange();
                case 3 -> info();
                default -> System.out.println("Invalid Input!!!");
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    //    Buying a product``````````````````````````````````````````````````````````````````````````````````````````````
    public static void buy() {
        try{
//            object to read input from console
            Scanner nes = new Scanner(System.in);
            System.out.println("""
                        Which product you wanna buy?
                        1. Mouse
                        2. Keyboard
                        3. Graphic card
                        4. RAM
                        5. Hard-Disks
                        6. Laptop Chargers
                        7. laptop Batteries
                        8. Speakers
                        """);
            int pro = nes.nextInt();
//            boolean to check if user's input is valid or not
            boolean chk = true;
            if(pro == 1){
//                File and scanner objects to read data from text file
                File file1 = new File("mouse.txt");
                Scanner fes1 = new Scanner(file1);
//                reading data line by line and displaying on console
                while(fes1.hasNextLine()){
                    System.out.println(fes1.nextLine());
                }
                nes.nextLine();
                System.out.println("Which mouse you wanna buy?");
                String mou = nes.nextLine();
                mou = mou+".";
//                Further object to split data into array and using them for displaying price and asking for price
                File file11 = new File("mouse.txt");
                Scanner fes11 = new Scanner(file11);
                while(fes11.hasNextLine()){
                    String[] str = fes11.nextLine().split(" ");
//                    check to match user's input with text file's data
                    if(str[0].equals(mou)) {
                        chk = false;
//                        displaying price on console from by using array index
                        System.out.println("Price for this product is \"" + str[3] + "\"");
//                        calling bill function
                        bill(str[1]);
                        break;
                    }
                }
                if(chk) System.out.println("Product not found!!!");
//                closing objects
                fes1.close();
                fes11.close();
            }
            else if(pro == 2){
                File file2 = new File("keyboard.txt");
                Scanner fes2 = new Scanner(file2);
                while(fes2.hasNextLine()){
                    System.out.println(fes2.nextLine());
                }
                nes.nextLine();
                System.out.println("Which keyboard you wanna buy?");
                String mou = nes.nextLine();
                mou = mou+".";
                File file12 = new File("keyboard.txt");
                Scanner fes12 = new Scanner(file12);
                while(fes12.hasNextLine()){
                    String[] str = fes12.nextLine().split(" ");
                    if(str[0].equals(mou)){
                        chk = false;
                        System.out.println("Price for this product is \""+str[3]+"\"");
                        bill(str[1]);
                        break;
                    }
                }
                if(chk) System.out.println("Product not found!!!");
                fes2.close();
                fes12.close();
            }
            else if(pro == 3){
                File file3 = new File("graphic.txt");
                Scanner fes3 = new Scanner(file3);
                while(fes3.hasNextLine()){
                    System.out.println(fes3.nextLine());
                }
                nes.nextLine();
                System.out.println("Which Graphic card you wanna buy?");
                String mou = nes.nextLine();
                mou = mou+".";
                File file13 = new File("graphic.txt");
                Scanner fes13 = new Scanner(file13);
                while(fes13.hasNextLine()){
                    String[] str = fes13.nextLine().split(" ");
                    if(str[0].equals(mou)){
                        chk = false;
                        System.out.println("Price for this product is \""+str[3]+"\"");
                        bill(str[1]);
                        break;
                    }
                }
                if(chk) System.out.println("Product not found!!!");
                fes3.close();
                fes13.close();
            }
            else if(pro == 4){
                File file4 = new File("ram.txt");
                Scanner fes4 = new Scanner(file4);
                while(fes4.hasNextLine()){
                    System.out.println(fes4.nextLine());
                }
                nes.nextLine();
                System.out.println("Which RAM you wanna buy?");
                String mou = nes.nextLine();
                mou = mou+".";
                File file14 = new File("ram.txt");
                Scanner fes14 = new Scanner(file14);
                while(fes14.hasNextLine()){
                    String[] str = fes14.nextLine().split(" ");
                    if(str[0].equals(mou)){
                        chk = false;
                        System.out.println("Price for this product is \""+str[3]+"\"");
                        bill(str[1]);
                        break;
                    }
                }
                if(chk) System.out.println("Product not found!!!");
                fes4.close();
                fes14.close();
            }
            else if(pro == 5){
                File file5 = new File("hard.txt");
                Scanner fes5 = new Scanner(file5);
                while(fes5.hasNextLine()){
                    System.out.println(fes5.nextLine());
                }
                nes.nextLine();
                System.out.println("Which Hard Disk you wanna buy?");
                String mou = nes.nextLine();
                mou = mou+".";
                File file15 = new File("hard.txt");
                Scanner fes15 = new Scanner(file15);
                while(fes15.hasNextLine()){
                    String[] str = fes15.nextLine().split(" ");
                    if(str[0].equals(mou)){
                        chk = false;
                        System.out.println("Price for this product is \""+str[3]+"\"");
                        bill(str[1]);
                        break;
                    }
                }
                if(chk) System.out.println("Product not found!!!");
                fes5.close();
                fes15.close();
            }
            else if(pro == 6){
                File file6 = new File("charger.txt");
                Scanner fes6 = new Scanner(file6);
                while(fes6.hasNextLine()){
                    System.out.println(fes6.nextLine());
                }
                nes.nextLine();
                System.out.println("Which Laptop Charger you wanna buy?");
                String mou = nes.nextLine();
                mou = mou+".";
                File file16 = new File("charger.txt");
                Scanner fes16 = new Scanner(file16);
                while(fes16.hasNextLine()){
                    String[] str = fes16.nextLine().split(" ");
                    if(str[0].equals(mou)){
                        chk = false;
                        System.out.println("Price for this product is \""+str[3]+"\"");
                        bill(str[1]);
                        break;
                    }
                }
                if(chk) System.out.println("Product not found!!!");
                fes6.close();
                fes16.close();
            }
            else if(pro == 7){
                File file7 = new File("battery.txt");
                Scanner fes7 = new Scanner(file7);
                while(fes7.hasNextLine()){
                    System.out.println(fes7.nextLine());
                }
                nes.nextLine();
                System.out.println("Which Laptop Battery you wanna buy?");
                String mou = nes.nextLine();
                mou = mou+".";
                File file17 = new File("battery.txt");
                Scanner fes17 = new Scanner(file17);
                while(fes17.hasNextLine()){
                    String[] str = fes17.nextLine().split(" ");
                    if(str[0].equals(mou)){
                        chk = false;
                        System.out.println("Price for this product is \""+str[3]+"\"");
                        bill(str[1]);
                        break;
                    }
                }
                if(chk) System.out.println("Product not found!!!");
                fes7.close();
                fes17.close();
            }
            else if(pro == 8){
                File file8 = new File("speaker.txt");
                Scanner fes8 = new Scanner(file8);
                while(fes8.hasNextLine()){
                    System.out.println(fes8.nextLine());
                }
                nes.nextLine();
                System.out.println("Which Speaker you wanna buy?");
                String mou = nes.nextLine();
                mou = mou+".";
                File file18 = new File("speaker.txt");
                Scanner fes18 = new Scanner(file18);
                while(fes18.hasNextLine()){
                    String[] str = fes18.nextLine().split(" ");
                    if(str[0].equals(mou)){
                        chk = false;
                        System.out.println("Price for this product is \""+str[3]+"\"");
                        bill(str[1]);
                        break;
                    }
                }
                if(chk) System.out.println("Product not found!!!");
                fes8.close();
                fes18.close();
            } else System.out.println("Invalid choice!!!\n");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    //    Bill generating```````````````````````````````````````````````````````````````````````````````````````````````
    public static void bill(String prod) {
        try{
//            time object to get time when user is buying something
            LocalDateTime time = LocalDateTime.now();
//            object to read input from console
            Scanner nes = new Scanner(System.in);
            System.out.println("Do you want to buy this product?(y/n)");
            String choice = nes.next();
//            check for user's input
            if(choice.equalsIgnoreCase("y")){
                nes.nextLine();
                System.out.println("What is your name?");
                String name = nes.nextLine();
                int meth = 0;
                while(true){
                    System.out.print("""
                    How would your like you pay the bill?
                    1. Jazzcash
                    2. Easypaisa
                    3. Cash
                    """);
                    meth = nes.nextInt();
                    if(meth == 1 || meth == 2){
                        System.out.print("""
                        Pay your bill at one of these numbers
                        1. 0300-1234567
                        1. 0300-1234570
                        """);
//                        function to make a bit delay
                        Thread.sleep(3000);
                        System.out.println("Waiting for you to pay the bill\n");
                        Thread.sleep(5000);
                        nes.nextLine();
                        System.out.println("Have you paid your bill?(y/n)");
                        String bil = nes.next();
                        if(bil.equalsIgnoreCase("y")){
                            System.out.println("Your payment is being processed, Kindly wait for a moment.");
                            Thread.sleep(2000);
                            System.out.println("Checking account details.");
                            Thread.sleep(3000);
                            System.out.println("Verifying bill.");
                            Thread.sleep(2000);
                            System.out.println("Payment accepted.");
                            Thread.sleep(2000);
                            System.out.println("Your bill has been paid.\n");
                            System.out.println(prod+" purchased by "  + name + " at "+time+"\nHave a good day!!!\n");
//                            object to append data into text file
                            FileWriter fileWriter = new FileWriter("record.txt", true);
//                            object to add a new line after appending data into file
                            BufferedWriter buff = new BufferedWriter(fileWriter);
//                            appending data
                            buff.write(prod+" purchased by "  + name + " at "+time);
//                            writing new line after appending
                            buff.newLine();
//                            closing objects
                            buff.close();
                            fileWriter.close();
                        }
                        else System.out.println("You cannot buy product without paying your bill!!!");
                        break;
                    }
                    else if (meth == 3) {
                        System.out.println("Pay your bill at the counter");
                        Thread.sleep(5000);
                        System.out.println("Have your paid your bill?(y/n)");
                        String str = nes.next();
                        if (str.equalsIgnoreCase("y")) {
                            System.out.println("Verifying");
                            Thread.sleep(5000);
                            System.out.println("Your bill has been paid");
                            System.out.println(prod+" purchased by "  + name + " at "+time+"\nHave a good day!!!\n");
                            FileWriter fileWriter = new FileWriter("record.txt", true);
                            BufferedWriter buff = new BufferedWriter(fileWriter);
                            buff.write(prod+" purchased by "  + name + " at "+time);
                            buff.newLine();
                            buff.close();
                            fileWriter.close();
                        }else System.out.println("You cannot buy product without paying your bill!!!");
                        break;
                    } else System.out.println("Invalid input, Try again");
                }
            }
//            check for user's wrong input
            else if(choice.equalsIgnoreCase("n"))
                System.out.println("You can't get this product without paying your bill!!!");
            else System.out.println("Invalid Input!!!");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    //    Return or exchange product````````````````````````````````````````````````````````````````````````````````````
    public static void exchange() {
        try{
//            object to read input from console
            Scanner nes = new Scanner(System.in);
            System.out.print("""
                Enter your choice
                1. Exchange product
                2. Return product
                """);
            int choice = nes.nextInt();
            int num = 0;
            if(choice == 1){
                System.out.print("""
                    From which category your previous product was?
                    1. Mouse
                    2. Keyboard
                    3. Graphic card 
                    4. RAM
                    5. Hard-Disks
                    6. Laptop Chargers
                    7. laptop Batteries
                    8. Speakers
                    """);
                int ret = nes.nextInt();
//                check for user's wrong input
                boolean chk = false;
                if(ret == 1){
//                    objects to scan data from text file
                    File file12 = new File("mouse.txt");
                    Scanner fes12 = new Scanner(file12);
//                    blank input due to buffer problem
                    nes.nextLine();
                    System.out.println("Enter name and model number joined with underscore");
                    String mou = nes.nextLine();
                    while(fes12.hasNextLine()){
//                        splitting data from text file to match with user's input
                        String[] str = fes12.nextLine().split(" ");
//                        matching user's input
                        if(str[1].equals(mou)){
                            chk = true;
//                            converting price into integer to make calculations while exchanging
                            num = Integer.parseInt(str[3]);
                            break;
                        }
                    }
//                    closing buffer
                    fes12.close();
                }
                else if(ret == 2){
                    File file12 = new File("keyboard.txt");
                    Scanner fes12 = new Scanner(file12);
                    nes.nextLine();
                    System.out.println("Enter name and model number joined with underscore");
                    String mou = nes.nextLine();
                    while(fes12.hasNextLine()){
                        String[] str = fes12.nextLine().split(" ");
                        if(str[1].equals(mou)){
                            chk = true;
                            num = Integer.parseInt(str[3]);
                            break;
                        }
                    }
                    fes12.close();
                }
                else if(ret == 3){
                    File file12 = new File("graphic.txt");
                    Scanner fes12 = new Scanner(file12);
                    nes.nextLine();
                    System.out.println("Enter name and model number joined with underscore");
                    String mou = nes.nextLine();
                    while(fes12.hasNextLine()){
                        String[] str = fes12.nextLine().split(" ");
                        if(str[1].equals(mou)){
                            chk = true;
                            num = Integer.parseInt(str[3]);
                            break;
                        }
                    }
                    fes12.close();
                }
                else if(ret == 4){
                    File file12 = new File("ram.txt");
                    Scanner fes12 = new Scanner(file12);
                    nes.nextLine();
                    System.out.println("Enter name and model number joined with underscore");
                    String mou = nes.nextLine();
                    while(fes12.hasNextLine()){
                        String[] str = fes12.nextLine().split(" ");
                        if(str[1].equals(mou)){
                            chk = true;
                            num = Integer.parseInt(str[3]);
                            break;
                        }
                    }
                    fes12.close();
                }
                else if(ret == 5){
                    File file12 = new File("hard.txt");
                    Scanner fes12 = new Scanner(file12);
                    nes.nextLine();
                    System.out.println("Enter name and model number joined with underscore");
                    String mou = nes.nextLine();
                    while(fes12.hasNextLine()){
                        String[] str = fes12.nextLine().split(" ");
                        if(str[1].equals(mou)){
                            chk = true;
                            num = Integer.parseInt(str[3]);
                            break;
                        }
                    }
                    fes12.close();
                }
                else if(ret == 6){
                    File file12 = new File("charger.txt");
                    Scanner fes12 = new Scanner(file12);
                    nes.nextLine();
                    System.out.println("Enter name and model number joined with underscore");
                    String mou = nes.nextLine();
                    while(fes12.hasNextLine()){
                        String[] str = fes12.nextLine().split(" ");
                        if(str[1].equals(mou)){
                            chk = true;
                            num = Integer.parseInt(str[3]);
                            break;
                        }
                    }
                    fes12.close();
                }
                else if(ret == 7){
                    File file12 = new File("battery.txt");
                    Scanner fes12 = new Scanner(file12);
                    nes.nextLine();
                    System.out.println("Enter name and model number joined with underscore");
                    String mou = nes.nextLine();
                    while(fes12.hasNextLine()){
                        String[] str = fes12.nextLine().split(" ");
                        if(str[1].equals(mou)){
                            chk = true;
                            num = Integer.parseInt(str[3]);
                            break;
                        }
                    }
                    fes12.close();
                }
                else if(ret == 8){
                    File file12 = new File("speaker.txt");
                    Scanner fes12 = new Scanner(file12);
                    nes.nextLine();
                    System.out.println("Enter name and model number joined with underscore");
                    String mou = nes.nextLine();
                    while(fes12.hasNextLine()){
                        String[] str = fes12.nextLine().split(" ");
                        if(str[1].equals(mou)){
                            chk = true;
                            num = Integer.parseInt(str[3]);
                            break;
                        }
                    }
                    fes12.close();
                }
//                else System.out.println("Invalid Input!!!");
                if(chk){
                    System.out.print("""
                    With Which category of product you wanna exchange?
                    1. Mouse
                    2. Keyboard
                    3. Graphic card
                    4. RAM
                    5. Hard-Disks
                    6. Laptop Chargers
                    7. laptop Batteries
                    8. Speakers
                    """);
                    int ex = nes.nextInt();
                    String[] str = new String[0];
                    boolean inv = true;
                    if(ex == 1){
//                        objects to read data from text files
                        File file = new File("mouse.txt");
                        Scanner fes2 = new Scanner(file);
                        while(fes2.hasNextLine()){
//                            printing lines on console
                            System.out.println(fes2.nextLine());
                        }
//                        blank input due to buffer problem
                        nes.nextLine();
                        System.out.println("Enter your choice");
                        String mou = nes.nextLine();
                        mou = mou+".";
//                        7.
//                        scanning data fr
                        File file12 = new File("mouse.txt");
                        Scanner fes12 = new Scanner(file12);
                        while(fes12.hasNextLine()){
//                            splitting lines into array to access data with indexes
                            str = fes12.nextLine().split(" ");
                            if(str[0].equals(mou)){
                                inv = false;
                                break;
                            }
                        }
//                        closing objects
                        fes2.close();
                        fes12.close();
                        if(inv) System.out.println("Invalid Input!!!");
                        else{
                            System.out.println("Price for this product is \""+str[3]+"\"");
//                        converting into integer for calculations
                            int pr = Integer.parseInt(str[3]);
//                        calculating ammount
                            int sub = num-pr;
//                        check for return or bill
                            if(sub<0){
                                System.out.println("You have to pay "+((sub*-2)+sub)+" in exchange of your product");
//                            callling bill function
                                bill(str[1]);
                            }
                            else if(sub>0){
                                System.out.println(sub+" is the money you will get in return");
                                System.out.println("Enter your number");
                                String number = nes.nextLine();
                                boolean val = true;
//                            validation for phone number
                                for(int i = 0; i<=number.length()-1; i++){
                                    if(number.charAt(0) == '0' && number.charAt(1) == '3' && Integer.parseInt(String.valueOf(number.charAt(2))) < 5){
                                        if(i == 10) {
                                            System.out.println("You payment will be transferred to you within a week\n");
                                            FileWriter fileWriter = new FileWriter("Return.txt", true);
                                            BufferedWriter buff = new BufferedWriter(fileWriter);
                                            buff.write(sub+" is the money to return at "+number);
                                            buff.newLine();
                                            buff.close();
                                            fileWriter.close();
                                            val = false;
                                            break;
                                        }
                                    }
                                }
                                if(val) System.out.println("Invalid phone number!!!");
                            }
                            System.out.println();
                        }
                    }
                    else if(ex == 2){
                        File file = new File("keyboard.txt");
                        Scanner fes2 = new Scanner(file);
                        while(fes2.hasNextLine()){
                            System.out.println(fes2.nextLine());
                        }
                        nes.nextLine();
                        System.out.println("Enter your choice");
                        String mou = nes.nextLine();
                        mou = mou+".";
                        File file12 = new File("keyboard.txt");
                        Scanner fes12 = new Scanner(file12);
                        while(fes12.hasNextLine()){
                            str = fes12.nextLine().split(" ");
                            if(str[0].equals(mou)){
                                inv = false;
                                break;
                            }
                        }
                        fes2.close();
                        fes12.close();
                        if(inv) System.out.println("Invalid Input!!!");
                        else{
                            System.out.println("Price for this product is \""+str[3]+"\"");
                            int pr = Integer.parseInt(str[3]);
                            int sub = num-pr;
                            if(sub<0){
                                System.out.println("You have to pay "+((sub*-2)+sub)+" in exchange of your product");
                                bill(str[1]);
                            }
                            else if(sub>0){
                                System.out.println(sub+" is the money you will get in return");
                                System.out.println("Enter your number");
                                String number = nes.nextLine();
                                boolean val = true;
                                for(int i = 0; i<=number.length()-1; i++){
                                    if(number.charAt(0) == '0' && number.charAt(1) == '3' && Integer.parseInt(String.valueOf(number.charAt(2))) < 5){
                                        if(i == 10) {
                                            System.out.println("You payment will be transferred to you within a week\n");
                                            FileWriter fileWriter = new FileWriter("Return.txt", true);
                                            BufferedWriter buff = new BufferedWriter(fileWriter);
                                            buff.write(sub+" is the money to return at "+number);
                                            buff.newLine();
                                            buff.close();
                                            fileWriter.close();
                                            val = false;
                                            break;
                                        }
                                    }
                                }
                                if(val) System.out.println("Invalid phone number!!!");
                            }
                            System.out.println();
                        }
                    }
                    else if(ex == 3){
                        File file = new File("graphic.txt");
                        Scanner fes2 = new Scanner(file);
                        while(fes2.hasNextLine()){
                            System.out.println(fes2.nextLine());
                        }
                        nes.nextLine();
                        System.out.println("Enter your choice");
                        String mou = nes.nextLine();
                        mou = mou+".";
                        File file12 = new File("graphic.txt");
                        Scanner fes12 = new Scanner(file12);
                        while(fes12.hasNextLine()){
                            str = fes12.nextLine().split(" ");
                            if(str[0].equals(mou)){
                                inv = false;
                                break;
                            }
                        }
                        fes2.close();
                        fes12.close();
                        if(inv) System.out.println("Invalid Input!!!");
                        else{
                            System.out.println("Price for this product is \""+str[3]+"\"");
                            int pr = Integer.parseInt(str[3]);
                            int sub = num-pr;
                            if(sub<0){
                                System.out.println("You have to pay "+((sub*-2)+sub)+" in exchange of your product");
                                bill(str[1]);
                            }
                            else if(sub>0){
                                System.out.println(sub+" is the money you will get in return");
                                System.out.println("Enter your number");
                                String number = nes.nextLine();
                                boolean val = true;
                                for(int i = 0; i<=number.length()-1; i++){
                                    if(number.charAt(0) == '0' && number.charAt(1) == '3' && Integer.parseInt(String.valueOf(number.charAt(2))) < 5){
                                        if(i == 10) {
                                            System.out.println("You payment will be transferred to you within a week\n");
                                            FileWriter fileWriter = new FileWriter("Return.txt", true);
                                            BufferedWriter buff = new BufferedWriter(fileWriter);
                                            buff.write(sub+" is the money to return at "+number);
                                            buff.newLine();
                                            buff.close();
                                            fileWriter.close();
                                            val = false;
                                            break;
                                        }
                                    }
                                }
                                if(val) System.out.println("Invalid phone number!!!");
                            }
                            System.out.println();
                        }
                    }
                    else if(ex == 4){
                        File file = new File("ram.txt");
                        Scanner fes2 = new Scanner(file);
                        while(fes2.hasNextLine()){
                            System.out.println(fes2.nextLine());
                        }
                        nes.nextLine();
                        System.out.println("Enter your choice");
                        String mou = nes.nextLine();
                        mou = mou+".";
                        File file12 = new File("ram.txt");
                        Scanner fes12 = new Scanner(file12);
                        while(fes12.hasNextLine()){
                            str = fes12.nextLine().split(" ");
                            if(str[0].equals(mou)){
                                inv = false;
                                break;
                            }
                        }
                        fes2.close();
                        fes12.close();
                        if(inv) System.out.println("Invalid Input!!!");
                        else{
                            System.out.println("Price for this product is \""+str[3]+"\"");
                            int pr = Integer.parseInt(str[3]);
                            int sub = num-pr;
                            if(sub<0){
                                System.out.println("You have to pay "+((sub*-2)+sub)+" in exchange of your product");
                                bill(str[1]);
                            }
                            else if(sub>0){
                                System.out.println(sub+" is the money you will get in return");
                                System.out.println("Enter your number");
                                String number = nes.nextLine();
                                boolean val = true;
                                for(int i = 0; i<=number.length()-1; i++){
                                    if(number.charAt(0) == '0' && number.charAt(1) == '3' && Integer.parseInt(String.valueOf(number.charAt(2))) < 5){
                                        if(i == 10) {
                                            System.out.println("You payment will be transferred to you within a week\n");
                                            FileWriter fileWriter = new FileWriter("Return.txt", true);
                                            BufferedWriter buff = new BufferedWriter(fileWriter);
                                            buff.write(sub+" is the money to return at "+number);
                                            buff.newLine();
                                            buff.close();
                                            fileWriter.close();
                                            val = false;
                                            break;
                                        }
                                    }
                                }
                                if(val) System.out.println("Invalid phone number!!!");
                            }
                            System.out.println();
                        }
                    }
                    else if(ex == 5){
                        File file = new File("hard.txt");
                        Scanner fes2 = new Scanner(file);
                        while(fes2.hasNextLine()){
                            System.out.println(fes2.nextLine());
                        }
                        nes.nextLine();
                        System.out.println("Enter your choice");
                        String mou = nes.nextLine();
                        mou = mou+".";
                        File file12 = new File("hard.txt");
                        Scanner fes12 = new Scanner(file12);
                        while(fes12.hasNextLine()){
                            str = fes12.nextLine().split(" ");
                            if(str[0].equals(mou)){
                                inv = false;
                                break;
                            }
                        }
                        fes2.close();
                        fes12.close();
                        if(inv) System.out.println("Invalid Input!!!");
                        else{
                            System.out.println("Price for this product is \""+str[3]+"\"");
                            int pr = Integer.parseInt(str[3]);
                            int sub = num-pr;
                            if(sub<0){
                                System.out.println("You have to pay "+((sub*-2)+sub)+" in exchange of your product");
                                bill(str[1]);
                            }
                            else if(sub>0){
                                System.out.println(sub+" is the money you will get in return");
                                System.out.println("Enter your number");
                                String number = nes.nextLine();
                                boolean val = true;
                                for(int i = 0; i<=number.length()-1; i++){
                                    if(number.charAt(0) == '0' && number.charAt(1) == '3' && Integer.parseInt(String.valueOf(number.charAt(2))) < 5){
                                        if(i == 10) {
                                            System.out.println("You payment will be transferred to you within a week\n");
                                            FileWriter fileWriter = new FileWriter("Return.txt", true);
                                            BufferedWriter buff = new BufferedWriter(fileWriter);
                                            buff.write(sub+" is the money to return at "+number);
                                            buff.newLine();
                                            buff.close();
                                            fileWriter.close();
                                            val = false;
                                            break;
                                        }
                                    }
                                }
                                if(val) System.out.println("Invalid phone number!!!");
                            }
                            System.out.println();
                        }
                    }
                    else if(ex == 6){
                        File file = new File("charger.txt");
                        Scanner fes2 = new Scanner(file);
                        while(fes2.hasNextLine()){
                            System.out.println(fes2.nextLine());
                        }
                        nes.nextLine();
                        System.out.println("Enter your choice");
                        String mou = nes.nextLine();
                        mou = mou+".";
                        File file12 = new File("charger.txt");
                        Scanner fes12 = new Scanner(file12);
                        while(fes12.hasNextLine()){
                            str = fes12.nextLine().split(" ");
                            if(str[0].equals(mou)){
                                inv = false;
                                break;
                            }
                        }
                        fes2.close();
                        fes12.close();
                        if(inv) System.out.println("Invalid Input!!!");
                        else{
                            System.out.println("Price for this product is \""+str[3]+"\"");
                            int pr = Integer.parseInt(str[3]);
                            int sub = num-pr;
                            if(sub<0){
                                System.out.println("You have to pay "+((sub*-2)+sub)+" in exchange of your product");
                                bill(str[1]);
                            }
                            else if(sub>0){
                                System.out.println(sub+" is the money you will get in return");
                                System.out.println("Enter your number");
                                String number = nes.nextLine();
                                boolean val = true;
                                for(int i = 0; i<=number.length()-1; i++){
                                    if(number.charAt(0) == '0' && number.charAt(1) == '3' && Integer.parseInt(String.valueOf(number.charAt(2))) < 5){
                                        if(i == 10) {
                                            System.out.println("You payment will be transferred to you within a week\n");
                                            FileWriter fileWriter = new FileWriter("Return.txt", true);
                                            BufferedWriter buff = new BufferedWriter(fileWriter);
                                            buff.write(sub+" is the money to return at "+number);
                                            buff.newLine();
                                            buff.close();
                                            fileWriter.close();
                                            val = false;
                                            break;
                                        }
                                    }
                                }
                                if(val) System.out.println("Invalid phone number!!!");
                            }
                            System.out.println();
                        }
                    }
                    else if(ex == 7){
                        File file = new File("battery.txt");
                        Scanner fes2 = new Scanner(file);
                        while(fes2.hasNextLine()){
                            System.out.println(fes2.nextLine());
                        }
                        nes.nextLine();
                        System.out.println("Enter your choice");
                        String mou = nes.nextLine();
                        mou = mou+".";
                        File file12 = new File("battery.txt");
                        Scanner fes12 = new Scanner(file12);
                        while(fes12.hasNextLine()){
                            str = fes12.nextLine().split(" ");
                            if(str[0].equals(mou)){
                                inv = false;
                                break;
                            }
                        }
                        fes2.close();
                        fes12.close();
                        if(inv) System.out.println("Invalid Input!!!");
                        else{
                            System.out.println("Price for this product is \""+str[3]+"\"");
                            int pr = Integer.parseInt(str[3]);
                            int sub = num-pr;
                            if(sub<0){
                                System.out.println("You have to pay "+((sub*-2)+sub)+" in exchange of your product");
                                bill(str[1]);
                            }
                            else if(sub>0){
                                System.out.println(sub+" is the money you will get in return");
                                System.out.println("Enter your number");
                                String number = nes.nextLine();
                                boolean val = true;
                                for(int i = 0; i<=number.length()-1; i++){
                                    if(number.charAt(0) == '0' && number.charAt(1) == '3' && Integer.parseInt(String.valueOf(number.charAt(2))) < 5){
                                        if(i == 10) {
                                            System.out.println("You payment will be transferred to you within a week\n");
                                            FileWriter fileWriter = new FileWriter("Return.txt", true);
                                            BufferedWriter buff = new BufferedWriter(fileWriter);
                                            buff.write(sub+" is the money to return at "+number);
                                            buff.newLine();
                                            buff.close();
                                            fileWriter.close();
                                            val = false;
                                            break;
                                        }
                                    }
                                }
                                if(val) System.out.println("Invalid phone number!!!");
                            }
                            System.out.println();
                        }
                    }
                    else if(ex == 8){
                        File file = new File("speaker.txt");
                        Scanner fes2 = new Scanner(file);
                        while(fes2.hasNextLine()){
                            System.out.println(fes2.nextLine());
                        }
                        nes.nextLine();
                        System.out.println("Enter your choice");
                        String mou = nes.nextLine();
                        mou = mou+".";
                        File file12 = new File("speaker.txt");
                        Scanner fes12 = new Scanner(file12);
                        while(fes12.hasNextLine()){
                            str = fes12.nextLine().split(" ");
                            if(str[0].equals(mou)){
                                inv = false;
                                break;
                            }
                        }
                        fes2.close();
                        fes12.close();
                        if(inv) System.out.println("Invalid Input!!!");
                        else{
                            System.out.println("Price for this product is \""+str[3]+"\"");
                            int pr = Integer.parseInt(str[3]);
                            int sub = num-pr;
                            if(sub<0){
                                System.out.println("You have to pay "+((sub*-2)+sub)+" in exchange of your product");
                                bill(str[1]);
                            }
                            else if(sub>0){
                                System.out.println(sub+" is the money you will get in return");
                                System.out.println("Enter your number");
                                String number = nes.nextLine();
                                boolean val = true;
                                for(int i = 0; i<=number.length()-1; i++){
                                    if(number.charAt(0) == '0' && number.charAt(1) == '3' && Integer.parseInt(String.valueOf(number.charAt(2))) < 5){
                                        if(i == 10) {
                                            System.out.println("You payment will be transferred to you within a week\n");
                                            FileWriter fileWriter = new FileWriter("Return.txt", true);
                                            BufferedWriter buff = new BufferedWriter(fileWriter);
                                            buff.write(sub+" is the money to return at "+number);
                                            buff.newLine();
                                            buff.close();
                                            fileWriter.close();
                                            val = false;
                                            break;
                                        }
                                    }
                                }
                                if(val) System.out.println("Invalid phone number!!!");
                            }
                            System.out.println();
                        }
                    }else System.out.println("Invalid Input!!!");
                } else System.out.println("Product not found!!!");
            }
            else if(choice == 2){
                boolean chk = false;
                System.out.print("""
                    From which category your previous product was?
                    1. Mouse
                    2. Keyboard
                    3. Graphic card
                    4. RAM
                    5. Hard-Disks
                    6. Laptop Chargers
                    7. laptop Batteries
                    8. Speakers
                    """);
                int retu = nes.nextInt();
                if(retu == 1){
                    nes.nextLine();
                    System.out.println("Enter name and model number joined with underscore");
                    String mou = nes.nextLine();
                    File file12 = new File("mouse.txt");
                    Scanner fes12 = new Scanner(file12);
                    while(fes12.hasNextLine()){
                        String[] str = fes12.nextLine().split(" ");
                        if(str[1].equals(mou)){
                            chk = true;
                            num = Integer.parseInt(str[3]);
                            break;
                        }
                    }
                    fes12.close();
                }
                else if(retu == 2){
                    nes.nextLine();
                    System.out.println("Enter name and model number joined with underscore");
                    String mou = nes.nextLine();
                    File file12 = new File("keyboard.txt");
                    Scanner fes12 = new Scanner(file12);
                    while(fes12.hasNextLine()){
                        String[] str = fes12.nextLine().split(" ");
                        if(str[1].equals(mou)){
                            chk = true;
                            num = Integer.parseInt(str[3]);
                            break;
                        }
                    }
                    fes12.close();
                }
                else if(retu == 3){
                    nes.nextLine();
                    System.out.println("Enter name and model number joined with underscore");
                    String mou = nes.nextLine();
                    File file12 = new File("graphic.txt");
                    Scanner fes12 = new Scanner(file12);
                    while(fes12.hasNextLine()){
                        String[] str = fes12.nextLine().split(" ");
                        if(str[1].equals(mou)){
                            chk = true;
                            num = Integer.parseInt(str[3]);
                            break;
                        }
                    }
                    fes12.close();
                }
                else if(retu == 4){
                    nes.nextLine();
                    System.out.println("Enter name and model number joined with underscore");
                    String mou = nes.nextLine();
                    File file12 = new File("ram.txt");
                    Scanner fes12 = new Scanner(file12);
                    while(fes12.hasNextLine()){
                        String[] str = fes12.nextLine().split(" ");
                        if(str[1].equals(mou)){
                            chk = true;
                            num = Integer.parseInt(str[3]);
                            break;
                        }
                    }
                    fes12.close();
                }
                else if(retu == 5){
                    nes.nextLine();
                    System.out.println("Enter name and model number joined with underscore");
                    String mou = nes.nextLine();
                    File file12 = new File("hard.txt");
                    Scanner fes12 = new Scanner(file12);
                    while(fes12.hasNextLine()){
                        String[] str = fes12.nextLine().split(" ");
                        if(str[1].equals(mou)){
                            chk = true;
                            num = Integer.parseInt(str[3]);
                            break;
                        }
                    }
                    fes12.close();
                }
                else if(retu == 6){
                    nes.nextLine();
                    System.out.println("Enter name and model number joined with underscore");
                    String mou = nes.nextLine();
                    File file12 = new File("charger.txt");
                    Scanner fes12 = new Scanner(file12);
                    while(fes12.hasNextLine()){
                        String[] str = fes12.nextLine().split(" ");
                        if(str[1].equals(mou)){
                            chk = true;
                            num = Integer.parseInt(str[3]);
                            break;
                        }
                    }
                    fes12.close();
                }
                else if(retu == 7){
                    nes.nextLine();
                    System.out.println("Enter name and model number joined with underscore");
                    String mou = nes.nextLine();
                    File file12 = new File("battery.txt");
                    Scanner fes12 = new Scanner(file12);
                    while(fes12.hasNextLine()){
                        String[] str = fes12.nextLine().split(" ");
                        if(str[1].equals(mou)){
                            chk = true;
                            num = Integer.parseInt(str[3]);
                            break;
                        }
                    }
                    fes12.close();
                }
                else if(retu == 8){
                    nes.nextLine();
                    System.out.println("Enter name and model number joined with underscore");
                    String mou = nes.nextLine();
                    File file12 = new File("speaker.txt");
                    Scanner fes12 = new Scanner(file12);
                    while(fes12.hasNextLine()){
                        String[] str = fes12.nextLine().split(" ");
                        if(str[1].equals(mou)){
                            chk = true;
                            num = Integer.parseInt(str[3]);
                            break;
                        }
                    }
                    fes12.close();
                }
//                else System.out.println("Invalid Input!!!");
                if(chk){
                    System.out.println(num+" is the money you will get in return\n");
                    System.out.println("Enter your phone number");
                    String number = nes.nextLine();
                    boolean val = true;
                    for(int i = 0; i<=number.length()-1; i++){
                        if(number.charAt(0) == '0' && number.charAt(1) == '3' && Integer.parseInt(String.valueOf(number.charAt(2))) < 5){
                            if(i == 10) {
                                System.out.println("Your payment will be transferred to you within a week\n");
                                FileWriter fileWriter = new FileWriter("Return.txt", true);
                                BufferedWriter buff = new BufferedWriter(fileWriter);
                                buff.write(num+" is the money to return at "+number);
                                buff.newLine();
                                buff.close();
                                fileWriter.close();
                                val = false;
                                break;
                            }
                        }
                    }
                    if(val) System.out.println("Invalid phone number!!!");
                } else System.out.println("Product not found!!!");
            } else System.out.println("Invalid Input!!!");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    //    Information of products```````````````````````````````````````````````````````````````````````````````````````
    public static void info() {
        try{
//            object to read user's input from console
            Scanner nes = new Scanner(System.in);
            System.out.print("""
                    Which category's information you want?
                    1. Mouse
                    2. Keyboard
                    3. Graphic card
                    4. RAM
                    5. Hard-Disks
                    6. Laptop Chargers
                    7. laptop Batteries
                    8. Speakers
                    """);
            int pro = nes.nextInt();
            if(pro == 1){
                System.out.println("Products available in this category are: \n");
//                objects to read lines from text files
                File file = new File("mouse.txt");
                Scanner fes2 = new Scanner(file);
                while(fes2.hasNextLine()){
//                    printing all lines from text files on console
                    System.out.println(fes2.nextLine());
                }
//                closing object
                fes2.close();
            }
            else if(pro == 2){
                System.out.println("Products available in this category are: \n");
                File file = new File("keyboard.txt");
                Scanner fes2 = new Scanner(file);
                while(fes2.hasNextLine()){
                    System.out.println(fes2.nextLine());
                }
                fes2.close();
            }
            else if(pro == 3){
                System.out.println("Products available in this category are: \n");
                File file = new File("graphic.txt");
                Scanner fes2 = new Scanner(file);
                while(fes2.hasNextLine()){
                    System.out.println(fes2.nextLine());
                }
                fes2.close();
            }
            else if(pro == 4){
                System.out.println("Products available in this category are: \n");
                File file = new File("ram.txt");
                Scanner fes2 = new Scanner(file);
                while(fes2.hasNextLine()){
                    System.out.println(fes2.nextLine());
                }
                fes2.close();
            }
            else if(pro == 5){
                System.out.println("Products available in this category are: \n");
                File file = new File("hard.txt");
                Scanner fes2 = new Scanner(file);
                while(fes2.hasNextLine()){
                    System.out.println(fes2.nextLine());
                }
                fes2.close();
            }
            else if(pro == 6){
                System.out.println("Products available in this category are: \n");
                File file = new File("charger.txt");
                Scanner fes2 = new Scanner(file);
                while(fes2.hasNextLine()){
                    System.out.println(fes2.nextLine());
                }
                fes2.close();
            }
            else if(pro == 7){
                System.out.println("Products available in this category are: \n");
                File file = new File("battery.txt");
                Scanner fes2 = new Scanner(file);
                while(fes2.hasNextLine()){
                    System.out.println(fes2.nextLine());
                }
                fes2.close();
            }
            else if(pro == 8){
                System.out.println("Products available in this category are: \n");
                File file = new File("speaker.txt");
                Scanner fes2 = new Scanner(file);
                while(fes2.hasNextLine()){
                    System.out.println(fes2.nextLine());
                }
                fes2.close();
            } else System.out.println("Invalid Input!!!");
            System.out.println();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    /*
    ``````````````````````````````````````````````````````````````````````````````````````````
    ``````````````````````````````````````````````````````````````````````````````````````````
    ````````````````````````````````````Portion one done``````````````````````````````````````
    ``````````````````````````````````````````````````````````````````````````````````````````
    ``````````````````````````````````````````````````````````````````````````````````````````
     */
    public static void admin() {
        try{
//            object to read user's input from console
            Scanner nes = new Scanner(System.in);
            System.out.println("Enter username");
            String user = nes.nextLine();
            System.out.println("Enter password");
            String pass = nes.nextLine();
//            matching user's username and password with user's input
            if(user.equalsIgnoreCase("admin") && pass.equalsIgnoreCase("1234")){
                System.out.print("""
                    Enter you choice
                    1. Add/Delete product.
                    2. Edit product.
                    3. Search product.
                    4. View Record.
                    5. View return record         
                    """);
                int choice = nes.nextInt();
                switch (choice){
                    case 1 -> {
                        System.out.print("""
                            What you want to do?
                            1. Add Product
                            2. Delete Product
                            """);
                        int ad = nes.nextInt();
                        switch (ad){
                            case 1 -> add();
                            case 2 -> delete();
                            default -> System.out.println("Invalid Input!!!");
                        }
                    }
                    case 2 -> edit();
                    case 3 -> search();
                    case 4 -> record();
                    case 5 -> return_p();
                    default -> System.out.println("Invalid Input!!!");
                }
            } else System.out.println("Invalid Username or Password!!!");
            System.out.println();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    //    Adding product to the list````````````````````````````````````````````````````````````````````````````````````
    public static void add() {
        try{
//            reading user's input from console
            Scanner nes = new Scanner(System.in);
            System.out.print("""
                        In which category you want to add product?
                        1. Mouse
                        2. Keyboard
                        3. Graphic card
                        4. RAM
                        5. Hard-Disks
                        6. Laptop Chargers
                        7. laptop Batteries
                        8. Speakers
                        """);
            int add = nes.nextInt();
            String[] str = new String[0];
            boolean ad = true;
            if(add == 1){
//                objects to read data from text file
                File file = new File("mouse.txt");
                FileWriter fileWriter = new FileWriter(file, true);
                BufferedWriter buff =new BufferedWriter(fileWriter);
                Scanner fes = new Scanner(file);
                while(fes.hasNextLine()){
//                    splitting line to get desired data
                    str = fes.nextLine().split(" ");
                }
//                10.
                String stu = str[0];
                String[] arr = stu.split("\\.");
                int num = Integer.parseInt(arr[0]);
//                check if number of products in the text file are less 20
                if(num < 20){
                    nes.nextLine();
                    System.out.println("Enter name and model of product in proper format(Product_Model)");
                    String model = nes.nextLine();
                    for(int i = 0; i<=model.length()-1; i++){
                        if(model.charAt(i) == ' ') {
                            System.out.println("PLease write product's name and  model in proper form!!!");
                            ad = false;
                            break;
                        }
                    }
                    if(ad){
                        System.out.println("Enter price of product");
                        String price = nes.nextLine();
                        try{
                            int pr = Integer.parseInt(price);
//                            adding new line
                            buff.newLine();
//                            writing data into text file
                            fileWriter.write(num+1 + ". " + model + " Price: " + price);
                            buff.close();
                            fileWriter.close();
                            System.out.println("Product added successfully!!!\n");
                        }catch(Exception e){
                            System.out.println("Enter right price!!!");
                        }
                    }
                } else System.out.println("There are already 20 products. You cannot add more!!!\n");
//                closing objects
                fileWriter.close();
                buff.close();
                fes.close();
            }
            else if(add == 2){
                File file = new File("keyboard.txt");
                FileWriter fileWriter = new FileWriter(file, true);
                BufferedWriter buff =new BufferedWriter(fileWriter);
                Scanner fes = new Scanner(file);
                while(fes.hasNextLine()){
                    str = fes.nextLine().split(" ");
                }
                String stu = str[0];
                String[] arr = stu.split("\\.");
                int num = Integer.parseInt(arr[0]);
                if(num < 20){
                    nes.nextLine();
                    System.out.println("Enter name and model of product in proper format(Product_Model)");
                    String model = nes.nextLine();
                    for(int i = 0; i<=model.length()-1; i++){
                        if(model.charAt(i) == ' ') {
                            System.out.println("PLease write product's name and  model in proper form!!!");
                            ad = false;
                            break;
                        }
                    }
                    if(ad){
                        System.out.println("Enter price of product");
                        String price = nes.nextLine();
                        try{
                            int pr = Integer.parseInt(price);
                            buff.newLine();
                            fileWriter.write(num+1 + ". " + model + " Price: " + price);
                            buff.close();
                            fileWriter.close();
                            System.out.println("Product added successfully!!!\n");
                        }catch(Exception e){
                            System.out.println("Enter right price!!!");
                        }
                    }
                } else System.out.println("There are already 20 products. You cannot add more!!!\n");
                fileWriter.close();
                buff.close();
                fes.close();
            }
            else if(add == 3){
                File file = new File("graphic.txt");
                FileWriter fileWriter = new FileWriter(file, true);
                BufferedWriter buff =new BufferedWriter(fileWriter);
                Scanner fes = new Scanner(file);
                while(fes.hasNextLine()){
                    str = fes.nextLine().split(" ");
                }
                String stu = str[0];
                String[] arr = stu.split("\\.");
                int num = Integer.parseInt(arr[0]);
                if(num < 20){
                    nes.nextLine();
                    System.out.println("Enter name and model of product in proper format(Product_Model)");
                    String model = nes.nextLine();
                    for(int i = 0; i<=model.length()-1; i++){
                        if(model.charAt(i) == ' ') {
                            System.out.println("PLease write product's name and  model in proper form!!!");
                            ad = false;
                            break;
                        }
                    }
                    if(ad){
                        System.out.println("Enter price of product");
                        String price = nes.nextLine();
                        try{
                            int pr = Integer.parseInt(price);
                            buff.newLine();
                            fileWriter.write(num+1 + ". " + model + " Price: " + price);
                            buff.close();
                            fileWriter.close();
                            System.out.println("Product added successfully!!!\n");
                        }catch(Exception e){
                            System.out.println("Enter right price!!!");
                        }
                    }
                } else System.out.println("There are already 20 products. You cannot add more!!!\n");
                fileWriter.close();
                buff.close();
                fes.close();
            }
            else if(add == 4){
                File file = new File("ram.txt");
                FileWriter fileWriter = new FileWriter(file, true);
                BufferedWriter buff =new BufferedWriter(fileWriter);
                Scanner fes = new Scanner(file);
                while(fes.hasNextLine()){
                    str = fes.nextLine().split(" ");
                }
                String stu = str[0];
                String[] arr = stu.split("\\.");
                int num = Integer.parseInt(arr[0]);
                if(num < 20){
                    nes.nextLine();
                    System.out.println("Enter name and model of product in proper format(Product_Model)");
                    String model = nes.nextLine();
                    for(int i = 0; i<=model.length()-1; i++){
                        if(model.charAt(i) == ' ') {
                            System.out.println("PLease write product's name and  model in proper form!!!");
                            ad = false;
                            break;
                        }
                    }
                    if(ad){
                        System.out.println("Enter price of product");
                        String price = nes.nextLine();
                        try{
                            int pr = Integer.parseInt(price);
                            buff.newLine();
                            fileWriter.write(num+1 + ". " + model + " Price: " + price);
                            buff.close();
                            fileWriter.close();
                            System.out.println("Product added successfully!!!\n");
                        }catch(Exception e){
                            System.out.println("Enter right price!!!");
                        }
                    }
                } else System.out.println("There are already 20 products. You cannot add more!!!\n");
                fileWriter.close();
                buff.close();
                fes.close();
            }
            else if(add == 5){
                File file = new File("hard.txt");
                FileWriter fileWriter = new FileWriter(file, true);
                BufferedWriter buff =new BufferedWriter(fileWriter);
                Scanner fes = new Scanner(file);
                while(fes.hasNextLine()){
                    str = fes.nextLine().split(" ");
                }
                String stu = str[0];
                String[] arr = stu.split("\\.");
                int num = Integer.parseInt(arr[0]);
                if(num < 20){
                    nes.nextLine();
                    System.out.println("Enter name and model of product in proper format(Product_Model)");
                    String model = nes.nextLine();
                    for(int i = 0; i<=model.length()-1; i++){
                        if(model.charAt(i) == ' ') {
                            System.out.println("PLease write product's name and  model in proper form!!!");
                            ad = false;
                            break;
                        }
                    }
                    if(ad){
                        System.out.println("Enter price of product");
                        String price = nes.nextLine();
                        try{
                            int pr = Integer.parseInt(price);
                            buff.newLine();
                            fileWriter.write(num+1 + ". " + model + " Price: " + price);
                            buff.close();
                            fileWriter.close();
                            System.out.println("Product added successfully!!!\n");
                        }catch(Exception e){
                            System.out.println("Enter right price!!!");
                        }
                    }
                } else System.out.println("There are already 20 products. You cannot add more!!!\n");
                fileWriter.close();
                buff.close();
                fes.close();
            }
            else if(add == 6){
                File file = new File("charger.txt");
                FileWriter fileWriter = new FileWriter(file, true);
                BufferedWriter buff =new BufferedWriter(fileWriter);
                Scanner fes = new Scanner(file);
                while(fes.hasNextLine()){
                    str = fes.nextLine().split(" ");
                }
                String stu = str[0];
                String[] arr = stu.split("\\.");
                int num = Integer.parseInt(arr[0]);
                if(num < 20){
                    nes.nextLine();
                    System.out.println("Enter name and model of product in proper format(Product_Model)");
                    String model = nes.nextLine();
                    for(int i = 0; i<=model.length()-1; i++){
                        if(model.charAt(i) == ' ') {
                            System.out.println("PLease write product's name and  model in proper form!!!");
                            ad = false;
                            break;
                        }
                    }
                    if(ad){
                        System.out.println("Enter price of product");
                        String price = nes.nextLine();
                        try{
                            int pr = Integer.parseInt(price);
                            buff.newLine();
                            fileWriter.write(num+1 + ". " + model + " Price: " + price);
                            buff.close();
                            fileWriter.close();
                            System.out.println("Product added successfully!!!\n");
                        }catch(Exception e){
                            System.out.println("Enter right price!!!");
                        }
                    }
                } else System.out.println("There are already 20 products. You cannot add more!!!\n");
                fileWriter.close();
                buff.close();
                fes.close();
            }
            else if(add == 7){
                File file = new File("battery.txt");
                FileWriter fileWriter = new FileWriter(file, true);
                BufferedWriter buff =new BufferedWriter(fileWriter);
                Scanner fes = new Scanner(file);
                while(fes.hasNextLine()){
                    str = fes.nextLine().split(" ");
                }
                String stu = str[0];
                String[] arr = stu.split("\\.");
                int num = Integer.parseInt(arr[0]);
                if(num < 20){
                    nes.nextLine();
                    System.out.println("Enter name and model of product in proper format(Product_Model)");
                    String model = nes.nextLine();
                    for(int i = 0; i<=model.length()-1; i++){
                        if(model.charAt(i) == ' ') {
                            System.out.println("PLease write product's name and  model in proper form!!!");
                            ad = false;
                            break;
                        }
                    }
                    if(ad){
                        System.out.println("Enter price of product");
                        String price = nes.nextLine();
                        try{
                            int pr = Integer.parseInt(price);
                            buff.newLine();
                            fileWriter.write(num+1 + ". " + model + " Price: " + price);
                            buff.close();
                            fileWriter.close();
                            System.out.println("Product added successfully!!!\n");
                        }catch(Exception e){
                            System.out.println("Enter right price!!!");
                        }
                    }
                } else System.out.println("There are already 20 products. You cannot add more!!!\n");
                fileWriter.close();
                buff.close();
                fes.close();
            }
            else if(add == 8){
                File file = new File("speaker.txt");
                FileWriter fileWriter = new FileWriter(file, true);
                BufferedWriter buff =new BufferedWriter(fileWriter);
                Scanner fes = new Scanner(file);
                while(fes.hasNextLine()){
                    str = fes.nextLine().split(" ");
                }
                String stu = str[0];
                String[] arr = stu.split("\\.");
                int num = Integer.parseInt(arr[0]);
                if(num < 20){
                    nes.nextLine();
                    System.out.println("Enter name and model of product in proper format(Product_Model)");
                    String model = nes.nextLine();
                    for(int i = 0; i<=model.length()-1; i++){
                        if(model.charAt(i) == ' ') {
                            System.out.println("PLease write product's name and  model in proper form!!!");
                            ad = false;
                            break;
                        }
                    }
                    if(ad){
                        System.out.println("Enter price of product");
                        String price = nes.nextLine();
                        try{
                            int pr = Integer.parseInt(price);
                            buff.newLine();
                            fileWriter.write(num+1 + ". " + model + " Price: " + price);
                            buff.close();
                            fileWriter.close();
                            System.out.println("Product added successfully!!!\n");
                        }catch(Exception e){
                            System.out.println("Enter right price!!!");
                        }
                    }
                } else System.out.println("There are already 20 products. You cannot add more!!!\n");
                fileWriter.close();
                buff.close();
                fes.close();
            }else System.out.println("Invalid Input!!!");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    //    Edit product details``````````````````````````````````````````````````````````````````````````````````````````
    public static void edit() {
        try{
//            reading user's input from console
            Scanner nes = new Scanner(System.in);
            System.out.print("""
                In which category you want to edit product details?
                1. Mouse
                2. Keyboard
                3. Graphic card
                4. RAM
                5. Hard-Disks
                6. Laptop Chargers
                7. laptop Batteries
                8. Speakers
                """);
            int choice = nes.nextInt();
            boolean val = false;
            boolean mod = true;
            boolean ext = false;
            if (choice == 1) {
//                objects to read data from text file
                File file1 = new File("mouse.txt");
                FileWriter fileWriter1 = new FileWriter(file1, true);
                BufferedWriter buff1 = new BufferedWriter(fileWriter1);
                Scanner fes1 = new Scanner(file1);
                String[] str = new String[20];
                int j = 0;
//                printing data from text files on console
                while (fes1.hasNextLine()) {
                    System.out.println(fes1.nextLine());
                }
                Scanner fes11 = new Scanner(file1);
//                writing data line by line into string array
                while (fes11.hasNextLine()) {
                    str[j] = fes11.nextLine();
                    j++;
                }
                nes.nextLine();
                Scanner ves = new Scanner(file1);
                System.out.println("In which product you want to make changes?");
                String sc = nes.nextLine();
//                converting input into integer to make calculations
                int mou = Integer.parseInt(sc);
                String[] str1 = new String[0];
                while(ves.hasNextLine()){
//                    splitting lines to access desired data
                    str1 =ves.nextLine().split(" ");
                }
//                splitting zero[0] index to remove dot(.)
                String[] mes1 = str1[0].split("\\.");
//                converting into integer for calculations
                int num = Integer.parseInt(mes1[0]);
//                check for user's valid input
                if(mou > num)
                    System.out.println("Product not found!!!");
                else{
//                    combining input with (.) to match with splitted data from text filee
                    sc = sc + ".";
                    for (int i = 0; i < str.length; i++) {
                        String[] arr = str[i].split(" ");
                        if (arr[0].equals(sc)) {
                            System.out.println("""
                            What you want to edit?
                            Enter "d" for product name/model.
                            Enter "p" for product price.
                            """);
                            String edit = nes.nextLine();
                            if (edit.equalsIgnoreCase("d")) {
                                System.out.println("Enter product new \"name_model\" in proper form.");
                                arr[1] = nes.nextLine();
                                for(int x = 0; x<=arr[1].length()-1; x++){
                                    if(arr[1].charAt(x) == ' ') {
                                        System.out.println("Please write name and model in proper form!!!");
                                        mod = false;
                                        ext = mod;
                                        break;
                                    }
                                }
                                if(mod){
//                                    updating line of array after validation
                                    str[i] = arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3];
                                    System.out.println("Product details Updated successfully!!!");
                                    ext = mod;
                                    break;
                                }
                                break;
                            } else if (edit.equalsIgnoreCase("p")) {
                                System.out.println("Enter product new price.");
                                arr[3] = nes.nextLine();
                                try{
                                    int pr = Integer.parseInt(arr[3]);
//                                    updating line of array after validation
                                    str[i] = arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3];
                                    val = true;
                                    System.out.println("Product price Updated successfully!!!");
                                    ext = val;
                                    break;
                                }catch(Exception e){
                                    System.out.println("Enter right price!!!");
                                    break;
                                }
                            } else{
                                System.out.println("Invalid input!!!");
                                break;
                            }
                        }
                    }
                    if(ext){
//                        making file empty
                        FileWriter nex = new FileWriter(file1);
                        nex.write("");
                        for (String e : str) {
                            if (e != null) {
//                                writing array with updated line into text file
                                buff1.write(e);
//                                adding new line
                                buff1.newLine();
                            }
                        }
//                        closing objects
                        buff1.close();
                        fes1.close();
                        fes11.close();
                        fileWriter1.close();
                    }
                }
            } else if (choice == 2) {
                File file2 = new File("keyboard.txt");
                FileWriter fileWriter2 = new FileWriter(file2, true);
                BufferedWriter buff2 = new BufferedWriter(fileWriter2);
                Scanner fes2 = new Scanner(file2);
                String[] str = new String[20];
                int j = 0;
                while (fes2.hasNextLine()) {
                    System.out.println(fes2.nextLine());
                }
                Scanner fes22 = new Scanner(file2);
                while (fes22.hasNextLine()) {
                    str[j] = fes22.nextLine();
                    j++;
                }
                nes.nextLine();
                Scanner ves = new Scanner(file2);
                System.out.println("In which product you want to make changes?");
                String sc = nes.nextLine();
                int mou = Integer.parseInt(sc);
                String[] str1 = new String[0];
                while(ves.hasNextLine()){
                    str1 =ves.nextLine().split(" ");
                }
                String[] mes1 = str1[0].split("\\.");
                int num = Integer.parseInt(mes1[0]);
                if(mou > num)
                    System.out.println("Product not found!!!");
                else{
                    sc = sc + ".";
                    for (int i = 0; i < str.length; i++) {
                        String[] arr = str[i].split(" ");
                        if (arr[0].equals(sc)) {
                            System.out.println("""
                            What you want to edit?
                            Enter "d" for product name/model.
                            Enter "p" for product price.
                            """);
                            String edit = nes.nextLine();
                            if (edit.equalsIgnoreCase("d")) {
                                System.out.println("Enter product new \"name_model\" in proper form.");
                                arr[1] = nes.nextLine();
                                for(int x = 0; x<=arr[1].length()-1; x++){
                                    if(arr[1].charAt(x) == ' ') {
                                        System.out.println("Please write name and model in proper form!!!");
                                        mod = false;
                                        ext = mod;
                                        break;
                                    }
                                }
                                if(mod){
                                    str[i] = arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3];
                                    System.out.println("Product details Updated successfully!!!");
                                    ext = mod;
                                    break;
                                }
                                break;
                            } else if (edit.equalsIgnoreCase("p")) {
                                System.out.println("Enter product new price.");
                                arr[3] = nes.nextLine();
                                try{
                                    int pr = Integer.parseInt(arr[3]);
                                    str[i] = arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3];
                                    val = true;
                                    System.out.println("Product price Updated successfully!!!");
                                    ext = val;
                                    break;
                                }catch(Exception e){
                                    System.out.println("Enter right price!!!");
                                    break;
                                }
                            } else{
                                System.out.println("Invalid input!!!");
                                break;
                            }
                        }
                    }
                    if(ext){
                        FileWriter nex = new FileWriter(file2);
                        nex.write("");
                        for (String e : str) {
                            if (e != null) {
                                buff2.write(e);
                                buff2.newLine();
                            }
                        }
                        buff2.close();
                        fes2.close();
                        fes22.close();
                        fileWriter2.close();
                    }
                }
            } else if (choice == 3) {
                File file3 = new File("graphic.txt");
                FileWriter fileWriter3 = new FileWriter(file3, true);
                BufferedWriter buff3 = new BufferedWriter(fileWriter3);
                Scanner fes3 = new Scanner(file3);
                String[] str = new String[20];
                int j = 0;
                while (fes3.hasNextLine()) {
                    System.out.println(fes3.nextLine());
                }
                Scanner fes33 = new Scanner(file3);
                while (fes33.hasNextLine()) {
                    str[j] = fes33.nextLine();
                    j++;
                }
                nes.nextLine();
                Scanner ves = new Scanner(file3);
                System.out.println("In which product you want to make changes?");
                String sc = nes.nextLine();
                int mou = Integer.parseInt(sc);
                String[] str1 = new String[0];
                while(ves.hasNextLine()){
                    str1 =ves.nextLine().split(" ");
                }
                String[] mes1 = str1[0].split("\\.");
                int num = Integer.parseInt(mes1[0]);
                if(mou > num)
                    System.out.println("Product not found!!!");
                else {
                    sc = sc + ".";
                    for (int i = 0; i < str.length; i++) {
                        String[] arr = str[i].split(" ");
                        if (arr[0].equals(sc)) {
                            System.out.println("""
                            What you want to edit?
                            Enter "d" for product name/model.
                            Enter "p" for product price.
                            """);
                            String edit = nes.nextLine();
                            if (edit.equalsIgnoreCase("d")) {
                                System.out.println("Enter product new \"name_model\" in proper form.");
                                arr[1] = nes.nextLine();
                                for(int x = 0; x<=arr[1].length()-1; x++){
                                    if(arr[1].charAt(x) == ' ') {
                                        System.out.println("Please write name and model in proper form!!!");
                                        mod = false;
                                        ext = mod;
                                        break;
                                    }
                                }
                                if(mod){
                                    str[i] = arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3];
                                    System.out.println("Product details Updated successfully!!!");
                                    ext = mod;
                                    break;
                                }
                                break;
                            } else if (edit.equalsIgnoreCase("p")) {
                                System.out.println("Enter product new price.");
                                arr[3] = nes.nextLine();
                                try{
                                    int pr = Integer.parseInt(arr[3]);
                                    str[i] = arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3];
                                    val = true;
                                    System.out.println("Product price Updated successfully!!!");
                                    ext = val;
                                    break;
                                }catch(Exception e){
                                    System.out.println("Enter right price!!!");
                                    break;
                                }
                            } else{
                                System.out.println("Invalid input!!!");
                                break;
                            }
                        }
                    }
                    if(ext){
                        FileWriter nex = new FileWriter(file3);
                        nex.write("");
                        for (String e : str) {
                            if (e != null) {
                                buff3.write(e);
                                buff3.newLine();
                            }
                        }
                        buff3.close();
                        fes3.close();
                        fes33.close();
                        fileWriter3.close();
                    }
                }
            } else if (choice == 4) {
                File file4 = new File("ram.txt");
                FileWriter fileWriter4 = new FileWriter(file4, true);
                BufferedWriter buff4 = new BufferedWriter(fileWriter4);
                Scanner fes4 = new Scanner(file4);
                String[] str = new String[20];
                int j = 0;
                while (fes4.hasNextLine()) {
                    System.out.println(fes4.nextLine());
                }
                Scanner fes44 = new Scanner(file4);
                while (fes44.hasNextLine()) {
                    str[j] = fes44.nextLine();
                    j++;
                }
                nes.nextLine();
                Scanner ves = new Scanner(file4);
                System.out.println("In which product you want to make changes?");
                String sc = nes.nextLine();
                int mou = Integer.parseInt(sc);
                String[] str1 = new String[0];
                while(ves.hasNextLine()){
                    str1 =ves.nextLine().split(" ");
                }
                String[] mes1 = str1[0].split("\\.");
                int num = Integer.parseInt(mes1[0]);
                if(mou > num)
                    System.out.println("Product not found!!!");
                else{
                    sc = sc + ".";
                    for (int i = 0; i < str.length; i++) {
                        String[] arr = str[i].split(" ");
                        if (arr[0].equals(sc)) {
                            System.out.println("""
                            What you want to edit?
                            Enter "d" for product name/model.
                            Enter "p" for product price.
                            """);
                            String edit = nes.nextLine();
                            if (edit.equalsIgnoreCase("d")) {
                                System.out.println("Enter product new \"name_model\" in proper form.");
                                arr[1] = nes.nextLine();
                                for(int x = 0; x<=arr[1].length()-1; x++){
                                    if(arr[1].charAt(x) == ' ') {
                                        System.out.println("Please write name and model in proper form!!!");
                                        mod = false;
                                        ext = mod;
                                        break;
                                    }
                                }
                                if(mod){
                                    str[i] = arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3];
                                    System.out.println("Product details Updated successfully!!!");
                                    ext = mod;
                                    break;
                                }
                                break;
                            } else if (edit.equalsIgnoreCase("p")) {
                                System.out.println("Enter product new price.");
                                arr[3] = nes.nextLine();
                                try{
                                    int pr = Integer.parseInt(arr[3]);
                                    str[i] = arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3];
                                    val = true;
                                    System.out.println("Product price Updated successfully!!!");
                                    ext = val;
                                    break;
                                }catch(Exception e){
                                    System.out.println("Enter right price!!!");
                                    break;
                                }
                            } else{
                                System.out.println("Invalid input!!!");
                                break;
                            }
                        }
                    }
                    if(ext){
                        FileWriter nex = new FileWriter(file4);
                        nex.write("");
                        for (String e : str) {
                            if (e != null) {
                                buff4.write(e);
                                buff4.newLine();
                            }
                        }
                        buff4.close();
                        fes4.close();
                        fes44.close();
                        fileWriter4.close();
                    }
                }
            } else if (choice == 5) {
                File file5 = new File("hard.txt");
                FileWriter fileWriter5 = new FileWriter(file5, true);
                BufferedWriter buff5 = new BufferedWriter(fileWriter5);
                Scanner fes5 = new Scanner(file5);
                String[] str = new String[20];
                int j = 0;
                while (fes5.hasNextLine()) {
                    System.out.println(fes5.nextLine());
                }
                Scanner fes55 = new Scanner(file5);
                while (fes55.hasNextLine()) {
                    str[j] = fes55.nextLine();
                    j++;
                }
                nes.nextLine();
                Scanner ves = new Scanner(file5);
                System.out.println("In which product you want to make changes?");
                String sc = nes.nextLine();
                int mou = Integer.parseInt(sc);
                String[] str1 = new String[0];
                while(ves.hasNextLine()){
                    str1 =ves.nextLine().split(" ");
                }
                String[] mes1 = str1[0].split("\\.");
                int num = Integer.parseInt(mes1[0]);
                if(mou > num)
                    System.out.println("Product not found!!!");
                else{
                    sc = sc + ".";
                    for (int i = 0; i < str.length; i++) {
                        String[] arr = str[i].split(" ");
                        if (arr[0].equals(sc)) {
                            System.out.println("""
                            What you want to edit?
                            Enter "d" for product name/model.
                            Enter "p" for product price.
                            """);
                            String edit = nes.nextLine();
                            if (edit.equalsIgnoreCase("d")) {
                                System.out.println("Enter product new \"name_model\" in proper form.");
                                arr[1] = nes.nextLine();
                                for(int x = 0; x<=arr[1].length()-1; x++){
                                    if(arr[1].charAt(x) == ' ') {
                                        System.out.println("Please write name and model in proper form!!!");
                                        mod = false;
                                        ext = mod;
                                        break;
                                    }
                                }
                                if(mod){
                                    str[i] = arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3];
                                    System.out.println("Product details Updated successfully!!!");
                                    ext = mod;
                                    break;
                                }
                                break;
                            } else if (edit.equalsIgnoreCase("p")) {
                                System.out.println("Enter product new price.");
                                arr[3] = nes.nextLine();
                                try{
                                    int pr = Integer.parseInt(arr[3]);
                                    str[i] = arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3];
                                    val = true;
                                    System.out.println("Product price Updated successfully!!!");
                                    ext = val;
                                    break;
                                }catch(Exception e){
                                    System.out.println("Enter right price!!!");
                                    break;
                                }
                            } else{
                                System.out.println("Invalid input!!!");
                                break;
                            }
                        }
                    }
                    if(ext){
                        FileWriter nex = new FileWriter(file5);
                        nex.write("");
                        for (String e : str) {
                            if (e != null) {
                                buff5.write(e);
                                buff5.newLine();
                            }
                        }
                        buff5.close();
                        fes5.close();
                        fes55.close();
                        fileWriter5.close();
                    }
                }
            } else if (choice == 6) {
                File file6 = new File("charger.txt");
                FileWriter fileWriter6 = new FileWriter(file6, true);
                BufferedWriter buff6 = new BufferedWriter(fileWriter6);
                Scanner fes6 = new Scanner(file6);
                String[] str = new String[20];
                int j = 0;
                while (fes6.hasNextLine()) {
                    System.out.println(fes6.nextLine());
                }
                Scanner fes66 = new Scanner(file6);
                while (fes66.hasNextLine()) {
                    str[j] = fes66.nextLine();
                    j++;
                }
                nes.nextLine();
                Scanner ves = new Scanner(file6);
                System.out.println("In which product you want to make changes?");
                String sc = nes.nextLine();
                int mou = Integer.parseInt(sc);
                String[] str1 = new String[0];
                while(ves.hasNextLine()){
                    str1 =ves.nextLine().split(" ");
                }
                String[] mes1 = str1[0].split("\\.");
                int num = Integer.parseInt(mes1[0]);
                if(mou > num)
                    System.out.println("Product not found!!!");
                else{
                    sc = sc + ".";
                    for (int i = 0; i < str.length; i++) {
                        String[] arr = str[i].split(" ");
                        if (arr[0].equals(sc)) {
                            System.out.println("""
                            What you want to edit?
                            Enter "d" for product name/model.
                            Enter "p" for product price.
                            """);
                            String edit = nes.nextLine();
                            if (edit.equalsIgnoreCase("d")) {
                                System.out.println("Enter product new \"name_model\" in proper form.");
                                arr[1] = nes.nextLine();
                                for(int x = 0; x<=arr[1].length()-1; x++){
                                    if(arr[1].charAt(x) == ' ') {
                                        System.out.println("Please write name and model in proper form!!!");
                                        mod = false;
                                        ext = mod;
                                        break;
                                    }
                                }
                                if(mod){
                                    str[i] = arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3];
                                    System.out.println("Product details Updated successfully!!!");
                                    ext = mod;
                                    break;
                                }
                                break;
                            } else if (edit.equalsIgnoreCase("p")) {
                                System.out.println("Enter product new price.");
                                arr[3] = nes.nextLine();
                                try{
                                    int pr = Integer.parseInt(arr[3]);
                                    str[i] = arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3];
                                    val = true;
                                    System.out.println("Product price Updated successfully!!!");
                                    ext = val;
                                    break;
                                }catch(Exception e){
                                    System.out.println("Enter right price!!!");
                                    break;
                                }
                            } else{
                                System.out.println("Invalid input!!!");
                                break;
                            }
                        }
                    }
                    if(ext){
                        FileWriter nex = new FileWriter(file6);
                        nex.write("");
                        for (String e : str) {
                            if (e != null) {
                                buff6.write(e);
                                buff6.newLine();
                            }
                        }
                        buff6.close();
                        fes6.close();
                        fes6.close();
                        fileWriter6.close();
                    }
                }
            } else if (choice == 7) {
                File file7 = new File("battery.txt");
                FileWriter fileWriter7 = new FileWriter(file7, true);
                BufferedWriter buff7 = new BufferedWriter(fileWriter7);
                Scanner fes7 = new Scanner(file7);
                String[] str = new String[20];
                int j = 0;
                while (fes7.hasNextLine()) {
                    System.out.println(fes7.nextLine());
                }
                Scanner fes77 = new Scanner(file7);
                while (fes77.hasNextLine()) {
                    str[j] = fes77.nextLine();
                    j++;
                }
                nes.nextLine();
                Scanner ves = new Scanner(file7);
                System.out.println("In which product you want to make changes?");
                String sc = nes.nextLine();
                int mou = Integer.parseInt(sc);
                String[] str1 = new String[0];
                while(ves.hasNextLine()){
                    str1 =ves.nextLine().split(" ");
                }
                String[] mes1 = str1[0].split("\\.");
                int num = Integer.parseInt(mes1[0]);
                if(mou > num)
                    System.out.println("Product not found!!!");
                else {
                    sc = sc + ".";
                    for (int i = 0; i < str.length; i++) {
                        String[] arr = str[i].split(" ");
                        if (arr[0].equals(sc)) {
                            System.out.println("""
                            What you want to edit?
                            Enter "d" for product name/model.
                            Enter "p" for product price.
                            """);
                            String edit = nes.nextLine();
                            if (edit.equalsIgnoreCase("d")) {
                                System.out.println("Enter product new \"name_model\" in proper form.");
                                arr[1] = nes.nextLine();
                                for(int x = 0; x<=arr[1].length()-1; x++){
                                    if(arr[1].charAt(x) == ' ') {
                                        System.out.println("Please write name and model in proper form!!!");
                                        mod = false;
                                        ext = mod;
                                        break;
                                    }
                                }
                                if(mod){
                                    str[i] = arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3];
                                    System.out.println("Product details Updated successfully!!!");
                                    ext = mod;
                                    break;
                                }
                                break;
                            } else if (edit.equalsIgnoreCase("p")) {
                                System.out.println("Enter product new price.");
                                arr[3] = nes.nextLine();
                                try{
                                    int pr = Integer.parseInt(arr[3]);
                                    str[i] = arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3];
                                    val = true;
                                    System.out.println("Product price Updated successfully!!!");
                                    ext = val;
                                    break;
                                }catch(Exception e){
                                    System.out.println("Enter right price!!!");
                                    break;
                                }
                            } else{
                                System.out.println("Invalid input!!!");
                                break;
                            }
                        }
                    }
                    if(ext){
                        FileWriter nex = new FileWriter(file7);
                        nex.write("");
                        for (String e : str) {
                            if (e != null) {
                                buff7.write(e);
                                buff7.newLine();
                            }
                        }
                        buff7.close();
                        fes7.close();
                        fes77.close();
                        fileWriter7.close();
                    }
                }
            } else if (choice == 8) {
                File file8 = new File("speaker.txt");
                FileWriter fileWriter8 = new FileWriter(file8, true);
                BufferedWriter buff8 = new BufferedWriter(fileWriter8);
                Scanner fes8 = new Scanner(file8);
                String[] str = new String[20];
                int j = 0;
                while (fes8.hasNextLine()) {
                    System.out.println(fes8.nextLine());
                }
                Scanner fes88 = new Scanner(file8);
                while (fes88.hasNextLine()) {
                    str[j] = fes88.nextLine();
                    j++;
                }
                nes.nextLine();
                Scanner ves = new Scanner(file8);
                System.out.println("In which product you want to make changes?");
                String sc = nes.nextLine();
                int mou = Integer.parseInt(sc);
                String[] str1 = new String[0];
                while(ves.hasNextLine()){
                    str1 =ves.nextLine().split(" ");
                }
                String[] mes1 = str1[0].split("\\.");
                int num = Integer.parseInt(mes1[0]);
                if(mou > num)
                    System.out.println("Product not found!!!");
                else{
                    sc = sc + ".";
                    for (int i = 0; i < str.length; i++) {
                        String[] arr = str[i].split(" ");
                        if (arr[0].equals(sc)) {
                            System.out.println("""
                            What you want to edit?
                            Enter "d" for product name/model.
                            Enter "p" for product price.
                            """);
                            String edit = nes.nextLine();
                            if (edit.equalsIgnoreCase("d")) {
                                System.out.println("Enter product new \"name_model\" in proper form.");
                                arr[1] = nes.nextLine();
                                for(int x = 0; x<=arr[1].length()-1; x++){
                                    if(arr[1].charAt(x) == ' ') {
                                        System.out.println("Please write name and model in proper form!!!");
                                        mod = false;
                                        ext = mod;
                                        break;
                                    }
                                }
                                if(mod){
                                    str[i] = arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3];
                                    System.out.println("Product details Updated successfully!!!");
                                    ext = mod;
                                    break;
                                }
                                break;
                            } else if (edit.equalsIgnoreCase("p")) {
                                System.out.println("Enter product new price.");
                                arr[3] = nes.nextLine();
                                try{
                                    int pr = Integer.parseInt(arr[3]);
                                    str[i] = arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3];
                                    val = true;
                                    System.out.println("Product price Updated successfully!!!");
                                    ext = val;
                                    break;
                                }catch(Exception e){
                                    System.out.println("Enter right price!!!");
                                    break;
                                }
                            } else{
                                System.out.println("Invalid input!!!");
                                break;
                            }
                        }
                    }
                    if(ext){
                        FileWriter nex = new FileWriter(file8);
                        nex.write("");
                        for (String e : str) {
                            if (e != null) {
                                buff8.write(e);
                                buff8.newLine();
                            }
                        }
                        buff8.close();
                        fes8.close();
                        fes88.close();
                        fileWriter8.close();
                    }
                }
            } else System.out.println("Invalid input!!!");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    //    Searching products````````````````````````````````````````````````````````````````````````````````````````````
    public static void search() {
        try{
//            reading user's input from console
            Scanner nes = new Scanner(System.in);
            System.out.print("""
                        In which category you want to search product?
                        1. Mouse
                        2. Keyboard
                        3. Graphic card
                        4. RAM
                        5. Hard-Disks
                        6. Laptop Chargers
                        7. laptop Batteries
                        8. Speakers
                        """);
            int search = nes.nextInt();
            if(search == 1){
//                objects to read data from text files
                File file = new File("mouse.txt");
                Scanner fes = new Scanner(file);
                nes.nextLine();
                System.out.println("Enter \"name_model\" of product in proper form");
                String srch = nes.nextLine();
//                boolean for invalid input check
                boolean bool = true;
//                splitting lines to get desired data
                while(fes.hasNextLine()){
                    String[] str = fes.nextLine().split(" ");
//                    matching user's input with splitted data from text files
                    if(str[1].equals(srch)) {
                        System.out.println("Yes, This product is available\n" + str[2] + " " + str[3]);
                        bool = false;
                        break;
                    }
                }
                if(bool)
                    System.out.println("No, This product is not available.");
//                closing object
                fes.close();
            }
            else if(search == 2){
                File file = new File("keyboard.txt");
                Scanner fes = new Scanner(file);
                nes.nextLine();
                System.out.println("Enter \"name_model\" of product in proper form");
                String srch = nes.nextLine();
                boolean bool = true;
                while(fes.hasNextLine()){
                    String[] str = fes.nextLine().split(" ");
                    if(str[1].equals(srch)) {
                        System.out.println("Yes, This product is available\n" + str[2] + " " + str[3]);
                        bool = false;
                        break;
                    }
                }
                if(bool)
                    System.out.println("No, This product is not available.");
                fes.close();
            }
            else if(search == 3){
                File file = new File("graphic.txt");
                Scanner fes = new Scanner(file);
                nes.nextLine();
                System.out.println("Enter \"name_model\" of product in proper form");
                String srch = nes.nextLine();
                boolean bool = true;
                while(fes.hasNextLine()){
                    String[] str = fes.nextLine().split(" ");
                    if(str[1].equals(srch)) {
                        System.out.println("Yes, This product is available\n" + str[2] + " " + str[3]);
                        bool = false;
                        break;
                    }
                }
                if(bool)
                    System.out.println("No, This product is not available.");
                fes.close();
            }
            else if(search == 4){
                File file = new File("ram.txt");
                Scanner fes = new Scanner(file);
                nes.nextLine();
                System.out.println("Enter \"name_model\" of product in proper form");
                String srch = nes.nextLine();
                boolean bool = true;
                while(fes.hasNextLine()){
                    String[] str = fes.nextLine().split(" ");
                    if(str[1].equals(srch)) {
                        System.out.println("Yes, This product is available\n" + str[2] + " " + str[3]);
                        bool = false;
                        break;
                    }
                }
                if(bool)
                    System.out.println("No, This product is not available.");
                fes.close();
            }
            else if(search == 5){
                File file = new File("hard.txt");
                Scanner fes = new Scanner(file);
                nes.nextLine();
                System.out.println("Enter \"name_model\" of product in proper form");
                String srch = nes.nextLine();
                boolean bool = true;
                while(fes.hasNextLine()){
                    String[] str = fes.nextLine().split(" ");
                    if(str[1].equals(srch)) {
                        System.out.println("Yes, This product is available\n" + str[2] + " " + str[3]);
                        bool = false;
                        break;
                    }
                }
                if(bool)
                    System.out.println("No, This product is not available.");
                fes.close();
            }
            else if(search == 6){
                File file = new File("charger.txt");
                Scanner fes = new Scanner(file);
                nes.nextLine();
                System.out.println("Enter \"name_model\" of product in proper form");
                String srch = nes.nextLine();
                boolean bool = true;
                while(fes.hasNextLine()){
                    String[] str = fes.nextLine().split(" ");
                    if(str[1].equals(srch)) {
                        System.out.println("Yes, This product is available\n" + str[2] + " " + str[3]);
                        bool = false;
                        break;
                    }
                }
                if(bool)
                    System.out.println("No, This product is not available.");
                fes.close();
            }
            else if(search == 7){
                File file = new File("battery.txt");
                Scanner fes = new Scanner(file);
                nes.nextLine();
                System.out.println("Enter \"name_model\" of product in proper form");
                String srch = nes.nextLine();
                boolean bool = true;
                while(fes.hasNextLine()){
                    String[] str = fes.nextLine().split(" ");
                    if(str[1].equals(srch)) {
                        System.out.println("Yes, This product is available\n" + str[2] + " " + str[3]);
                        bool = false;
                        break;
                    }
                }
                if(bool)
                    System.out.println("No, This product is not available.");
                fes.close();
            }
            else if(search == 8){
                File file = new File("speaker.txt");
                Scanner fes = new Scanner(file);
                nes.nextLine();
                System.out.println("Enter \"name_model\" of product in proper form");
                String srch = nes.nextLine();
                boolean bool = true;
                while(fes.hasNextLine()){
                    String[] str = fes.nextLine().split(" ");
                    if(str[1].equals(srch)) {
                        System.out.println("Yes, This product is available\n" + str[2] + " " + str[3]);
                        bool = false;
                        break;
                    }
                }
                if(bool)
                    System.out.println("No, This product is not available.");
                fes.close();
            }else System.out.println("Invalid Input!!!");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    //    Showing record of previous sales``````````````````````````````````````````````````````````````````````````````
    public static void record() {
        try{
//            objects to read data from text file
            File file = new File("record.txt");
            Scanner fes = new Scanner(file);
            System.out.println("Information of previous sales is as follows:-\n");
//            printing line from text files on console
            while(fes.hasNextLine()){
                System.out.println(fes.nextLine());
            }
//            closing objects
            fes.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    //    returning money
    public static void return_p() {
        try{
//            objects to read data from text file
            File file = new File("return.txt");
            Scanner fes = new Scanner(file);
            System.out.println("Money to return to numbers is as follows:-\n");
//            printing line from text files on console
            while(fes.hasNextLine()){
                System.out.println(fes.nextLine());
            }
//            closing objects
            fes.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    //    Deleting product``````````````````````````````````````````````````````````````````````````````````````````````
    public static void delete() {
        try {
//            object to read user's input from console
            Scanner nes = new Scanner(System.in);
            System.out.print("""
                        Which product you wanna buy?
                        1. Mouse
                        2. Keyboards
                        3. Graphic card
                        4. RAM
                        5. Hard-Disks
                        6. Laptop Chargers
                        7. laptop Batteries
                        8. Speakers
                        """);
            int choice = nes.nextInt();
            if(choice == 1){
//                objects to read data form text files
                File file1 = new File("mouse.txt");
                Scanner fes1 = new Scanner(file1);
//                string array to store all lines from text file
                String[] str = new String[20];
//                string array to store all lines from text file after deleting one line
                String[] mes = new String[20];
//                printing all lines from text file on console
                while (fes1.hasNextLine()) {
                    System.out.println(fes1.nextLine());
                }
                Scanner fes11 = new Scanner(file1);
//                writing lines from text file into array
                int j = 0;
                while (fes11.hasNextLine()) {
                    str[j] = fes11.nextLine();
                    j++;
                }
                nes.nextLine();
                Scanner ves = new Scanner(file1);
                System.out.println("Which product you want to delete?");
                String sc = nes.nextLine();
//                converting user's input into integer for calculations
                int mou = Integer.parseInt(sc);
                String[] str1 = new String[0];
                while(ves.hasNextLine()){
//                    splitting lines to get desired data
                    str1 =ves.nextLine().split(" ");
                }
//                separating zero index from dot(.)
                String[] mes1 = str1[0].split("\\.");
                int num = Integer.parseInt(mes1[0]);
//                check for user's input
                if(mou > num)
                    System.out.println("Product not found!!!");
                else{
//                    concatenating input with dot(.) to match with splitted data
                    String sc1 = sc + ".";
                    for (int i = 0; i < str.length; i++) {
                        String[] arr = str[i].split(" ");
//                        deleting a line by writing it empty
                        if (arr[0].equals(sc1)) {
                            str[i] = " ";
                            break;
                        }
                    }
                    int x = 0;
//                    writing array with deleted line into another array
                    for(String e:str){
                        if(e != null)
                            mes[x] = e;
                        x++;
                    }
//                    swapping array lines to move empty line to the last
                    for(int i = 0; i<19; i++){
                        if(mes[i].equals(" ")){
                            mes[i] = mes[i+1];
                            mes[i+1] = " ";
                        }
                    }
                    String[] mess = new String[0];
                    int count = 0;
//                    counting number of lines in array to write lines in proper numbering
                    for(String k:mes){
                        if(k != null)
                            count++;
                    }
                    for(int i = 0; i<=count; i++) {
                        if(mes[i] != null){
                            mess = mes[i].split(" ");
                            mess[0] = i+1 +".";
//                            updating numbering of lines
                            mes[i] = mess[0] + " " + mess[1] + " " + mess[2] + " " + mess[3];
                        }
                    }
//                    objects to write array with deleted line into text file
                    FileWriter fileWriter = new FileWriter(file1);
                    BufferedWriter buff = new BufferedWriter(fileWriter);
                    for(String e:mes){
                        if(e !=null){
                            if(!e.equals(" ")){
//                                writing in text file
                                buff.write(e);
//                                adding new line
                                buff.newLine();
                            }
                        }
                    }
//                    closing objects
                    buff.close();
                    fes1.close();
                    fes11.close();
                    ves.close();
                    System.out.println("Product deleted successfully!!!");
                }
            }
            else if(choice == 2){
                File file1 = new File("keyboard.txt");
                Scanner fes1 = new Scanner(file1);
                String[] str = new String[20];
                String[] mes = new String[20];
                while (fes1.hasNextLine()) {
                    System.out.println(fes1.nextLine());
                }
                Scanner fes11 = new Scanner(file1);
                int j = 0;
                while (fes11.hasNextLine()) {
                    str[j] = fes11.nextLine();
                    j++;
                }
                nes.nextLine();
                Scanner ves = new Scanner(file1);
                System.out.println("Which product you want to delete?");
                String sc = nes.nextLine();
                int mou = Integer.parseInt(sc);
                String[] str1 = new String[0];
                while(ves.hasNextLine()){
                    str1 =ves.nextLine().split(" ");
                }
                String[] mes1 = str1[0].split("\\.");
                int num = Integer.parseInt(mes1[0]);
                if(mou > num)
                    System.out.println("Product not found!!!");
                else{
                    String sc1 = sc + ".";
                    for (int i = 0; i < str.length; i++) {
                        String[] arr = str[i].split(" ");
                        if (arr[0].equals(sc1)) {
                            str[i] = " ";
                            break;
                        }
                    }
                    int x = 0;
                    for(String e:str){
                        if(e != null)
                            mes[x] = e;
                        x++;
                    }
                    for(int i = 0; i<19; i++){
                        if(mes[i].equals(" ")){
                            mes[i] = mes[i+1];
                            mes[i+1] = " ";
                        }
                    }
                    String[] mess = new String[0];
                    int count = 0;
                    for(String k:mes){
                        if(k != null)
                            count++;
                    }
                    for(int i = 0; i<=count; i++) {
                        if(mes[i] != null){
                            mess = mes[i].split(" ");
                            mess[0] = i+1 +".";
                            mes[i] = mess[0] + " " + mess[1] + " " + mess[2] + " " + mess[3];
                        }
                    }
                    FileWriter fileWriter = new FileWriter(file1);
                    BufferedWriter buff = new BufferedWriter(fileWriter);
                    for(String e:mes){
                        if(e !=null){
                            if(!e.equals(" ")){
                                buff.write(e);
                                buff.newLine();
                            }
                        }
                    }
                    buff.close();
                    fes1.close();
                    fes11.close();
                    ves.close();
                    System.out.println("Product deleted successfully!!!");
                }
            }
            else if(choice == 3){
                File file1 = new File("graphic.txt");
                Scanner fes1 = new Scanner(file1);
                String[] str = new String[20];
                String[] mes = new String[20];
                while (fes1.hasNextLine()) {
                    System.out.println(fes1.nextLine());
                }
                Scanner fes11 = new Scanner(file1);
                int j = 0;
                while (fes11.hasNextLine()) {
                    str[j] = fes11.nextLine();
                    j++;
                }
                nes.nextLine();
                Scanner ves = new Scanner(file1);
                System.out.println("Which product you want to delete?");
                String sc = nes.nextLine();
                int mou = Integer.parseInt(sc);
                String[] str1 = new String[0];
                while(ves.hasNextLine()){
                    str1 =ves.nextLine().split(" ");
                }
                String[] mes1 = str1[0].split("\\.");
                int num = Integer.parseInt(mes1[0]);
                if(mou > num)
                    System.out.println("Product not found!!!");
                else{
                    String sc1 = sc + ".";
                    for (int i = 0; i < str.length; i++) {
                        String[] arr = str[i].split(" ");
                        if (arr[0].equals(sc1)) {
                            str[i] = " ";
                            break;
                        }
                    }
                    int x = 0;
                    for(String e:str){
                        if(e != null)
                            mes[x] = e;
                        x++;
                    }
                    for(int i = 0; i<19; i++){
                        if(mes[i].equals(" ")){
                            mes[i] = mes[i+1];
                            mes[i+1] = " ";
                        }
                    }
                    String[] mess = new String[0];
                    int count = 0;
                    for(String k:mes){
                        if(k != null)
                            count++;
                    }
                    for(int i = 0; i<=count; i++) {
                        if(mes[i] != null){
                            mess = mes[i].split(" ");
                            mess[0] = i+1 +".";
                            mes[i] = mess[0] + " " + mess[1] + " " + mess[2] + " " + mess[3];
                        }
                    }
                    FileWriter fileWriter = new FileWriter(file1);
                    BufferedWriter buff = new BufferedWriter(fileWriter);
                    for(String e:mes){
                        if(e !=null){
                            if(!e.equals(" ")){
                                buff.write(e);
                                buff.newLine();
                            }
                        }
                    }
                    buff.close();
                    fes1.close();
                    fes11.close();
                    ves.close();
                    System.out.println("Product deleted successfully!!!");
                }
            }
            else if(choice == 4){
                File file1 = new File("ram.txt");
                Scanner fes1 = new Scanner(file1);
                String[] str = new String[20];
                String[] mes = new String[20];
                while (fes1.hasNextLine()) {
                    System.out.println(fes1.nextLine());
                }
                Scanner fes11 = new Scanner(file1);
                int j = 0;
                while (fes11.hasNextLine()) {
                    str[j] = fes11.nextLine();
                    j++;
                }
                nes.nextLine();
                Scanner ves = new Scanner(file1);
                System.out.println("Which product you want to delete?");
                String sc = nes.nextLine();
                int mou = Integer.parseInt(sc);
                String[] str1 = new String[0];
                while(ves.hasNextLine()){
                    str1 =ves.nextLine().split(" ");
                }
                String[] mes1 = str1[0].split("\\.");
                int num = Integer.parseInt(mes1[0]);
                if(mou > num)
                    System.out.println("Product not found!!!");
                else{
                    String sc1 = sc + ".";
                    for (int i = 0; i < str.length; i++) {
                        String[] arr = str[i].split(" ");
                        if (arr[0].equals(sc1)) {
                            str[i] = " ";
                            break;
                        }
                    }
                    int x = 0;
                    for(String e:str){
                        if(e != null)
                            mes[x] = e;
                        x++;
                    }
                    for(int i = 0; i<19; i++){
                        if(mes[i].equals(" ")){
                            mes[i] = mes[i+1];
                            mes[i+1] = " ";
                        }
                    }
                    String[] mess = new String[0];
                    int count = 0;
                    for(String k:mes){
                        if(k != null)
                            count++;
                    }
                    for(int i = 0; i<=count; i++) {
                        if(mes[i] != null){
                            mess = mes[i].split(" ");
                            mess[0] = i+1 +".";
                            mes[i] = mess[0] + " " + mess[1] + " " + mess[2] + " " + mess[3];
                        }
                    }
                    FileWriter fileWriter = new FileWriter(file1);
                    BufferedWriter buff = new BufferedWriter(fileWriter);
                    for(String e:mes){
                        if(e !=null){
                            if(!e.equals(" ")){
                                buff.write(e);
                                buff.newLine();
                            }
                        }
                    }
                    buff.close();
                    fes1.close();
                    fes11.close();
                    ves.close();
                    System.out.println("Product deleted successfully!!!");
                }
            }
            else if(choice == 5){
                File file1 = new File("hard.txt");
                Scanner fes1 = new Scanner(file1);
                String[] str = new String[20];
                String[] mes = new String[20];
                while (fes1.hasNextLine()) {
                    System.out.println(fes1.nextLine());
                }
                Scanner fes11 = new Scanner(file1);
                int j = 0;
                while (fes11.hasNextLine()) {
                    str[j] = fes11.nextLine();
                    j++;
                }
                nes.nextLine();
                Scanner ves = new Scanner(file1);
                System.out.println("Which product you want to delete?");
                String sc = nes.nextLine();
                int mou = Integer.parseInt(sc);
                String[] str1 = new String[0];
                while(ves.hasNextLine()){
                    str1 =ves.nextLine().split(" ");
                }
                String[] mes1 = str1[0].split("\\.");
                int num = Integer.parseInt(mes1[0]);
                if(mou > num)
                    System.out.println("Product not found!!!");
                else{
                    String sc1 = sc + ".";
                    for (int i = 0; i < str.length; i++) {
                        String[] arr = str[i].split(" ");
                        if (arr[0].equals(sc1)) {
                            str[i] = " ";
                            break;
                        }
                    }
                    int x = 0;
                    for(String e:str){
                        if(e != null)
                            mes[x] = e;
                        x++;
                    }
                    for(int i = 0; i<19; i++){
                        if(mes[i].equals(" ")){
                            mes[i] = mes[i+1];
                            mes[i+1] = " ";
                        }
                    }
                    String[] mess = new String[0];
                    int count = 0;
                    for(String k:mes) {
                        if (k != null)
                            count++;
                    }
                    for(int i = 0; i<=count; i++) {
                        if(mes[i] != null){
                            mess = mes[i].split(" ");
                            mess[0] = i+1 +".";
                            mes[i] = mess[0] + " " + mess[1] + " " + mess[2] + " " + mess[3];
                        }
                    }
                    FileWriter fileWriter = new FileWriter(file1);
                    BufferedWriter buff = new BufferedWriter(fileWriter);
                    for(String e:mes){
                        if(e !=null){
                            if(!e.equals(" ")){
                                buff.write(e);
                                buff.newLine();
                            }
                        }
                    }
                    buff.close();
                    fes1.close();
                    fes11.close();
                    ves.close();
                    System.out.println("Product deleted successfully!!!");
                }
            }
            else if(choice == 6){
                File file1 = new File("charger.txt");
                Scanner fes1 = new Scanner(file1);
                String[] str = new String[20];
                String[] mes = new String[20];
                while (fes1.hasNextLine()) {
                    System.out.println(fes1.nextLine());
                }
                Scanner fes11 = new Scanner(file1);
                int j = 0;
                while (fes11.hasNextLine()) {
                    str[j] = fes11.nextLine();
                    j++;
                }
                nes.nextLine();
                Scanner ves = new Scanner(file1);
                System.out.println("Which product you want to delete?");
                String sc = nes.nextLine();
                int mou = Integer.parseInt(sc);
                String[] str1 = new String[0];
                while(ves.hasNextLine()){
                    str1 =ves.nextLine().split(" ");
                }
                String[] mes1 = str1[0].split("\\.");
                int num = Integer.parseInt(mes1[0]);
                if(mou > num)
                    System.out.println("Product not found!!!");
                else{
                    String sc1 = sc + ".";
                    for (int i = 0; i < str.length; i++) {
                        String[] arr = str[i].split(" ");
                        if (arr[0].equals(sc1)) {
                            str[i] = " ";
                            break;
                        }
                    }
                    int x = 0;
                    for(String e:str){
                        if(e != null)
                            mes[x] = e;
                        x++;
                    }
                    for(int i = 0; i<19; i++){
                        if(mes[i].equals(" ")){
                            mes[i] = mes[i+1];
                            mes[i+1] = " ";
                        }
                    }
                    String[] mess = new String[0];
                    int count = 0;
                    for(String k:mes){
                        if(k != null)
                            count++;
                    }
                    for(int i = 0; i<=count; i++) {
                        if(mes[i] != null){
                            mess = mes[i].split(" ");
                            mess[0] = i+1 +".";
                            mes[i] = mess[0] + " " + mess[1] + " " + mess[2] + " " + mess[3];
                        }
                    }
                    FileWriter fileWriter = new FileWriter(file1);
                    BufferedWriter buff = new BufferedWriter(fileWriter);
                    for(String e:mes){
                        if(e !=null){
                            if(!e.equals(" ")){
                                buff.write(e);
                                buff.newLine();
                            }
                        }
                    }
                    buff.close();
                    fes1.close();
                    fes11.close();
                    ves.close();
                    System.out.println("Product deleted successfully!!!");
                }
            }
            else if(choice == 7){
                File file1 = new File("battery.txt");
                Scanner fes1 = new Scanner(file1);
                String[] str = new String[20];
                String[] mes = new String[20];
                while (fes1.hasNextLine()) {
                    System.out.println(fes1.nextLine());
                }
                Scanner fes11 = new Scanner(file1);
                int j = 0;
                while (fes11.hasNextLine()) {
                    str[j] = fes11.nextLine();
                    j++;
                }
                nes.nextLine();
                Scanner ves = new Scanner(file1);
                System.out.println("Which product you want to delete?");
                String sc = nes.nextLine();
                int mou = Integer.parseInt(sc);
                String[] str1 = new String[0];
                while(ves.hasNextLine()){
                    str1 =ves.nextLine().split(" ");
                }
                String[] mes1 = str1[0].split("\\.");
                int num = Integer.parseInt(mes1[0]);
                if(mou > num)
                    System.out.println("Product not found!!!");
                else{
                    String sc1 = sc + ".";
                    for (int i = 0; i < str.length; i++) {
                        String[] arr = str[i].split(" ");
                        if (arr[0].equals(sc1)) {
                            str[i] = " ";
                            break;
                        }
                    }
                    int x = 0;
                    for(String e:str){
                        if(e != null)
                            mes[x] = e;
                        x++;
                    }
                    for(int i = 0; i<19; i++){
                        if(mes[i].equals(" ")){
                            mes[i] = mes[i+1];
                            mes[i+1] = " ";
                        }
                    }
                    String[] mess = new String[0];
                    int count = 0;
                    for(String k:mes){
                        if(k != null)
                            count++;
                    }
                    for(int i = 0; i<=count; i++) {
                        if(mes[i] != null){
                            mess = mes[i].split(" ");
                            mess[0] = i+1 +".";
                            mes[i] = mess[0] + " " + mess[1] + " " + mess[2] + " " + mess[3];
                        }
                    }
                    FileWriter fileWriter = new FileWriter(file1);
                    BufferedWriter buff = new BufferedWriter(fileWriter);
                    for(String e:mes){
                        if(e !=null){
                            if(!e.equals(" ")){
                                buff.write(e);
                                buff.newLine();
                            }
                        }
                    }
                    buff.close();
                    fes1.close();
                    fes11.close();
                    ves.close();
                    System.out.println("Product deleted successfully!!!");
                }
            }
            else if(choice == 8){
                File file1 = new File("speaker.txt");
                Scanner fes1 = new Scanner(file1);
                String[] str = new String[20];
                String[] mes = new String[20];
                while (fes1.hasNextLine()) {
                    System.out.println(fes1.nextLine());
                }
                Scanner fes11 = new Scanner(file1);
                int j = 0;
                while (fes11.hasNextLine()) {
                    str[j] = fes11.nextLine();
                    j++;
                }
                nes.nextLine();
                Scanner ves = new Scanner(file1);
                System.out.println("Which product you want to delete?");
                String sc = nes.nextLine();
                int mou = Integer.parseInt(sc);
                String[] str1 = new String[0];
                while(ves.hasNextLine()){
                    str1 =ves.nextLine().split(" ");
                }
                String[] mes1 = str1[0].split("\\.");
                int num = Integer.parseInt(mes1[0]);
                if(mou > num)
                    System.out.println("Product not found!!!");
                else{
                    String sc1 = sc + ".";
                    for (int i = 0; i < str.length; i++) {
                        String[] arr = str[i].split(" ");
                        if (arr[0].equals(sc1)) {
                            str[i] = " ";
                            break;
                        }
                    }
                    int x = 0;
                    for(String e:str){
                        if(e != null)
                            mes[x] = e;
                        x++;
                    }
                    for(int i = 0; i<19; i++){
                        if(mes[i].equals(" ")){
                            mes[i] = mes[i+1];
                            mes[i+1] = " ";
                        }
                    }
                    String[] mess = new String[0];
                    int count = 0;
                    for(String k:mes){
                        if(k != null)
                            count++;
                    }
                    for(int i = 0; i<=count; i++) {
                        if(mes[i] != null){
                            mess = mes[i].split(" ");
                            mess[0] = i+1 +".";
                            mes[i] = mess[0] + " " + mess[1] + " " + mess[2] + " " + mess[3];
                        }
                    }
                    FileWriter fileWriter = new FileWriter(file1);
                    BufferedWriter buff = new BufferedWriter(fileWriter);
                    for(String e:mes){
                        if(e !=null){
                            if(!e.equals(" ")){
                                buff.write(e);
                                buff.newLine();
                            }
                        }
                    }
                    buff.close();
                    fes1.close();
                    fes11.close();
                    ves.close();
                    System.out.println("Product deleted successfully!!!");
                }
            } else System.out.println("Invalid Input!!!");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}