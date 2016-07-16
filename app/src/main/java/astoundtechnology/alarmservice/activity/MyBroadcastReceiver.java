package astoundtechnology.alarmservice.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.widget.Toast;

/**
 * Created by Astound Rushi on 16-07-2016.
 */
public class MyBroadcastReceiver extends BroadcastReceiver
{
     //   MediaPlayer mp;
        @Override
        public void onReceive(Context context, Intent intent)
        {
            Uri notification = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
            Ringtone r = RingtoneManager.getRingtone(context, notification);
            r.play();
            Toast.makeText(context, "Alarm....", Toast.LENGTH_LONG).show();
        }
}
