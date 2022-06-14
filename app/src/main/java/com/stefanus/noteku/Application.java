package com.stefanus.noteku;

import com.stefanus.noteku.models.Rv_List;

public class Application extends android.app.Application {
    private static Rv_List rv_list;

    @Override
    public void onCreate() {
        super.onCreate();
        rv_list = new Rv_List();
    }

    public static Rv_List getRv_List() {
        return rv_list;
    }
}
