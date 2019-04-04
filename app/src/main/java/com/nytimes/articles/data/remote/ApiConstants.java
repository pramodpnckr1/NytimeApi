package com.nytimes.articles.data.remote;


/**
 * Keep all the service related constants here.
 * Author: PRAMOD K P
 * Email: pramodpnckr@gmail.com
 * Created: 3/28/2019
 * Modified: 3/28/2019
 */
public class ApiConstants {
    public static final String BASE_URL = "http://api.nytimes.com/";
    public static final long CONNECT_TIMEOUT = 30000;
    public static final long READ_TIMEOUT = 30000;
    public static final long WRITE_TIMEOUT = 30000;
    public static final String API_KEY = "FpGT1laBCxRHrvRA00PhGFRpXfYSLHCf";

    private ApiConstants(){
        // Private constructor to hide the implicit one
    }

}
