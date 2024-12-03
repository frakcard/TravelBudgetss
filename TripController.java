package TravelBudget;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.LocalDate;

import static TravelBudget.Trip.budgets;

public class TripController {
    // in charge of the interaction with Trip scene
    @FXML
    TextField tfDestination = new TextField();
    @FXML
    TextField tfDays = new TextField();
    @FXML
    TextField tfBudget = new TextField();
    @FXML
    CheckBox cbMeal = new CheckBox();
    @FXML
    CheckBox cbTour = new CheckBox();
    @FXML
    CheckBox cbLuggage = new CheckBox();
    @FXML
    TextArea taExpensesList = new TextArea();
    @FXML
    Label lbTotalBudget = new Label();
    @FXML
    DatePicker dpDate = new DatePicker();


    public void btAddExpenses(javafx.event.ActionEvent actionEvent) {
        LocalDate date = dpDate.getValue();
        double budg = Double.parseDouble(tfBudget.getText());
        String dest = tfDestination.getText();
        double days = Double.parseDouble(tfDays.getText());

        // new TRIP object
        Trip t1 = new Trip(date, dest, days, budg);

        // diplay expense in area
        taExpensesList.setText(taExpensesList.getText() + t1.toString());

        t1.addToTotalExpenses();

        //updating total expenses LABEL
        lbTotalBudget.setText("Active Total Budget: $" + Trip.getBudget());
    }

    //second button
    public void btAddExtra(ActionEvent actionEvent) {
        double currentBudget = Double.parseDouble(tfBudget.getText());

        if (cbMeal.isSelected()) {
            currentBudget -= 30; // Subtract $30 for the meal plan
        }
        if (cbTour.isSelected()) {
            currentBudget -= 100; // Subtract $100 for the guided tour
        }
        if (cbLuggage.isSelected()) {
            currentBudget -= 80;  // Subtract $30 for extra luggage
        }

        tfBudget.setText(String.valueOf(currentBudget));
        lbTotalBudget.setText("Active Total Budget: $" + currentBudget);
    }
}