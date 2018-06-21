package com.malavika.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText dollarinput;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dollarinput = (EditText)findViewById(R.id.dollarinput);
        t = (TextView)findViewById(R.id.rupeeamount);
        Button btn = (Button)findViewById(R.id.mybutton);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double dollaramount =  Double.parseDouble(dollarinput.getText().toString());
                Double rupee = dollaramount * 68;
                t.setText("Rupee Amount is "+ rupee);



            }
        });

    }
}
