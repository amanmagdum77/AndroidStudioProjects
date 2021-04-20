package com.example.audioplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {
    private MediaPlayer mPlayer;
    private SeekBar songProgress;
    private Handler hdlr = new Handler();
    private static int oTime=0, sTime=0, eTime=0;
    private Runnable UpdateSongTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageButton playbtn = (ImageButton) findViewById(R.id.btnPlay);
        final ImageButton pausebtn = (ImageButton) findViewById(R.id.btnPause);
        TextView songName = (TextView) findViewById(R.id.txtSname);
        final TextView startTime = (TextView) findViewById(R.id.txtStartTime);
        final TextView songTime = (TextView) findViewById(R.id.txtSongTime);

        songName.setText("All Time Low");
        mPlayer = MediaPlayer.create(this,R.raw.all_time_low);
        songProgress = (SeekBar)findViewById(R.id.seekBar);
        songProgress.setClickable(false);
        pausebtn.setEnabled(false);
        playbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Playing Audio", Toast.LENGTH_SHORT).show();
                mPlayer.start();
                eTime = mPlayer.getDuration();
                sTime = mPlayer.getCurrentPosition();
                if(oTime==0)
                {
                    songProgress.setMax(eTime);
                    oTime=1;
                }
                songTime.setText(String.format("%d min,%d sec", TimeUnit.MILLISECONDS.toMinutes(eTime),TimeUnit.MILLISECONDS.toSeconds(eTime)-TimeUnit.MINUTES.toSeconds(eTime)));
                startTime.setText(String.format("%d min,%d sec", TimeUnit.MILLISECONDS.toMinutes(sTime),TimeUnit.MILLISECONDS.toSeconds(sTime)-TimeUnit.MINUTES.toSeconds(sTime)));
                songProgress.setProgress(sTime);
                hdlr.postDelayed(UpdateSongTime,100);
                pausebtn.setEnabled(true);
                playbtn.setEnabled(false);

            }
        });


        pausebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPlayer.pause();
                pausebtn.setEnabled(false);
                playbtn.setEnabled(true);
                Toast.makeText(MainActivity.this, "Pausing Audio", Toast.LENGTH_SHORT).show();
            }
        });


        UpdateSongTime = new Runnable() {
            @Override
            public void run() {
                sTime = mPlayer.getCurrentPosition();
                startTime.setText(String.format("%d min,%d sec", TimeUnit.MILLISECONDS.toMinutes(eTime),TimeUnit.MILLISECONDS.toSeconds(eTime)-TimeUnit.MINUTES.toSeconds(eTime)));
                songProgress.setProgress(sTime);
                hdlr.postDelayed(this,100);


            }
        };


    }
}