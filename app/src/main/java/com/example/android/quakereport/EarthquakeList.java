package com.example.android.quakereport;

public class EarthquakeList {

    private String  mLocation;
    private long mTimeInMilliseconds;
    private double mMagnitude;
    private String mUrl;

    public EarthquakeList(double magnituide, String place, long timeInMilliseconds, String url){
        mMagnitude = magnituide;
        mLocation = place;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    public String getUrl() {
        return mUrl;
    }

    public double getmMagnitude() {
        return mMagnitude;
    }

    public String getmLocation() {
        return mLocation;
    }

    public long getmTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
}
