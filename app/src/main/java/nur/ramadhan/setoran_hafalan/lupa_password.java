package nur.ramadhan.setoran_hafalan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class lupa_password extends AppCompatActivity {
    private EditText etemail;
    private TextView signin;
    private Button btnkirim;
    private static final String valid_email = "fadlan@uin-suska.ac.id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lupa_password);

        etemail = findViewById(R.id.etemail);
        signin = findViewById(R.id.signin);
        btnkirim = findViewById(R.id.btnkirim);

        btnkirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = etemail.getText().toString().trim();
                if (email.equals(valid_email)){
                    Toast.makeText(lupa_password.this, "Permintaan Pergantian Password Dikirim", Toast.LENGTH_SHORT).show();
                } else if(email.isEmpty()){
                    Toast.makeText(lupa_password.this, "Mohon Mengisi Email", Toast.LENGTH_SHORT).show();
                } else{
                    Toast.makeText(lupa_password.this, "Email Tidak Terdaftar", Toast.LENGTH_SHORT).show();
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