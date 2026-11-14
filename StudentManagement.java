
package studentmanagement;

import java.util.Scanner;

public class StudentManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] ids = new int[100];
        String[] names = new String[100];
        String[] departments = new String[100];

        int count = 0;
        int choice;

        while (true) {

            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1) {

                System.out.print("Enter Student ID: ");
                ids[count] = sc.nextInt();

                sc.nextLine();

                System.out.print("Enter Student Name: ");
                names[count] = sc.nextLine();

                System.out.print("Enter Department: ");
                departments[count] = sc.nextLine();

                count++;

                System.out.println("Student Added Successfully!");

            }

            else if (choice == 2) {

                System.out.println("\n===== STUDENT DETAILS =====");

                for (int i = 0; i < count; i++) {

                    System.out.println("ID: " + ids[i]);
                    System.out.println("Name: " + names[i]);
                    System.out.println("Department: " + departments[i]);
                    System.out.println("--------------------");

                }

            }
            

else if (choice == 4) {

    System.out.print("Enter Student ID to delete: ");
    int deleteId = sc.nextInt();

    boolean found = false;

    for (int i = 0; i < count; i++) {

        if (ids[i] == deleteId) {

            for (int j = i; j < count - 1; j++) {

                ids[j] = ids[j + 1];
                names[j] = names[j + 1];
                departments[j] = departments[j + 1];

            }

            count--;
            found = true;

            System.out.println("Student Deleted Successfully!");
            break;
        }
    }

    if (found == false) {
        System.out.println("Student Not Found!");
    }
}


            else if (choice == 5) {

                System.out.println("Thank you!");
                break;

            }
            

else if (choice == 3) {

    System.out.print("Enter Student ID to search: ");
    int searchId = sc.nextInt();

    boolean found = false;

    for (int i = 0; i < count; i++) {

        if (ids[i] == searchId) {

            System.out.println("Student Found!");
            System.out.println("ID: " + ids[i]);
            System.out.println("Name: " + names[i]);
            System.out.println("Department: " + departments[i]);

            found = true;
            break;
        }
    }

    if (found == false) {
        System.out.println("Student Not Found!");
    }
}


            else {

                System.out.println("Feature not implemented yet!");

            }
        }

        sc.close();
    }
}

	


