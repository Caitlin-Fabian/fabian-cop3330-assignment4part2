package ucf.assignements;

import javafx.scene.control.CheckBox;

public class Item {

    private String description;
    private String dueDate;
    private String title;
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return dueDate;
    }

    public void setDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Item( String title, String dueDate, String description){
        this.setTitle(title);
        this.setDate(dueDate);
        this.setDescription(description);
    }




    @Override
    public String toString(){
        return  this.getTitle() +" "+ this.getDate()+ " "+ this.getDescription();
    }
}
