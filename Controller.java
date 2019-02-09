package application;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller implements Initializable {
	@FXML
	private Button btn;
	@FXML
	private TextField textField;
	@FXML
	private TextField textField2;
	@FXML
	private TextField textField3;
	@FXML
	private Text textres;
	@FXML
	private Text text;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	public void ShowSmth(ActionEvent event) {
		String val = textField.getText();
		double a = Integer.valueOf(val);
		
		
		String val2 = textField2.getText();
		double b = Integer.valueOf(val2);
		String val3 = textField3.getText();
		double c = Integer.valueOf(val3);
		double k;
		double m;
		k=(-b+Math.pow(b*b-4*a*c, 0.5))/(2*a);
		
		m=(-b-Math.pow(b*b-4*a*c, 0.5))/(2*a);
		text.setText(String.valueOf(m));
		
		textres.setText(String.valueOf(k));
		
	}

}
