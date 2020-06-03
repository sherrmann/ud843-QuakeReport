package com.example.android.quakereport;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class EarthquakeLoader extends AsyncTaskLoader<List<Earthquake>> {

    private static final String USGS_REQUEST_URL =
            "https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&orderby=time&minmag=5&limit=20";


    public EarthquakeLoader(Context context){
        super(context);
    }

    @Override
    public List<Earthquake> loadInBackground() {
        String[] urls = {USGS_REQUEST_URL};
        if (urls.length < 1 || urls[0] == null) {
            return null;
        }

        List<Earthquake> result = QueryUtils.fetchEarthquakeData(urls[0]);
        return result;
    }


}
