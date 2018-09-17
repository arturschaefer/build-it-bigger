package com.udacity.gradle.builditbigger;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;

import com.example.jokesandroid.JokeActivity;
import com.udacity.gradle.builditbigger.backend.myApi.MyApi;

import org.junit.Rule;
import org.junit.Test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.fail;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertThat;

public class AsyncTaskTest{

    private Context mContext;
    @Test
    public void testCallJoke() {
        try {
            assertTrue(true);
            final CountDownLatch latch = new CountDownLatch(1);
            mContext = InstrumentationRegistry.getContext();
            EndpointsAsyncTask testTask = new EndpointsAsyncTask() {
                @Override
                protected void onPostExecute(String result) {
                    assertNotNull(result);
                    assertTrue(result.length() > 0);
                    latch.countDown();
                }
            };
            testTask.execute(mContext);
            latch.await();
        } catch (Exception e){
            fail("Get Exception Test - " + e.toString());
        }
    }
}
