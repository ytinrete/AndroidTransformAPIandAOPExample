package com.example.transformtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    hello();
    hello2(111);
    hello3();
    findViewById(R.id.btn).setOnClickListener(this);
  }

  @Override
  public void onClick(View view) {
    Toast.makeText(this, "btn", Toast.LENGTH_SHORT).show();
  }

  private void hello() {
    Log.d("xxxx", "hello");
  }

  private void hello2(int aaa) {
    Log.d("xxxx", "hello2:" + aaa);
  }

  private void hello3() {
    Log.d("xxxx", "hello3");
  }


}
