package TravelBudget;

import java.time.LocalDate;

public class Trip {
    public String toString;
    private LocalDate date;
    private String destinations;
    private double durationdayss;
    static double budgets;
    private static double totalexpenses = 0;
    private boolean mealplan;
    private boolean tourguide;
    private boolean extraluggage;
    private double value;

    public Trip(LocalDate date, String destination, double days, double budget) {
        this.date = date;
        this.destinations = destination;
        this.durationdayss = days;
        this.budgets = budget;
        this.totalexpenses = 0;
    }

    public static double addMeal() {
        return budgets -= 30;
    }

    public static double addTour() {
        return budgets += 10;
    }

    public static double addLuggage() {
        return budgets += 80;
    }


    @Override
    public String toString() {
        return date + "\t" + destinations + "\t" + durationdayss + "\t" + budgets + "\n";
    }

    public LocalDate getDate(){
        return date;
    }

    public String getDestination() {
        return destinations;
    }

    public double getDurationdays() {
        return durationdayss;
    }

    public static double getBudget() {
        return budgets;
    }

    public static double getTotalExpenses() {
        return totalexpenses;
    }

    public double addToTotalExpenses() {
        return totalexpenses + this.value;
    }
}
