package com.cindodcindy.etherapy.retrofit;

import com.cindodcindy.etherapy.model.get_mot_kris.GetMotivasiKristen;
import com.cindodcindy.etherapy.model.post_mot_kris.PostMotivasiKristen;
import com.cindodcindy.etherapy.model.post_music.PostMusic;
import com.google.gson.JsonObject;

import java.util.Map;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface MethodsFactory {

    @Multipart
    @POST("/upload")
    Call<PostMusic> uploadFile(@Part MultipartBody.Part file,
                               @Part("file") RequestBody name);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("/kristen")
    Call<PostMotivasiKristen> postChMotivation(@Body JsonObject body);


    @Headers({
            "Content-Type:application/json"
    })
    @GET("/kristen")
    Call<GetMotivasiKristen> getChMotivation(@HeaderMap Map<String,String > Map);

}
