package nur.ramadhan.setoran_hafalan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class menu_beranda extends AppCompatActivity {

    private ImageButton ibsetoran;
    private ImageButton ibriwayat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_beranda);

       ibsetoran = findViewById(R.id.ibsetoran);
       ibriwayat = findViewById(R.id.ibriwayat);

        ibsetoran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menu_beranda.this, menu_setoran.class));
            }
        });

        ibriwayat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menu_beranda.this, menu_riwayat.class));
            }
        });
    }
}