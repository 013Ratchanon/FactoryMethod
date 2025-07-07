import java.io.*;
import th.ac.npru.se.rn.*;

public class GenerateBill {

    public static void main(String args[]) throws IOException {
        GetPlanFactory planFactory = new GetPlanFactory();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the name of plan for which the bill will be generated: ");
        String planName = br.readLine();

        System.out.print("Enter the number of units for which the bill will be calculated: ");
        int units = Integer.parseInt(br.readLine());

        Plan p = planFactory.getPlan(planName);

        // .....
        if (p != null) {
            p.getRate();
            System.out.print("Bill amount for " + planName + " of " + units + " units is: ");
            p.calculateBill(units);
        } else {
            System.out.println("Invalid plan name entered. Please try again.");
        }
    }

} // end of GenerateBill class
