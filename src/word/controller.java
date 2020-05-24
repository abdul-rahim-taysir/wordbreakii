package word;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.Stack;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class controller implements Initializable {

    @FXML
    private TextField a;

    @FXML
    private TextArea c;

    @FXML
    private TextArea b;
    @FXML
    private Button but;


	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	
		
	}

	

    @FXML
    void problem(ActionEvent event) {
    
//    	c.setText("");
//    	String s = a.getText().trim();
//    	String[] ss = b.getText().split(",");
    
   
        
   	 String aa[] = new String[] {"this", "th", "is", "famous",
				"Word", "break", "b", "r", "e", "a", "k",
				"br", "bre", "brea", "ak", "problem"}; 
   	 
		List<String> dict = Arrays.asList(aa);


		a1 a = new a1();
		
	    Set<String> h = new HashSet<String>(); 
		h.addAll(Arrays.asList(aa));
	
		
		List<String> res = a.wordBreak("Wordbreakproblem", h);
		
		//Print output to Interface

		for (String str : res) {
        c.appendText(str+"\n");
   
	 
	 
      } 
		
    }
    
    
    

}
