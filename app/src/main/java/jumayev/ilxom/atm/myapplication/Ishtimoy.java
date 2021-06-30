package jumayev.ilxom.atm.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ishtimoy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ishtimoy);
        Button butt11=(Button) findViewById(R.id.button11);
        Button butt12=(Button) findViewById(R.id.button12);
        Button butt13=(Button) findViewById(R.id.button13);
        Button butt14=(Button) findViewById(R.id.button14);

        butt11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int11= new Intent(Ishtimoy.this,instagram.class);
                startActivity(int11);

            }

        });
        butt12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int12= new Intent(Ishtimoy.this,fesc.class);
                startActivity(int12);

            }

        });
        butt13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int13= new Intent(Ishtimoy.this,youtob.class);
                startActivity(int13);

            }

        });
        butt14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int14= new Intent(Ishtimoy.this,Telegram.class);
                startActivity(int14);

            }

        });
    }
}
