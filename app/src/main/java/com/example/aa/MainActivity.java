package com.example.aa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //Define as variaveis
    private  ImageView imageViewFoto;
    private Button btnGeo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BtnGeo = (Button)findViewById(R.id.btn_gps);
        ActivityCompat.requestPermissions(this,new String[] {Manifest.permission.ACESS_FINE_LOCATION},123);

        btnGeo.setOnClickListener(new  View.OnClickListener){

            @Override
                    public void onClick(View view)
            {
                GPStracker g = new GPStracker(getApplication());
                Location I = g.getLocation();
            }
            if(I != null){
                double lat= I.getLatitude();
                double lon=
            }
        }



    }
}