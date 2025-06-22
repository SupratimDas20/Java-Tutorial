package org.notes;

public class EnhancedSwitchCase {
    public static void main(String[] args){
        String day = "MONDAY";

        switch (day) {
            case "MONDAY", "TUESDAY", "WEDNESDAY" -> System.out.println("Weekday");
            case "SATURDAY", "SUNDAY" -> System.out.println("Weekend");
            default -> System.out.println("Invalid day");
        }
    }
}
