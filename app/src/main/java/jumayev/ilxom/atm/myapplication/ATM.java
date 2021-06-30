package jumayev.ilxom.atm.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ATM extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atm);
        Button butt15=(Button) findViewById(R.id.button15);
        Button butt16=(Button) findViewById(R.id.button16);

        butt15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int15= new Intent(ATM.this,texno.class);
                startActivity(int15);

            }

        });
        butt16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int16= new Intent(ATM.this,Men1.class);
                startActivity(int16);

            }

        });

    }
}
