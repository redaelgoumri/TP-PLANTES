package ma.zero.quizappv24;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.github.lzyzsd.circleprogress.DonutProgress;

public class Score extends AppCompatActivity {
    Button bLogout, bTry;
    DonutProgress donut_progress;
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        // Initialize views and buttons
        donut_progress = findViewById(R.id.donut_progress);
        bLogout = findViewById(R.id.bLogout);
        bTry = findViewById(R.id.bTry);

        // Retrieve the score from the intent
        Intent intent = getIntent();
        score = intent.getIntExtra("score", 0);

        // Calculate the progress percentage
        int progress = (score * 100) / 5;

        // Set the progress
        donut_progress.setProgress(progress);

        // Set the progress text (optional)
        donut_progress.setSuffixText(progress + "%"); // or donut_progress.setInnerBottomText(progress + "%");

        // Set onClickListener for the logout button
        bLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Display a toast message
                Toast.makeText(getApplicationContext(), "Merci de votre Participation !", Toast.LENGTH_SHORT).show();
                // Finish the activity
                finish();
            }
        });

        // Set onClickListener for the try button
        bTry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start Quiz1 activity
                startActivity(new Intent(Score.this, Quiz1.class));
            }
        });
    }
}
