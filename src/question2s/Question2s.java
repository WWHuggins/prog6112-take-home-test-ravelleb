
package question2s;

public class Question2s {

    
    public static void main(String[] args) {
                EstateAgentSales estateAgentSales = new EstateAgentSales("Bob Been", 250000.0) {
                    @Override
                    public String getAgentName() {
                        throw new UnsupportedOperationException("Jan"); 
                    }
                };

        
        estateAgentSales.printPropertyReport();

    }
    
}
