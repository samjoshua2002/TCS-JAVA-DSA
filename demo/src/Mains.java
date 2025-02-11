import java.util.*;

class TicketBooker {
    // Variables for available seats
    static int availableLowerBerths = 1;  // normally 21
    static int availableMiddleBerths = 1; // normally 21
    static int availableUpperBerths = 1;  // normally 21
    static int availableRacTickets = 1;   // normally 18
    static int availableWaitingList = 1;  // normally 10

    // Data structures for tracking passengers
    static Queue<Integer> waitingList = new LinkedList<>();  // queue of WL passengers
    static Queue<Integer> racList = new LinkedList<>();      // queue of RAC passengers
    static List<Integer> bookedTicketList = new ArrayList<>(); // list of booked tickets

    // Available positions in berths, RAC, and WL
    static List<Integer> lowerBerthsPositions = new ArrayList<>(List.of(1));  // normally 1 to 21
    static List<Integer> middleBerthsPositions = new ArrayList<>(List.of(1)); // normally 1 to 21
    static List<Integer> upperBerthsPositions = new ArrayList<>(List.of(1));  // normally 1 to 21
    static List<Integer> racPositions = new ArrayList<>(List.of(1));          // normally 1 to 18
    static List<Integer> waitingListPositions = new ArrayList<>(List.of(1));  // normally 1 to 10

    static Map<Integer, Passenger> passengers = new HashMap<>(); // map of passenger IDs to passengers

    // Function to book ticket
    public void bookTicket(Passenger p, int berthInfo, String allottedBerth) {
        p.number = berthInfo; // Assign seat number
        p.allotted = allottedBerth; // Assign berth type (L, M, U)
        passengers.put(p.passengerId, p); // Store passenger in the map
        bookedTicketList.add(p.passengerId); // Add to booked tickets list
        System.out.println("--------------------------Booked Successfully");
    }

    // Function to add passenger to RAC
    public void addToRAC(Passenger p, int racInfo, String allottedRAC) {
        p.number = racInfo;
        p.allotted = allottedRAC;
        passengers.put(p.passengerId, p); // Store passenger
        racList.add(p.passengerId); // Add to RAC queue
        availableRacTickets--; // Decrease RAC availability
        racPositions.removeFirst(); // Remove the assigned RAC position
        System.out.println("--------------------------Added to RAC Successfully");
    }

    // Function to add passenger to Waiting List
    public void addToWaitingList(Passenger p, int waitingListInfo, String allottedWL) {
        p.number = waitingListInfo;
        p.allotted = allottedWL;
        passengers.put(p.passengerId, p); // Store passenger
        waitingList.add(p.passengerId); // Add to Waiting List queue
        availableWaitingList--; // Decrease WL availability
        waitingListPositions.removeFirst(); // Remove the assigned WL position
        System.out.println("--------------------------Added to Waiting List Successfully");
    }

    // Function to cancel ticket
    public void cancelTicket(int passengerId) {
        Passenger p = passengers.get(passengerId);
        if (p == null) {
            System.out.println("Passenger not found.");
            return;
        }

        passengers.remove(passengerId); // Remove the passenger from the map
        bookedTicketList.remove(Integer.valueOf(passengerId)); // Remove from booked list
        int positionBooked = p.number;

        // Restore the position to the available list based on berth type
        switch (p.allotted) {
            case "L" -> {
                availableLowerBerths++;
                lowerBerthsPositions.add(positionBooked);
            }
            case "M" -> {
                availableMiddleBerths++;
                middleBerthsPositions.add(positionBooked);
            }
            case "U" -> {
                availableUpperBerths++;
                upperBerthsPositions.add(positionBooked);
            }
            default -> {
            }
        }

        System.out.println("---------------Cancelled Successfully");

        // Handle RAC and WL shifting
        if (!racList.isEmpty()) {
            Passenger passengerFromRAC = passengers.get(racList.poll());
            int positionRac = passengerFromRAC.number;
            racPositions.add(positionRac);
            racList.remove(passengerFromRAC.passengerId);
            availableRacTickets++;

            if (!waitingList.isEmpty()) {
                Passenger passengerFromWaitingList = passengers.get(waitingList.poll());
                int positionWL = passengerFromWaitingList.number;
                waitingListPositions.add(positionWL);
                waitingList.remove(passengerFromWaitingList.passengerId);

                passengerFromWaitingList.number = racPositions.getFirst();
                passengerFromWaitingList.allotted = "RAC";
                racPositions.removeFirst();
                racList.add(passengerFromWaitingList.passengerId);

                availableWaitingList++;
                availableRacTickets--;
            }

            // Book the cancelled berth to RAC passenger
            Mains.bookTicket(passengerFromRAC);
        }
    }

