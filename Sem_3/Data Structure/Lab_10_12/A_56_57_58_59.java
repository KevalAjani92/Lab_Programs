import java.util.Scanner;

import Data_Structure_LL.LinkedListDemo;

public class A_56_57_58_59 {
    public static void main(String[] args) {
        // LinkedListDemo l1 = new LinkedListDemo();
        Scanner sc = new Scanner(System.in);

        LinkedListDemo l2=new LinkedListDemo();
        l2.insertAtFirst(5);
        l2.insertAtFirst(10);
        l2.insertAtFirst(15);
        l2.insertAtFirst(20);
        l2.insertAtFirst(25);
        
        l2.swapKthNode(4);
        // l2.swapTwoConsecutive();
        // int userChoice;
        // System.out.println("Enter => \n1 to insertNode at first\n" + //
        //         "2 to insertNode at last\n" + //
        //         "3 to insertNode in order\n" + //
        //         "4 to delete a Node\n" + //
        //         "5 to copy LinkedList\n" + //
        //         "6 to display LinkedList\n" + //
        //         "7 to Reverse a LinkedList\n "+ //
        //         "8 to Sort a LinkedList\n "+ //
        //         "9 to Check Equality\n"+//
        //         "10 to Exit");
        // while (true) {
        //     System.out.print("Choice : ");
        //     userChoice = sc.nextInt();
        //     switch (userChoice) {
        //         case 1:
        //             System.out.print("Enter Element To Insert : ");
        //             int n = sc.nextInt();
        //             l1.insertAtFirst(n);
        //             break;
        //         case 2:
        //             System.out.print("Enter Element To Insert : ");
        //             int m = sc.nextInt();
        //             l1.insertAtEnd(m);
        //             break;
        //         case 3:
        //             System.out.print("Enter Element To Insert : ");
        //             int x = sc.nextInt();
        //             l1.insertInOrdr(x);
        //             break;
        //         case 4:
        //             System.out.print("Enter Element To Delete : ");
        //             int delete = sc.nextInt();
        //             l1.deleteElement(delete);
        //             break;
        //         case 5:
        //             LinkedListDemo copy = l1.copyLinkedList();
        //             System.out.println("Copy Of LinkedList : ");
        //             copy.displayLinkedList();
        //             break;
        //         case 6:
        //             l1.displayLinkedList();
        //             break;
        //         case 7:
        //             l1.reverseLL();
        //             break;
        //         case 8:
        //             l1.sortLL();
        //             break;
        //         case 9:
        //             l1.checkEquality(l2);
        //             break;
        //         case 10:
        //             System.exit(0);    
        //         default:
        //             System.out.println("Enter Valid Input ");
        //             break;
        //     }
        // }
    }

}
