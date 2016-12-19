import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;

/**
 * Created by mario on 30/10/2016.
 */
public class ApplicationUI extends GridPane{
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button10;
    private Button button11;
    private Button button12;
    private Button button13;
    private Button button14;
    private Button button15;
    private Button button16;
    private Button button17;
    private Button button18;
    private Label label;


    public ApplicationUI() {
        initializeControls();
        layoutControls();
    }

    private void initializeControls() {
        button1 = createButton("C");
        button2 = createButton("+/-");
        button3 = createButton("/");
        button4 = createButton("*");
        button5 = createButton("7");
        button6 = createButton("8");
        button7 = createButton("9");
        button8 = createButton("-");
        button9 = createButton("4");
        button10 = createButton("5");
        button11 = createButton("6");
        button12 = createButton("+");
        button13 = createButton("1");
        button14 = createButton("2");
        button15 = createButton("3");
        button16 = createButton("");
        button17 = createButton("");
        button18 = createButton(".");
        label = new Label("365243");
    }

    private void layoutControls() {
/*        ColumnConstraints cc = new ColumnConstraints();
        cc.setHgrow(Priority.ALWAYS);
        getColumnConstraints().addAll(cc);

        RowConstraints rc = new RowConstraints();
        rc.setVgrow(Priority.ALWAYS);
        getRowConstraints().addAll(rc);*/

        setMaxSize(400, 400);

        add(label, 0, 0, 4, 1);
        add(button1, 0, 1);
        add(button2, 1, 1);
        add(button3, 2, 1);
        add(button4, 3, 1);
        add(button5, 0, 2);
        add(button6, 1, 2);
        add(button7, 2, 2);
        add(button8, 3, 2);
        add(button9, 0, 3);
        add(button10, 1, 3);
        add(button11, 2, 3);
        add(button12, 3, 3);
        add(button13, 0, 4);
        add(button14, 1, 4);
        add(button15, 2, 4);
        add(button16, 3, 4, 1, 2);
        add(button17, 0, 5, 2, 1);
        add(button18, 2, 5);

        button1.getStyleClass().addAll("function-key", "normal-key");
        button2.getStyleClass().addAll("function-key", "normal-key");
        button3.getStyleClass().addAll("function-key", "normal-key");
        button4.getStyleClass().addAll("function-key", "normal-key");
        button5.getStyleClass().addAll("normal-key", "number-key");
        button6.getStyleClass().addAll("normal-key", "number-key");
        button7.getStyleClass().addAll("normal-key", "number-key");
        button8.getStyleClass().addAll("function-key", "normal-key");
        button9.getStyleClass().addAll("normal-key", "number-key");
        button10.getStyleClass().addAll("normal-key", "number-key");
        button11.getStyleClass().addAll("normal-key", "number-key");
        button12.getStyleClass().addAll("function-key", "normal-key");
        button13.getStyleClass().addAll("normal-key", "number-key");
        button14.getStyleClass().addAll("normal-key", "number-key");
        button15.getStyleClass().addAll("normal-key", "number-key");
        button16.getStyleClass().addAll("equal-key");
        button17.getStyleClass().addAll("zero-key");
        button18.getStyleClass().addAll("normal-key", "number-key");
    }

    private Button createButton(String text){
        Button button = new Button(text);
        button.setMaxWidth(Double.MAX_VALUE);
        button.setMaxHeight(Double.MAX_VALUE);
        return button;
    }
}
