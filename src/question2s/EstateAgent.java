
package question2s;

public abstract class EstateAgent implements iEstateAgent {
    private String agentName;
    private double propertyPrice;

    public EstateAgent(String agentName, double propertyPrice) {
        this.agentName = agentName;
        this.propertyPrice = propertyPrice;

}
    
    
    public String getAgentsName() {
        return agentName;
    }

  
    public double getPropertyPrice() {
        return propertyPrice;
    }

    
    public double getAgentCommission() {
        return 0.2 * propertyPrice; // 20% commission
    }
}





