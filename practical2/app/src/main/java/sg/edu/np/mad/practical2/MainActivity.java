package sg.edu.np.mad.practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        User user = new User();

        Button followBtn = findViewById(R.id.follow);
        followBtn.setText(user.followed ? "Unfollow" : "Follow");

        followBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user.ToggleFollow();
                followBtn.setText(user.followed ? "Unfollow" : "Follow");
            }
        });
    }
}