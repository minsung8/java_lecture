package com.de.java.clip3.clip12;

import retrofit2.Call;

public class Main {
    public static void main(String[] args){
        Call<Object> retrofitTest =  RetrofitClient.getApi().retrofitTest(1);

        try{
            System.out.println(retrofitTest.execute().body());
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
