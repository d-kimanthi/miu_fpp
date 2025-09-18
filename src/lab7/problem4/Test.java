package lab7.problem4;

public class Test {
    public static void main(String[] args) {
        System.out.println("=== Customer Service Ticketing System Demo ===\n");

        // Create a new ticketing system
        TicketingSystem system = new TicketingSystem();

        // Test 1: Add several tickets
        system.addTicket("Password reset request");
        system.addTicket("Unable to login to account");
        system.addTicket("Billing inquiry about last month's charge");
        system.addTicket("Feature request for mobile app");
        system.addTicket("Bug report: page not loading");

        System.out.println("\nQueue size: " + system.getQueueSize());

        // Test 2: View the queue
        System.out.println("\n2. Current queue status:");
        system.displayTickets();

        // Test 3: View next ticket without processing
        System.out.println("\n3. Viewing next ticket:");
        system.viewNextTicket();

        // Test 4: Process some tickets
        System.out.println("\n4. Processing tickets:");
        system.processTicket();
        system.processTicket();

        System.out.println("\nQueue size after processing 2 tickets: " + system.getQueueSize());

        // Test 5: View updated queue
        System.out.println("\n5. Updated queue after processing 2 tickets:");
        system.displayTickets();

        // Test 6: Add more tickets
        System.out.println("\n6. Adding more tickets:");
        system.addTicket("Refund request");
        system.addTicket("Technical support needed");

        // Test 7: View next ticket
        System.out.println("\n7. Next ticket to be processed:");
        system.viewNextTicket();

        // Test 8: Process all remaining tickets
        System.out.println("\n8. Processing all remaining tickets:");
        while (!system.isEmpty()) {
            system.processTicket();
        }

        // Test 9: Try to process when queue is empty
        System.out.println("\n9. Attempting to process when queue is empty:");
        system.processTicket();

        // Test 10: Try to view when queue is empty
        System.out.println("\n10. Attempting to view when queue is empty:");
        system.viewNextTicket();

    }
}