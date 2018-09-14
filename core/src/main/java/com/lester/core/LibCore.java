package com.lester.core;

import android.content.Context;

public class LibCore {
    private Context context;
    private String host;

    private LibCore() {
    }

    public static final LibCore getInstance(){
        return Holder.instance;
    }

    private static class Holder {
        protected static final LibCore instance = new LibCore();
    }

    /**
     * 初始化库
     * @param context
     * @return
     */
    public static LibCore init(Context context) {
        Holder.instance.context = context.getApplicationContext();
        return Holder.instance;
    }

    /**
     * 设置host
     * @param baseUrl
     * @return
     */
    public static LibCore setHost(String baseUrl){
        Holder.instance.host = baseUrl;
        return Holder.instance;
    }

    public String getHost() {
        return host;
    }
}
