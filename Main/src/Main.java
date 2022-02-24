import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.io.*;
import java.util.Scanner;
/*
  @author Harjit Singh
   This class Main where all the magic happens like display functions to exchange
   the money to different currency
 */
public class Main extends Application {
    private ScrollPane scrollPane = new ScrollPane();
    private Manager manager = new Manager();


    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("CurrencyExchange");
        scrollPane.setContent(allButtons());
        Scene scene1 = new Scene(scrollPane, 500, 500);
        stage.setScene(scene1);
        stage.show();
    }
    public static void main(String[] args) {
        Application.launch(args);
    }


    /*
    this method create a combobox which has list of the countries
    method read the information from a file allC.
     */
    public ComboBox allC() throws IOException {
        ComboBox ne = new ComboBox<>();
        try {
            File myObj = new File("allC");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                ne.getItems().add(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

     return ne;
    }
    /*
     this method has the all the display part and carry it on to a gridpane

     */
    public GridPane allButtons() throws IOException {
        GridPane pane = new GridPane();
        Button one = new Button(" OK ");
        Text textOne = new Text("Select the Currency");
        Text amount = new Text("Enter the amount");
        TextField textField = new TextField();
        TextField textField2 = new TextField();
        ComboBox com1 = allC();
        ComboBox com2 = allC();
        pane.add(textOne, 10, 30);
        pane.add(amount, 8, 30);
        pane.add(one, 9, 30);
        pane.add(com1,10,40);
        pane.add(com2,10,80);
        pane.add(textField,8,40);
        pane.add(textField2,8,80);
        pane.setVgap(1);
        pane.setHgap(1);
        one.setTranslateX(150);
        one.setTranslateY(130);
        one.setOnAction(mouseEvent -> {
            action(textField,textField2,com1,com2);
        });
        return pane;
    }
    /*
    this is helper method that take care of the action when user enter a amount and select the country to do
    exchange.
     */
    public void action(TextField t1, TextField t2, ComboBox c1 , ComboBox c2){
          double a = Integer.parseInt(t1.getText());
          String country1 = String.valueOf(c1.getValue());
          String country2 = String.valueOf(c2.getValue());
          double answer = manager.getChange(a,country1,country2);
          t2.setText(String.valueOf(answer));
    }
}
