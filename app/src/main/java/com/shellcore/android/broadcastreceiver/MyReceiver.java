package com.shellcore.android.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Cesar on 13/03/2017.
 */

public class MyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String broadcastMessage = intent.getStringExtra("broadcast");
        Toast.makeText(context, "Mensaje: " + broadcastMessage, Toast.LENGTH_LONG)
                .show();
    }
}
