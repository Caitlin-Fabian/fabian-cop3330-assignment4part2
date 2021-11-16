package ucf.assignements;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.CheckBoxListCell;
import javafx.stage.Window;

import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle rb){
    }

    @FXML
    Button addButton;

    @FXML
    TextArea descriptionText;

    @FXML
    TextField date;
    
    @FXML
    TextField title;

    @FXML
    ListView<Item> list;

    @FXML
    MenuItem deleteButton;

    @FXML
    MenuItem deleteAll;

    @FXML
    MenuItem save;

    ObservableList<Item> ToDoList = FXCollections.observableArrayList();

    @FXML
    CheckBox checkBox;

    @FXML
    Button loader;

    @FXML
    public void addItem(Event e){
        ToDoList.add(new Item(title.getText(), date.getText(), descriptionText.getText()));
        list.setItems(ToDoList);

        refresh();
    }


    @FXML
    private void deleteItem(Event e){

        int selected = list.getSelectionModel().getSelectedIndex();
        ToDoList.remove(selected);
    }

    @FXML
    private void setDeleteAll(Event e){
        ToDoList.removeAll();
    }

    private void refresh(){
        date.setText("YYYY-MM-DD");
        descriptionText.setText(null);
    }

    @FXML
    public void saveListButton(Event e) throws IOException {
        Save(list, "AllofList");
    }


    public void Save(ListView listView,String fileName) throws IOException {

        Writer writer = null;
        try {
            File file = new File("ucf/assignments/"+fileName+".csv.");
            writer = new BufferedWriter(new FileWriter(file));
            while(listView.getItems()!= null) {

                String text = listView.getItems() + "\n";

                writer.write(text);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        if (writer != null) {
            writer.flush();
            writer.close();
        }
    }


    @FXML
    public void Load(){
//        list.getItems().clear(); //Clear items
//        File file =  //File object to hold
//        toDoList = fileParser.loadToDoList(file); //Loading the list
//        list.set(ToDoList); //Setting the table
//        list.loadTable(toDoList);
    }


}