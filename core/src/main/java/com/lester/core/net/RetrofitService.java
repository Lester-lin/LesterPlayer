package com.lester.core.net;

import java.util.Map;

import io.reactivex.Observable;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.QueryMap;
import retrofit2.http.Streaming;
import retrofit2.http.Url;

public interface RetrofitService {

    @GET
    Observable<Response<?>> get(@Url String url, @QueryMap Map<String, Object> queryMap);

    @POST
    Observable<Response<?>> post(@Url String url, @QueryMap Map<String,Object> queryMap);

    @POST
    Observable<Response<?>> postRaw(@Url String url, @Body RequestBody requestBody);

    @PUT
    Observable<Response<?>> put(@Url String url, @QueryMap Map<String,Object> queryMap);

    @PUT
    Observable<Response<?>> putRaw(@Url String url, @Body RequestBody requestBody);

    @DELETE
    Observable<Response<?>> delete(@Url String url, @QueryMap Map<String, Object> queryMap);

    @Streaming
    @GET
    Observable<Response<ResponseBody>> dowonload(@Url String url, @QueryMap Map<String,Object> queryMap);

    @Multipart
    @POST
    Observable<Response<?>> upload(@Url String url, @Body RequestBody requestBody, @Part MultipartBody.Part part);
}
