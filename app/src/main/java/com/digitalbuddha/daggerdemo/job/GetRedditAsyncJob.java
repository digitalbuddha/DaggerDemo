package com.digitalbuddha.daggerdemo.job;

import android.content.Context;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.digitalbuddha.daggerdemo.dagger.ForActivity;
import com.digitalbuddha.daggerdemo.utils.CustomVolley;
import com.digitalbuddha.daggerdemo.utils.GsonRequest;
import com.digitalbuddha.daggerdemo.utils.MyVolley;
import com.path.android.jobqueue.Job;
import com.path.android.jobqueue.Params;

import java.util.Map;

import javax.inject.Inject;

import de.greenrobot.event.EventBus;

/**
 * Created by MikeN on 9/8/14.
 */
public class GetRedditAsyncJob extends Job implements Response.ErrorListener, Response.Listener<Map> {
    @Inject
    @ForActivity
    Context context;
    @Inject
    CustomVolley volley;

    public Map map;

    public GetRedditAsyncJob() {
        super(new Params(2)
                .requireNetwork()
                .groupBy("Reddit"));
    }

    @Override
    public void onAdded() {

    }

    @Override
    public void onRun() throws Throwable {
        String url = "http://www.reddit.com/r/aww.json?limit=5";
        GsonRequest request = new GsonRequest<Map>(Request.Method.GET, url, Map.class,this,this);

        request.setRetryPolicy(new DefaultRetryPolicy(30000, 1, 1));
        // request.setShouldCache(false);
        request.setTag("Demo");
        MyVolley.getRequestQueue().cancelAll("Demo");
        MyVolley.getRequestQueue().add(request);

    }

    @Override
    public void onErrorResponse(VolleyError error) {

    }

    @Override
    public void onResponse(Map response) {
        EventBus.getDefault().post(this); //post the job instead of making dummy event pojos
    }

    //
    @Override
    protected void onCancel() {
        throw new RuntimeException();
    }

    //don't retry on error
    @Override
    protected boolean shouldReRunOnThrowable(Throwable throwable) {
        return false;
    }

}