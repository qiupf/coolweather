package com.zjut.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class AQI {

    public City city;

    public class City {
        public String aqi;
        public String pm25;
        @SerializedName("qlty")
        public String quality;
    }
}
