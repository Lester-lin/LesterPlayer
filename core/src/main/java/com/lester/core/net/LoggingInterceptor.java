package com.lester.core.net;

import com.lester.core.utils.Log;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class LoggingInterceptor implements Interceptor {
    private final String TAG = "HTTP";
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();

        Log.d(TAG,"-----Start----------------------------------");
        Log.d(TAG,"| request url = "+request.url());
        Log.d(TAG,"| request headers = "+request.headers());
        Log.d(TAG,"| request body = "+request.body().toString());


        Response response = chain.proceed(request);
        okhttp3.MediaType mediaType = response.body().contentType();
        String content = response.body().string();

        Log.d(TAG,"| response code = "+response.code());
        Log.d(TAG,"| response result = "+content);
        Log.d(TAG, "-----End----------------------------------");

        return response.newBuilder()
                .body(okhttp3.ResponseBody.create(mediaType, content))
                .build();
    }
}
