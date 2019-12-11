import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MainJavaFX extends Application
{
    public static void main(String[] args)
    {
        Application.launch(args);
    }



    @Override
    public void start(Stage stage) throws Exception
    {

        Label label = new Label("Enter your name: ");
        TextField textField = new TextField();
        Button button = new Button("OK");

        VBox vBox = new VBox(8);

        vBox.getChildren().addAll(label, textField, button);

        Scene scene = new Scene(vBox);

        stage.setScene(scene);
        stage.setTitle("MainJavaFX");
        stage.setWidth(600);
        stage.setHeight(600);

        stage.show();

        Stage stage1 = new Stage();
        stage1.setWidth(600);
        stage1.setHeight(600);
        stage1.setX(200);
        stage1.setY(400);
        Group group = new Group();

        Label label1 = new Label("Second scene.");
        label1.setFont(new Font(24));
        Circle circle = new Circle(50);
        circle.setFill(Color.RED);
        circle.setCenterX(300);
        circle.setCenterY(300);
        Scene scene1 = new Scene(group, 500, 500, Color.BLUE);
        group.getChildren().add(circle);
        stage1.setTitle("Stage1");
        stage1.setScene(scene1);
        stage1.show();
    }


}

