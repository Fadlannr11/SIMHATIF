package nur.ramadhan.setoran_hafalan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class menu_riwayat extends AppCompatActivity {
    private ImageButton ibsetoran;
    private ImageButton ibberanda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_riwayat);

        ibsetoran = findViewById(R.id.ibsetoran);
        ibberanda = findViewById(R.id.ibberanda);

        ibsetoran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menu_riwayat.this, menu_setoran.class));
            }
        });

        ibberanda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menu_riwayat.this, menu_beranda.class));
            }
        });
    }
}