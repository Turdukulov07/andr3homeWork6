package com.example.andr3lesson6.utils;

import android.content.Context;

public class GetStringHelper {

    private final Context context;

    public GetStringHelper(Context context) {
        this.context = context;
    }

    public String[] getString(int stringId) {
        return context.getString(stringId).split(" ");
    }
}
