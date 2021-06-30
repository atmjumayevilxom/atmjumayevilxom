package jumayev.ilxom.atm.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttl=(Button) findViewById(R.id.button1);
        Button butt2=(Button) findViewById(R.id.button2);
        Button butt3=(Button) findViewById(R.id.button3);
        Button butt4=(Button) findViewById(R.id.button4);
        Button butt5=(Button) findViewById(R.id.button5);
        Button butt6=(Button) findViewById(R.id.button6);
        Button butt7=(Button) findViewById(R.id.button7);
        Button butt8=(Button) findViewById(R.id.button8);
        Button butt9=(Button) findViewById(R.id.button9);
        Button butt10=(Button) findViewById(R.id.button10);
        buttl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1= new Intent(MainActivity.this,Tersu.class);
                startActivity(int1);
            }

        });
        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2= new Intent(MainActivity.this,Unisys.class);
                startActivity(int2);

            }

        });
        butt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int3= new Intent(MainActivity.this,New1.class);
                startActivity(int3);

            }

        });

        butt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int4= new Intent(MainActivity.this,talaba.class);
                startActivity(int4);
            }

        });
        butt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int5= new Intent(MainActivity.this,bimm1.class);
                startActivity(int5);

            }

        });
        butt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int6= new Intent(MainActivity.this,Masofayi.class);
                startActivity(int6);

            }

        });
        butt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int7= new Intent(MainActivity.this,PochtaK.class);
                startActivity(int7);

            }

        });
        butt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int8= new Intent(MainActivity.this,Kutubxona.class);
                startActivity(int8);

            }

        });
        butt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int9= new Intent(MainActivity.this,ATM.class);
                startActivity(int9);

            }

        });
        butt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int10= new Intent(MainActivity.this,Ishtimoy.class);
                startActivity(int10);

            }

        });
    }
}
