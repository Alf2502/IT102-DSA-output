package Output;

public class Data_Structure_Arrays {
    public static void main(String[] args) {
        // Declare and initialize an array
        int[] employeeIDs = {101, 102, 103, 104, 105};
        
        // Print array elements
        System.out.println("Array elements:");
        for (int emp_id : employeeIDs) {
            System.out.println(emp_id);
        }
        
        System.out.println();
        System.out.println("Accessing specific element:");
        // Access specific element
        System.out.println(employeeIDs[2]);
    }
}