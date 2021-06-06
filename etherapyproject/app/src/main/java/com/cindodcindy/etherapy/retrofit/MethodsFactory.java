package com.cindodcindy.etherapy.retrofit;

import com.cindodcindy.etherapy.model.post_music.PostMusic;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface MethodsFactory {

    @Multipart
    @POST("/upload")
    Call<PostMusic> uploadFile(@Part MultipartBody.Part file,
                               @Part("file") RequestBody name);

}
