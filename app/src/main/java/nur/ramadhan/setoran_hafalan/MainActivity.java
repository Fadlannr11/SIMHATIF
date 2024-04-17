package nur.ramadhan.setoran_hafalan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText etnim;
    private EditText etpassword;
    private Button Loginbtn;
    private TextView lupapassword;
    private TextView signup;
    private static final String valid_nim = "12250113820";
    private static final String valid_password = "fadlan11";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etnim = findViewById(R.id.etnim);
        etpassword = findViewById(R.id.etpassword);
        Loginbtn = findViewById(R.id.Loginbtn);
        lupapassword = findViewById(R.id.lupapassword);
        signup = findViewById(R.id.signup);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,signup.class));
            }
        });

        lupapassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle "Lupa Password" click event here
                startActivity(new Intent(MainActivity.this, lupa_password.class));
            }
        });

        Loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nim = etnim.getText().toString().trim();
                String password = etpassword.getText().toString().trim();

                if (nim.equals(valid_nim) && password.equals(valid_password)) {
                    Toast.makeText(MainActivity.this, "Login Sukses", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(MainActivity.this, menu_beranda.class));
                } else if(nim.isEmpty() || password.isEmpty()){
                    // Jika tidak sesuai, tampilkan pesan error
                    Toast.makeText(MainActivity.this, "Mohon Mengisi NIM & Password", Toast.LENGTH_SHORT).show();
                } else{
                    Toast.makeText(MainActivity.this, "Invalid NIM or password", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}