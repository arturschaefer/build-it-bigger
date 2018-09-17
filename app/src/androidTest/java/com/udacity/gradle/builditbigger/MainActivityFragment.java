package com.udacity.gradle.builditbigger;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.udacity.gradle.builditbigger.backend.myApi.MyApi;

import org.hamcrest.MatcherAssert;

import java.util.concurrent.TimeUnit;

import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.fail;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertThat;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public void testCallJoke() {

        try {
            EndpointsAsyncTask task = new EndpointsAsyncTask();
            task.execute();
            String joke = task.get(30, TimeUnit.SECONDS);

            assertThat(joke, notNullValue());
            assertTrue(joke.length() > 0);

        } catch (Exception e) {
            fail("Operation timed out");
        }
    }
}
