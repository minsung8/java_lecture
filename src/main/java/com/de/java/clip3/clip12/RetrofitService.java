package com.de.java.clip3.clip12;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RetrofitService {

    @GET("api/users")
    Call<Object> retrofitTest(@Query("page") int page);

}
