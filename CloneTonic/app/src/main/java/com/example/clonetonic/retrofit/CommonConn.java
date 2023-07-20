package com.example.clonetonic.retrofit;

import android.content.Context;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CommonConn {

    private final String TAG = "CommonConn";
    private HashMap<String , Object> paramMap;
    private String mapping ;
    private CallBackTonic callBack;

    public CommonConn(Context context, String mapping) {
        this.mapping = mapping;
        this.paramMap = new HashMap<>();
    }

    public void onExcute( CallBackTonic callBack){
        this.callBack = callBack;
        RetrofitInterface api = new RetrofitClient().getRetrofit().create(RetrofitInterface.class);
        api.clientPostMethod(mapping , paramMap).enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                onPostExcute(true , response.body());
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                onPostExcute(false , null);
            }
        });

    }

    private void onPostExcute(boolean isResult , String data){
        callBack.onResult(isResult, data);
    }
    public interface CallBackTonic{
        public void onResult(boolean isResult , String data);
    }


}
