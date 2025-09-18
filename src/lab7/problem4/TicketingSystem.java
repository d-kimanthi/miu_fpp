package lab7.problem4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

class TicketingSystem {
    private Queue<Ticket> ticketQueue;

    // Default constructor
    public TicketingSystem() {
        this.ticketQueue = new LinkedList<>();
    }

   //Adds a new ticket to the queue with a random ID and the given description
    public void addTicket(String description) {
        int ticketId = getRandomTicketId();
        Ticket newTicket = new Ticket(ticketId, description);
        ticketQueue.offer(newTicket);
        System.out.println("Added: " + newTicket);
    }

    // Remove and return the ticket at the front of the queue
    public Ticket processTicket() {
        if (ticketQueue.isEmpty()) {
            System.out.println("No tickets to process - queue is empty");
            return null;
        }

        Ticket processedTicket = ticketQueue.poll();
        System.out.println("Processed: " + processedTicket);
        return processedTicket;
    }


    // View the ticket at the front of the queue without removing it
    public void viewNextTicket() {
        if (ticketQueue.isEmpty()) {
            System.out.println("No tickets in queue");
            return;
        }

        System.out.println("Next ticket: " + ticketQueue.peek());
    }


    //Get number of tickets in the queue
    public int getQueueSize() {
        return ticketQueue.size();
    }

    public boolean isEmpty() {
        return ticketQueue.isEmpty();
    }



    //Displays all tickets currently in the queue
    public void displayTickets() {
        if (ticketQueue.isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Current queue (" + ticketQueue.size() + " tickets):");
        int position = 1;
        for (Ticket ticket : ticketQueue) {
            System.out.println("  " + position + ". " + ticket);
            position++;
        }
    }

    private int getRandomTicketId() {
        int min = 1;
        int max = 500;
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}
