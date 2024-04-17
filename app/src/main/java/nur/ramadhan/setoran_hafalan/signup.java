package nur.ramadhan.setoran_hafalan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class signup extends AppCompatActivity {

    private EditText etnama, etnim, etemail, etpassword, etupassword;
    private Button buatbtn;
    private TextView signin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        etnama = findViewById(R.id.etnama);
        etnim = findViewById(R.id.etnim);
        etemail = findViewById(R.id.etemail);
        etpassword = findViewById(R.id.etpassword);
        etupassword = findViewById(R.id.etupassword);
        buatbtn = findViewById(R.id.buatbtn);
        signin = findViewById(R.id.signin);

        buatbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = etnama.getText().toString().trim();
                String nim = etnim.getText().toString().trim();
                String email = etemail.getText().toString().trim();
                String password = etpassword.getText().toString().trim();
                String upassword = etupassword.getText().toString().trim();

                // Checking if password and its confirmation match
                if (nama.isEmpty() || nim.isEmpty() || email.isEmpty() || password.isEmpty() || upassword.isEmpty()) {
                    Toast.makeText(signup.this, "Seluruh kolom harus terisi", Toast.LENGTH_SHORT).show();
                } else if (!password.equals(upassword)) {
                    // Passwords do not match, show toast
                    Toast.makeText(signup.this, "Pengulangan Password Salah", Toast.LENGTH_SHORT).show();
                } else {
                    // Do your signup process here, for now just display a toast
                    Toast.makeText(signup.this, "Akun Telah Dibuat", Toast.LENGTH_SHORT).show();
                }
            }
        });
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}