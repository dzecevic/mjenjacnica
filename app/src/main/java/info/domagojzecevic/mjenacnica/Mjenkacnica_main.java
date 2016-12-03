package info.domagojzecevic.mjenacnica;

import android.content.Context;
import android.icu.text.DecimalFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Mjenkacnica_main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mjenkacnica_main);

        final Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText et=(EditText)findViewById(R.id.editText);
                CharSequence text =et.getText().toString();
                if(text.equals("")) {
                    text="0";
                }
                double foreignvalue = Double.parseDouble(text.toString());
                double homevalue = foreignvalue * 0.02400308;

                EditText et1=(EditText)findViewById(R.id.editText2);
                String hv = String.format("%.2f", homevalue);
                et1.setText(hv);

            }
        });

        final Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText et=(EditText)findViewById(R.id.editText);
                et.setText("");
            }
        });
}}
