package com.rideshare.driver.Retrofit;
/**
 *@Developer Faysal
 *@Company AAPBD
 **/

import com.rideshare.driver.Helper.URLHelper;

import retrofit2.Retrofit;



public class RetrofitClient {
    private static Retrofit retrofit = null;

    public static Retrofit getLiveTrackingClient() {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(URLHelper.base)
                    .build();
        }
        return retrofit;
    }
}
