module com.example.factorial {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.factorial to javafx.fxml;
    exports com.example.factorial;
}