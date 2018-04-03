package deutsch;

import javafx.geometry.Insets;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class Lektionen {   
	
	 public static void ueben(){
		Stage fenster1 = new Stage();
		
		fenster1.initModality(Modality.APPLICATION_MODAL);
		fenster1.setTitle("Übung");
		fenster1.setMinWidth(300);
		
		GridPane layout1 = new GridPane();
		layout1.setPadding(new Insets(10, 10, 10, 10));
		layout1.setVgap(8);
		layout1.setHgap(10);
		
		Button buttonc = new Button("Zurück zur Auswahl");
		GridPane.setConstraints(buttonc, 1, 50);
		buttonc.setOnAction(e -> fenster1.close());
		layout1.getChildren().add(buttonc);
		
		Scene scene = new Scene(layout1, 600, 500);
		
		fenster1.setScene(scene);
		fenster1.showAndWait(); 
	} 
	
	public static void vokab(){
		Stage fenster1 = new Stage();
		
		fenster1.initModality(Modality.APPLICATION_MODAL);
		fenster1.setTitle("Vokabeln");
		fenster1.setMinWidth(300);
		
		GridPane layout1 = new GridPane();
		layout1.setPadding(new Insets(10, 10, 10, 10));
		layout1.setVgap(8);
		layout1.setHgap(10);
		
		Label label1 = new Label("ja");
		GridPane.setConstraints(label1, 1, 1);
		Label label6 = new Label("ano");
		GridPane.setConstraints(label6, 3, 1);
		
		Label label2 = new Label("nein");
		GridPane.setConstraints(label2, 1, 3);
		Label label7 = new Label("nie");
		GridPane.setConstraints(label7, 3, 3);
		
		Label label3 = new Label("bitte");
		GridPane.setConstraints(label3, 1, 5);
		Label label8 = new Label("prosim");
		GridPane.setConstraints(label8, 3, 5);
		
		Label label4 = new Label("danke");
		GridPane.setConstraints(label4, 1, 7);
		Label label9 = new Label("dakujem");
		GridPane.setConstraints(label9, 3, 7);
		
		Label label5 = new Label("Achtung!");
		GridPane.setConstraints(label5, 1, 9);
		Label label10 = new Label("Pozor!");
		GridPane.setConstraints(label10, 3, 9);
		
		Button buttonc = new Button("Zurück zur Auswahl");
		GridPane.setConstraints(buttonc, 1, 30);
		buttonc.setOnAction(e -> fenster1.close());
		layout1.getChildren().addAll(buttonc, label1, label2, label3, label4, label5, label6, label7, label8, label9, label10);
		
		Scene scene = new Scene(layout1, 600, 500);
		
		fenster1.setScene(scene);
		fenster1.showAndWait(); 
	}
}
