package com.example.lab6task1;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    CheckBox android, java, python, php, unity3D;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Check box Example (02, 14, 43)");
        // initiate views
        android = (CheckBox) findViewById(R.id.androidCheckBox);
        android.setOnClickListener(this);
        java = (CheckBox) findViewById(R.id.javaCheckBox);
        java.setOnClickListener(this);
        python = (CheckBox) findViewById(R.id.pythonCheckBox);
        python.setOnClickListener(this);
        php = (CheckBox) findViewById(R.id.phpCheckBox);
        php.setOnClickListener(this);
        unity3D = (CheckBox) findViewById(R.id.unityCheckBox);
        unity3D.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.androidCheckBox:
                if (android.isChecked())
                    Toast.makeText(getApplicationContext(), "Android", Toast.LENGTH_LONG).show();
                break;
            case R.id.javaCheckBox:
                if (java.isChecked())
                    Toast.makeText(getApplicationContext(), "Java", Toast.LENGTH_LONG).show();
                break;
            case R.id.phpCheckBox:
                if (php.isChecked())
                    Toast.makeText(getApplicationContext(), "PHP", Toast.LENGTH_LONG).show();
                break;
            case R.id.pythonCheckBox:
                if (python.isChecked())
                    Toast.makeText(getApplicationContext(), "Python", Toast.LENGTH_LONG).show();
                break;
            case R.id.unityCheckBox:
                if (unity3D.isChecked())
                    Toast.makeText(getApplicationContext(), "Unity 3D", Toast.LENGTH_LONG).show();
                break;
        }
    }
}