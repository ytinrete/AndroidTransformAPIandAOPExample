package com.example.transformtest;

import android.util.Log;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 *
 */

@Aspect
public class Aspactj {

  @Before("execution(void com.example.transformtest.MainActivity.hello3())")
//  @Before("execution(* android.app.Activity.on**(..))")
  public void aspactjBeforeHello3() {
    Log.d("xxxx", "aspactjBeforeHello3: insert success!");
  }

}
