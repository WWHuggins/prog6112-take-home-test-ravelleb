
package Question1;


public class Question1 {

    public static void main(String[] args) {
      int[][] cameraCost = {
                {10500, 8500},  
                {9500, 7200},   
                {12000, 8000}   
        };

        // Camera manufacturers 
        String[] manufacturers = {"Canon", "Sony", "Nikon"};

        // Display header 
        System.out.println("-----------------------------");
        System.out.printf("%-15s%-10s%-10s%n", "Manufacturer", "DSLR", "Mirrorless");
        System.out.println("-----------------------------");
        // Display camera costs 
        for (int i = 0; i < cameraCost.length; i++) {
            int dslrCost = cameraCost[i][0];
            int mirrorlessCost = cameraCost[i][1];

            // Display 
            System.out.printf("%-15s%-10d%-10d%n", manufacturers[i], dslrCost, mirrorlessCost);
            
        }

        // Display header 
        System.out.println("-----------------------------");
        System.out.printf("%n%-15s%-10s%n", "Manufacturer", "Difference");
        System.out.println("-----------------------------");
        // Display differences
        for (int i = 0; i < cameraCost.length; i++) {
            int dslrCost = cameraCost[i][0];
            int mirrorlessCost = cameraCost[i][1];
            int difference = mirrorlessCost - dslrCost;

            // Display row for the difference table
            System.out.printf("%-15s%-10d%n", manufacturers[i], difference);
            
        }
    }
}

    
    

