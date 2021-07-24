package com.prime.lifo.activities.splashScreen;

import android.content.Intent;
import android.os.CountDownTimer;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.prime.lifo.R;
import com.prime.lifo.activities.everyday.EverydayActivity;

public class SplashScreenActivity extends AppCompatActivity {

  private CountDownTimer countDownTimer;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    waitForSomeTime(5);
  }
  private void waitForSomeTime(long seconds){
    countDownTimer = new CountDownTimer(seconds*1000, 1000) {
      public void onTick(long millisUntilFinished) {

      }

      public void onFinish() {
        finishLauncher();
      }
    };
    countDownTimer.start();
  }
  void finishLauncher(){
    startActivity(new Intent(getApplicationContext(), EverydayActivity.class));
  }
}