
package question2s;


public abstract class EstateAgentSales extends EstateAgent {
    public EstateAgentSales(String agentName, double propertySaleAmount) {
        super(agentName, propertySaleAmount);
    }

    public void printPropertyReport() {
        System.out.println("Estate Agent Name: " + getAgentsName());
        System.out.println("Property Sale Price: $" + getPropertyPrice());
        System.out.println("Agent Commission: $" + getAgentCommission());
    }
}
