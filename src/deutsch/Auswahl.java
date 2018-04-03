package deutsch;

import java.io.IOException;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class Auswahl extends Fenster{
	
	public static void wahlen() {
		
	GridPane layout3 = new GridPane();
	layout3.setPadding(new Insets(10, 10, 10, 10));
	layout3.setVgap(8);
	layout3.setHgap(10);
	
	Button buttonz = new Button("Zurück");
	buttonz.setOnAction(e -> fenster.setScene(scene2));
	GridPane.setConstraints(buttonz, 0, 0);
	Button buttonl = new Button("Lernen");
	buttonl.setOnAction(e -> {
		try {
		//	if(button3.isPressed()) {
			Lektion1.lernen();	
			}
			//else if(button4.isPressed()) {
			//Lektion2.lernen();	
			//} 
		catch (IOException e1) {
			e1.printStackTrace();
		}
	} );
	GridPane.setConstraints(buttonl, 0, 1);
	Button buttonu = new Button("Üben");
	buttonu.setOnAction(e -> Lektionen.ueben());
	GridPane.setConstraints(buttonu, 0, 2);
	Button buttonv = new Button("Vokabeln");
	buttonv.setOnAction(e -> Lektionen.vokab());
	GridPane.setConstraints(buttonv, 0, 3);
	layout3.getChildren().addAll(buttonl, buttonu, buttonv, buttonz);
	Scene scene3 = new Scene(layout3, 400,300); 
	
	fenster.setScene(scene3);
	fenster.show(); 
	}
}
