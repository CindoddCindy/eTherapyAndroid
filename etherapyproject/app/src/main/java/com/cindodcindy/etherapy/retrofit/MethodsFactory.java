package com.cindodcindy.etherapy.retrofit;

import com.cindodcindy.etherapy.model.get_game.GetGame;
import com.cindodcindy.etherapy.model.get_game_answ.GetAnswerGame;
import com.cindodcindy.etherapy.model.get_mot_kris.GetMotivasiKristen;
import com.cindodcindy.etherapy.model.get_mot_mus.GetMotivasiMuslim;
import com.cindodcindy.etherapy.model.get_music.GetMusic;
import com.cindodcindy.etherapy.model.get_pen_mot_kris.GetRateKristen;
import com.cindodcindy.etherapy.model.get_pen_mot_mus.GetRateMuslim;
import com.cindodcindy.etherapy.model.get_pen_music.GetRateMusic;
import com.cindodcindy.etherapy.model.post_game_ans.PostAnswerGame;
import com.cindodcindy.etherapy.model.post_games.PostGame;
import com.cindodcindy.etherapy.model.post_mot_kris.PostMotivasiKristen;
import com.cindodcindy.etherapy.model.post_mot_mus.PostMotivasiMuslim;
import com.cindodcindy.etherapy.model.post_music.PostMusic;
import com.cindodcindy.etherapy.model.post_pen_kris.PostRateKristen;
import com.cindodcindy.etherapy.model.post_pen_mus.PostRateMuslim;
import com.cindodcindy.etherapy.model.post_pen_music.PostRateMusic;
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


    @Headers({
            "Content-Type:application/json"
    })
    @POST("/muslim")
    Call<PostMotivasiMuslim> postMsMotivation(@Body JsonObject body);


    @Headers({
            "Content-Type:application/json"
    })
    @GET("/muslim")
    Call<GetMotivasiMuslim> getMsMotivation(@HeaderMap Map<String,String > Map);



    @Headers({
            "Content-Type:application/json"
    })
    @POST("/music")
    Call<PostMusic> postMusic(@Body JsonObject body);


    @Headers({
            "Content-Type:application/json"
    })
    @GET("/music")
    Call<GetMusic> getMusic(@HeaderMap Map<String,String > Map);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("/quiz")
    Call<PostGame> postGame(@Body JsonObject body);


    @Headers({
            "Content-Type:application/json"
    })
    @GET("/quiz")
    Call<GetGame> getGame(@HeaderMap Map<String,String > Map);


    @Headers({
            "Content-Type:application/json"
    })
    @POST("/rateMusic")
    Call<PostRateMusic> postRateMusc(@Body JsonObject body);


    @Headers({
            "Content-Type:application/json"
    })
    @GET("/rateMusic")
    Call<GetRateMusic> getRateMusic(@HeaderMap Map<String,String > Map);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("/rateCr")
    Call<PostRateKristen> postRateCr(@Body JsonObject body);


    @Headers({
            "Content-Type:application/json"
    })
    @GET("/rateCr")
    Call<GetRateKristen> getRateKristen(@HeaderMap Map<String,String > Map);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("/rateMs")
    Call<PostRateMuslim> postRateMs(@Body JsonObject body);


    @Headers({
            "Content-Type:application/json"
    })
    @GET("/rateMs")
    Call<GetRateMuslim> getRateMs(@HeaderMap Map<String,String > Map);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("/answerGame")
    Call<PostAnswerGame> postAnswerGame(@Body JsonObject body);


    @Headers({
            "Content-Type:application/json"
    })
    @GET("/answerGame")
    Call<GetAnswerGame> getAnswerGame(@HeaderMap Map<String,String > Map);








}
