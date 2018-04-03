package deutsch;

import javafx.geometry.Insets;
import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class Fenster extends Application {

	Scene scene1;
	public static Scene scene2;
	Scene scene3;
	public static Stage fenster;
	public static Button button3, button4;
	
	public static void main(String[] args) {
		launch(args);

	}

	public void start(Stage Willkommen) throws Exception { 
		fenster = Willkommen;
		fenster.setTitle("Ich lerne Deutsch");
		
		GridPane layout1 = new GridPane();
		layout1.setPadding(new Insets(10, 10, 10, 10));
		layout1.setVgap(8);
		layout1.setHgap(10);
		Label label1 = new Label("Willkommen zum Deutsch lernen!");
		GridPane.setConstraints(label1, 0, 0);
		Label name = new Label("Benutzername:");
		GridPane.setConstraints(name, 0, 1);
		TextField bname = new TextField();
		bname.setPromptText("Benutzername");
		GridPane.setConstraints(bname, 1, 1);
		String bename = bname.getText();
		Label passwort = new Label("Passwort:");
		GridPane.setConstraints(passwort, 0, 2);
		TextField bpasswort = new TextField();
		bpasswort.setPromptText("Passwort");
		GridPane.setConstraints(bpasswort, 1, 2);
		String bepasswort = bpasswort.getText();
		Button button1 = new Button("Anmelden");
		GridPane.setConstraints(button1, 1, 3);
		button1.setOnAction(e -> {
		//	if(bename.isEmpty() || bepasswort.isEmpty()) {
		//		Label label2 = new Label("Fehler! Geben Sie ihre Daten erneut ein."); 
		//		GridPane.setConstraints(label2, 0, 5);
		//		layout1.getChildren().add(label2);
		//		bname.clear();
		//		bpasswort.clear();
		//	}
		//	else {
			fenster.setScene(scene2); 
			bname.clear();
			bpasswort.clear();
		//	}
		});
		layout1.getChildren().addAll(label1, button1, name, bname, passwort, bpasswort);
		scene1 = new Scene(layout1, 400, 300);
		
		GridPane layout2 = new GridPane();
		layout2.setPadding(new Insets(10, 10, 10, 10));
		layout2.setVgap(8);
		layout2.setHgap(10);
		Button button2 = new Button("Zurück");
		button2.setOnAction(e -> fenster.setScene(scene1));
		GridPane.setConstraints(button2, 0, 0);
		button3 = new Button("Lektion 1");
		button3.setOnAction(e -> Auswahl.wahlen());
		GridPane.setConstraints(button3, 0, 2);
		button4 = new Button("Lektion 2");
		button4.setOnAction(e -> Auswahl.wahlen());
		GridPane.setConstraints(button4, 0, 3);
		Button button5 = new Button("Lektion 3");
		button5.setOnAction(e -> Auswahl.wahlen());
		GridPane.setConstraints(button5, 0, 4);
		Button button6 = new Button("Lektion 4");
		button6.setOnAction(e -> Auswahl.wahlen());
		GridPane.setConstraints(button6, 1, 2);
		Button button7 = new Button("Lektion 5");
		button7.setOnAction(e -> Auswahl.wahlen());
		GridPane.setConstraints(button7, 1, 3);
		Button button8 = new Button("Lektion 6");
		button8.setOnAction(e -> Auswahl.wahlen());
		GridPane.setConstraints(button8, 1, 4);
		layout2.getChildren().addAll(button2, button3, button4, button5, button6, button7, button8);
		scene2 = new Scene(layout2, 400,300); 
		
		fenster.setScene(scene1);
		fenster.show();
	}
}
