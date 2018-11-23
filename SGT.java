/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sgt;
import java.util.Scanner;    
 
/**
 *
 * @author Adnan
 */
public class SGT {

    public static void main(String[] args) {                 
        Scanner scan = new Scanner(System.in);
        Tree sgt = new Tree(); 
        System.out.println("ScapeGoat Tree Test\n");          
        char ch;
        do    
        {
            System.out.println("\nScapeGoat Tree Operations\n");
            System.out.println("1. insert ");
            System.out.println("2. count nodes");
            System.out.println("3. search"); 
            System.out.println("4. check empty");
            System.out.println("5. make empty");
            System.out.println("6. delete");
 
            int choice = scan.nextInt();            
            switch (choice)
            {
            case 1 : 
                System.out.println("Enter integer element to insert");
                int b=scan.nextInt();
                long startTime1 = System.nanoTime();
                sgt.insert( b );                   
                long endTime1 = System.nanoTime();
                long totalTime1 = endTime1 - startTime1;
                System.out.println("total insertion time = "+totalTime1);
                
                break;                                                    
            case 2 : 
                System.out.println("Nodes = "+ sgt.size());
                break; 
            case 3 : 
                System.out.println("Enter integer element to search");
                int a=scan.nextInt();
                long startTime = System.nanoTime();
                System.out.println("Search result : "+ sgt.search(a));
                long endTime = System.nanoTime();
                long totalTime = endTime - startTime;
                System.out.println("total search time = "+totalTime);
                break;                           
            case 4 :  
                System.out.println("Empty status = "+ sgt.isEmpty());
                break;
            case 5 :  
                System.out.println("\nTree cleared\n");
                sgt.Emptythetree();
                break;             
            case 6 :
                System.out.println("Enter integer element to delete");
                long startTime2 = System.nanoTime();
                int c=scan.nextInt();
                long endTime2 = System.nanoTime();
                long totalTime2 = endTime2 - startTime2;
                System.out.println("total deletion time = "+totalTime2);
                sgt.deletenode(c);
                break;
            default : 
                System.out.println("Wrong Entry \n ");
                break;           
            }
            System.out.print("\nPost order : ");
            sgt.postorder();
            System.out.print("\nPre order : ");
            sgt.preorder();
            System.out.print("\nIn order : ");
            sgt.inorder();
 
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);                        
        } while (ch == 'Y'|| ch == 'y');               
    }
    
}
