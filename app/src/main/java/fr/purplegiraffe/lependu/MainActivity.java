package fr.purplegiraffe.lependu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private GameManager _gameManager = new GameManager();

    private TextView ui_secretWordLabel;
    private EditText ui_keyboardField;
    private TextView ui_gameStatusLabel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ui_secretWordLabel = findViewById(R.id.secretWordLabel);
        ui_keyboardField = findViewById(R.id.keyboardField);
        ui_gameStatusLabel = findViewById(R.id.gameStatusLabel);
        updateDisplay();
    }

    public void checkInputButtonTouched(View button) {
        String input = ui_keyboardField.getText().toString();
        if (input.length() == 1) {
            _gameManager.addAttempt(input.charAt(0));
        }
        updateDisplay();
    }

    private void updateDisplay() {
        ui_secretWordLabel.setText(_gameManager.getCurrentValue());

    }
}
