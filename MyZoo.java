import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class MyZoo {
   public static void main(String[] args) throws Exception {
       int opt;
      
       // Creating a Scanner object for user input.
       Scanner sc = new Scanner(System.in);
       MyZoo zm = new MyZoo();
       while(true){
           
           
   // Menu
           
   System.out.println("Welcome to the Zoo Monitoring System");
   System.out.println("------ Menu ------");
   System.out.println("1. Monitor an animal");
   System.out.println("2. Monitor a habitat");
   System.out.println("3. Zookeeper Log"); //added feature
   System.out.println("4. Exit");
   System.out.println("Enter your choice ");
  
   // Based on user input, call the respective functions.
   // For invalid case, exit the program
   opt = sc.nextInt();
   switch(opt){
   case 1:
   zm.monAnimal();
   break;
   case 2:
   zm.monHabitat();
   break;
   case 3: //added enhancement
   zm.monZookeeperLog(); //added enhancement
   default:
   System.out.println("Invalid Input");
   sc.close();
   break;
   }
       }      
   }

   // habitat function.
   private void monHabitat() throws FileNotFoundException {
       int opt;
   int num = 0;
   System.out.println("------Habitat------");
  
   // Creating a file object to read from the file
   File file = new File("/Users/barbarakelly/Documents/habitats.txt");
  
   // Through scanner, I am reading the file and displaying the contents
   Scanner sc = new Scanner(file);
   while(sc.hasNext()){
       String str = sc.nextLine();
       System.out.println(str);
   }
  
   sc.close();
   }

   // animal function.
   private void monAnimal()throws FileNotFoundException {
       int opt ;
   int num = 0;
   System.out.println("------Animals------");
  
   // Creating a file object to read from the file
   File file = new File("/Users/barbarakelly/Documents/animals.txt");
  
   // Through scanner, I am reading the file and displaying the contents
   Scanner sc = new Scanner(file);
   while(sc.hasNext()){
       String str = sc.nextLine();
       System.out.println(str);
   }
  
   sc.close();
   }
      
     //ZooKeeperLog
     private void monZookeeperLog()throws FileNotFoundException{
     int opt;
     int num = 0;
     System.out.println("-----ZoopeKeeper Log-----");
     
   // Creating a file object to read from the file
   File file = new File("/Users/barbarakelly/Documents/zookeeper.txt");
  
   // Through scanner, I am reading the file and displaying the contents
   Scanner sc = new Scanner(file);
   while(sc.hasNext()){
       String str = sc.nextLine();
       System.out.println(str);
   }
  
   sc.close();  
      
      
      }
      
   }  
