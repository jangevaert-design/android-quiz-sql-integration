package edu.cnm.deepdive.myawsomequiz;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Button buttonStartQuiz = findViewById(R.id.button_start_quiz);
    buttonStartQuiz.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        startQuiz();
      }
    });

  }

  private void startQuiz() {
    Intent intent = new Intent(MainActivity.this, QuizActivity.class);
    startActivity(intent);
  }
}