package com.artur.servicetest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.widget.Toast;

/**
 * Created by Lenovo on 19.05.2018.
 */

public class DelayedMessageService extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {
        MediaPlayer mediaPlayer = MediaPlayer.create(context, R.raw.asd);
        mediaPlayer.start();
        Toast.makeText(context, "run", Toast.LENGTH_SHORT).show();

    }
}