    // Function to print available seats
    public void printAvailable() {
        System.out.println("Available Lower Berths: " + availableLowerBerths);
        System.out.println("Available Middle Berths: " + availableMiddleBerths);
        System.out.println("Available Upper Berths: " + availableUpperBerths);
        System.out.println("Available RAC Tickets: " + availableRacTickets);
        System.out.println("Available Waiting List: " + availableWaitingList);
        System.out.println("--------------------------");
    }

    // Function to print all booked passengers
    public void printPassengers() {
        if (passengers.isEmpty()) {
            System.out.println("No details of passengers");
            return;
        }
        for (Passenger p : passengers.values()) {
            System.out.println("PASSENGER ID: " + p.passengerId);
            System.out.println("Name: " + p.name);
            System.out.println("Age: " + p.age);
            System.out.println("Status: " + p.number + " " + p.allotted);
            System.out.println("--------------------------");
        }
    }
}

// Passenger class with static ID generation
class Passenger {
    static int id = 1; // Static ID for each new passenger
    String name;
    int age;
    String berthPreference; // L, M, U
    int passengerId; // Automatically generated ID
    String allotted; // Allotted type (L, U, M, RAC, WL)
    int number; // Seat number

    public Passenger(String name, int age, String berthPreference) {
        this.name = name;
        this.age = age;
        this.berthPreference = berthPreference;
        this.passengerId = id++;
        this.allotted = "";
        this.number = -1;
    }
}

// Main class
public class Mains {
    public static void bookTicket(Passenger p) {
        TicketBooker booker = new TicketBooker();
        if (TicketBooker.availableWaitingList == 0) {
            System.out.println("No Tickets Available");
            return;
        }

        if ((p.berthPreference.equals("L") && TicketBooker.availableLowerBerths > 0) ||
            (p.berthPreference.equals("M") && TicketBooker.availableMiddleBerths > 0) ||
            (p.berthPreference.equals("U") && TicketBooker.availableUpperBerths > 0)) {

            System.out.println("Preferred Berth Available");
            switch (p.berthPreference) {
                case "L" -> {
                    System.out.println("Lower Berth Given");
                    booker.bookTicket(p, TicketBooker.lowerBerthsPositions.getFirst(), "L");
                    TicketBooker.lowerBerthsPositions.removeFirst();
                    TicketBooker.availableLowerBerths--;
                }
                case "M" -> {
                    System.out.println("Middle Berth Given");
                    booker.bookTicket(p, TicketBooker.middleBerthsPositions.getFirst(), "M");
                    TicketBooker.middleBerthsPositions.removeFirst();
                    TicketBooker.availableMiddleBerths--;
                }
                case "U" -> {
                    System.out.println("Upper Berth Given");
                    booker.bookTicket(p, TicketBooker.upperBerthsPositions.getFirst(), "U");
                    TicketBooker.upperBerthsPositions.removeFirst();
                    TicketBooker.availableUpperBerths--;
                }
                default -> {
                }
            }
        } else if (TicketBooker.availableLowerBerths > 0) {
            System.out.println("Lower Berth Given");
            booker.bookTicket(p, TicketBooker.lowerBerthsPositions.getFirst(), "L");
            TicketBooker.lowerBerthsPositions.removeFirst();
            TicketBooker.availableLowerBerths--;
        } else if (TicketBooker.availableMiddleBerths > 0) {
            System.out.println("Middle Berth Given");
            booker.bookTicket(p, TicketBooker.middleBerthsPositions.getFirst(), "M");
            TicketBooker.middleBerthsPositions.removeFirst();
            TicketBooker.availableMiddleBerths--;
        } else if (TicketBooker.availableUpperBerths > 0) {
            System.out.println("Upper Berth Given");
            booker.bookTicket(p, TicketBooker.upperBerthsPositions.getFirst(), "U");
            TicketBooker.upperBerthsPositions.removeFirst();
            TicketBooker.availableUpperBerths--;
        } else if (TicketBooker.availableRacTickets > 0) {
            System.out.println("RAC Available");
            booker.addToRAC(p, TicketBooker.racPositions.getFirst(), "RAC");
        } else if (TicketBooker.availableWaitingList > 0) {
            System.out.println("Added to Waiting List");
            booker.addToWaitingList(p, TicketBooker.waitingListPositions.getFirst(), "WL");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TicketBooker booker = new TicketBooker();

        while (true) {
            System.out.println("1. Book Ticket\n2. Cancel Ticket\n3. Available Tickets\n4. Booked Tickets\n5. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("Enter Passenger Name, Age, and Berth Preference (L, M, U): ");
                    String name = sc.next();
                    int age = sc.nextInt();
                    String berthPreference = sc.next();
                    Passenger p = new Passenger(name, age, berthPreference);
                    bookTicket(p);
                }
                case 2 -> {
                    System.out.println("Enter Passenger Id to cancel: ");
                    int id = sc.nextInt();
                    booker.cancelTicket(id);
                }
                case 3 -> booker.printAvailable();
                case 4 -> booker.printPassengers();
                case 5 -> {
                    sc.close();
                    System.exit(0);
                }
            }
        }
    }
}
