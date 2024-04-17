package nur.ramadhan.setoran_hafalan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class menu_setoran extends AppCompatActivity {

    private ImageButton ibriwayat;
    private ImageButton ibberanda;
    private Button download;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_setoran);

        ibriwayat = findViewById(R.id.ibriwayat);
        ibberanda = findViewById(R.id.ibberanda);
        download = findViewById(R.id.download);

        ibriwayat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menu_setoran.this, menu_riwayat.class));
            }
        });

        ibberanda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menu_setoran.this, menu_beranda.class));
            }
        });
        download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(menu_setoran.this, "Berkas Setoran Hafalan Didownload", Toast.LENGTH_SHORT).show();
            }
        });

    }
}