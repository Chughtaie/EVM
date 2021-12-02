package evm;

import java.io.IOException;
import java.sql.SQLException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class Handler {
	
	Oracle db = new Oracle();
	
	@FXML
	private AnchorPane ap;
	
	@FXML
	private TextField vname;
	
	@FXML
	private TextField vcnic;
	


	
	@FXML
	public void reg_Voter(ActionEvent event) throws IOException, SQLException{
		
		Voter nvoter = new Voter(vname.getText().toString(),vcnic.getText().toString());
		
		try {
			db.addVoter(nvoter);
			System.out.println(nvoter.name + " with cnic "+ nvoter.cnic + " have registered successfully");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Voter not registered");
		}
	}
	
	
	
	
	
	
}
