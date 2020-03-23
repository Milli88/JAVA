

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


ListView<String> listView;
public static void main (String args[] ){

            launch(args);


            }




    @Override
    public void start (Stage primaryStage)throws Exception{
		
	TreeItem <String> root,food,drinks;
	
	//setting up root
	
	root = new TreeItem<>();
	root.setExpanded(true);
	
	//setting up food branch
	
	food = setBranch("food",root);
	setBranch("Burger",food);
	setBranch("Pizza",food);
	setBranch("Bacon",food);



	////Vertical box
	
    VBox vBox = new VBox(10);
    vBox.setPadding(new Insets(20,20,20,20));
	vBox.getChildren().addAll();
	
	Scene scene = new Scene(vBox,200,200);
	primaryStage.setScene(scene);
	
	primaryStage.show()


    }
	
	
	public TreeItem<String> setBranch(String title,TreeItem<String> parent){
	
	TreeItem <String> item= new TreeItem<>(title);
	item.setExpanded(true);
	parent.getChildren().add(item);
	}