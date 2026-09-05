import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;


public class DialogBox extends HBox {
    private ImageView displayPicture;
    private Label text;

    public DialogBox(String strInput, Image img) {
        text = new Label(strInput);
        displayPicture = new ImageView(img);

        text.setWrapText(true);
        displayPicture.setFitWidth(100.0);
        displayPicture.setFitHeight(100.0);
        this.setAlignment(Pos.TOP_RIGHT);


        this.getChildren().addAll(text, displayPicture);
    }
}
