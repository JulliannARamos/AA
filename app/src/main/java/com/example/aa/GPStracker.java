package com.example.aa;

import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.widget.Toast;

import androidx.core.content.ContextCompat;

public class GPStracker implements LocationListener {
    Context context;

    public GPStracker(Context c){
        context=c;
    }
    public Location getLocation()
    {
        if(ContextCompat.checkSelfPermission(context, Manifest.permission.ACESS_FINE_LOCATION)!= PackageManager.PERMISSION_GRANTED){
            Toast.makeText(context, "Não foi permitir", Toast.LENGTH_SHORT).show();
            return null;
        }
        LocationManager Im = (LocationManager) context.getSystemService(Context.LOCATION_SERVICE), boolean isGPSEnabled = Im.isProviderEnabled(LocationManager.GPS_PROVIDER);

        if (isGPSEnabled){
            Im.requestLocationUpdates();
        }
    }
}
