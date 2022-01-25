module com.example.todolist {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.jinchengli.todolist to javafx.fxml;
    exports com.jinchengli.todolist;
}