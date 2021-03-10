package fi.arcada.android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    SharedPreferences pref;
    TextView mytext;
    TextView textsetting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mytext=findViewById(R.id.mytext);
        textsetting=findViewById(R.id.textView3);

        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(this);

        mytext.setText(pref.getString("mytext","hejsan"));
        textsetting.setText(pref.getString("textsetting","def val"));
    }

    public void butonclick(View view){

       if(view.getId()== R.id.button){
    SharedPreferences.Editor prefseditor = pref.edit();
    prefseditor.putString("myotheredit",mytext.getText().toString());
    prefseditor.apply();
    }else if(view.getId()== R.id.settingsbutton){
    Intent intent = new Intent(this, SettingsActivity.class);
    startActivity(intent);}
    }
}