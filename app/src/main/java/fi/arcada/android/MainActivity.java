package fi.arcada.android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    SharedPreferences pref;
    TextView mytext;
    TextView statsview;
    TextView textsetting;
    Button button1;
    Button button2;
    Button button3;
    Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mytext=findViewById(R.id.mytext);
        statsview=findViewById(R.id.statsviev);
        textsetting=findViewById(R.id.textView3);
        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);
        button4=findViewById(R.id.button4);

        pref = PreferenceManager.getDefaultSharedPreferences(this);

        mytext.setText(pref.getString("mytext","hejsan"));
        button1.setText(pref.getString("b1","0"));
        button2.setText(pref.getString("b2","0"));
        button3.setText(pref.getString("b3","0"));
        button4.setText(pref.getString("b4","0"));
        textsetting.setText(pref.getString("textsetting","def val"));
    }

    public void butonclick(View view){
    SharedPreferences.Editor prefeditor = pref.edit();
       if(view.getId()== R.id.button){
    prefeditor.putString("mytext",mytext.getText().toString());
    prefeditor.apply();
    }else if(view.getId()== R.id.settingsbutton){
    Intent intent = new Intent(this, SettingsActivity.class);
    startActivity(intent);
    }else if(view.getId()== R.id.button1){
           int knapvarde = Integer.parseInt(button1.getText().toString());
           prefeditor.putString("b1", String.valueOf(knapvarde + 1));
           prefeditor.apply();
           button1.setText(pref.getString("b1","0"));
    }else if(view.getId()== R.id.button2){
           int knapvarde = Integer.parseInt(button2.getText().toString());
           prefeditor.putString("b2", String.valueOf(knapvarde + 1));
           prefeditor.apply();
           button2.setText(pref.getString("b2","0"));
    }else if(view.getId()== R.id.button3){
           int knapvarde = Integer.parseInt(button3.getText().toString());
           prefeditor.putString("b3", String.valueOf(knapvarde + 1));
           prefeditor.apply();
           button3.setText(pref.getString("b3","0"));
    }else if(view.getId()== R.id.button4){
           int knapvarde = Integer.parseInt(button4.getText().toString());
           prefeditor.putString("b4", String.valueOf(knapvarde + 1));
           prefeditor.apply();
           button4.setText(pref.getString("b4","0"));
    }else if(view.getId()== R.id.clear){
           prefeditor.putString("b1", String.valueOf(0));
           prefeditor.putString("b2", String.valueOf(0));
           prefeditor.putString("b3", String.valueOf(0));
           prefeditor.putString("b4", String.valueOf(0));
           prefeditor.apply();
           button1.setText(pref.getString("b1","0"));
           button2.setText(pref.getString("b2","0"));
           button3.setText(pref.getString("b3","0"));
           button4.setText(pref.getString("b4","0"));
       }
       Stats.Chi2(Integer.parseInt(button1.getText().toString()),
               Integer.parseInt(button2.getText().toString()),
               Integer.parseInt(button3.getText().toString()),
               Integer.parseInt(button4.getText().toString())
       );
        statsview.setText(String.format("%s %.2f\n%s: %.2f\n%s",
                "Chi2",Stats.Chi2(Integer.parseInt(button1.getText().toString()),
                        Integer.parseInt(button2.getText().toString()),
                        Integer.parseInt(button3.getText().toString()),
                        Integer.parseInt(button4.getText().toString()))
                ,"p värde",Stats.pVarde(Stats.Chi2(Integer.parseInt(button1.getText().toString()),
                Integer.parseInt(button2.getText().toString()),
                Integer.parseInt(button3.getText().toString()),
                Integer.parseInt(button4.getText().toString())))
                ,"signifikans nivå"
        ));


    }
}