package com.shareride.rider.Retrofit;
/**
 * @Developer Faysal
 * @Company AAPBD
 **/

import okhttp3.ResponseBody;
import retrofit2.Response;


public interface RetrofitCallback {
    public void Success(Response<ResponseBody> response);

    public void Failure(Throwable errorResponse);
}
