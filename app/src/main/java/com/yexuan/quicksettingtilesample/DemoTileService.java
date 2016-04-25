package com.yexuan.quicksettingtilesample;

import android.content.Intent;
import android.os.IBinder;
import android.service.quicksettings.TileService;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by henryye on 16/4/11.
 * If need any edit necessary, please contact him by RTX
 */
public class DemoTileService extends TileService{
    private static final String TAG = "MM.DemoTileService";

    public DemoTileService() {
        super();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "on destroy", Toast.LENGTH_LONG).show();
        Log.i(TAG, "hy: onDestroy");
    }

    @Override
    public int onTileAdded() {
        Log.i(TAG, "hy: onTileAdded");
        Toast.makeText(this, "on onTileAdded", Toast.LENGTH_LONG).show();
        return super.onTileAdded();
    }

    @Override
    public void onTileRemoved() {
        Log.i(TAG, "hy: onTileRemoved");
        Toast.makeText(this, "on onTileRemoved", Toast.LENGTH_LONG).show();
        super.onTileRemoved();
    }

    @Override
    public void onStartListening() {
        Log.i(TAG, "hy: onStartListening");
        Toast.makeText(this, "on onStartListening", Toast.LENGTH_LONG).show();
        super.onStartListening();
    }

    @Override
    public void onStopListening() {
        Log.i(TAG, "hy: onStopListening");
        Toast.makeText(this, "on onStopListening", Toast.LENGTH_LONG).show();
        super.onStopListening();
    }

    @Override
    public void onClick() {
        Log.i(TAG, "hy: onClick");
        Toast.makeText(this, "on onClick", Toast.LENGTH_LONG).show();
        super.onClick();
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
