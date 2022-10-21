package magnago.matheus.contrata_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LpageActivity extends AppCompatActivity {


    Button btnLP1, btnLP2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lpage);

        btnLP1 = findViewById(R.id.btnLP1);
        btnLP2 = findViewById(R.id.btnLP2);

        btnLP1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LpageActivity.this, CadastroActivity.class);
                startActivity(i);
            }
        });

        btnLP2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(LpageActivity.this, LoginActivity.class);
                startActivity(i2);
            }
        });
    }
}












