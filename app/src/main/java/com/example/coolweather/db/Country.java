package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/5/5.
 */
public class Country extends DataSupport {
    private int id;
    private String countryName;
    private String  weatherId;
    private int  cityId;

    public int getId(){return id;}
    public String getCountryName(){return countryName;}
    public String getWeatherId(){return weatherId;}
    public int getCityID(){return cityId;}


    public void setId(int id){this.id=id;}
    public void setCountryName(String countryName){this.countryName=countryName;}
    public void setWeatherId(String weatherId){this.weatherId = weatherId;}
    public void setCityId(int cityId){this.cityId=cityId;}

}
