package com.codies.quizapp.Models.RetrofitModels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Subjects {
    @SerializedName("22")
    @Expose
    private String _22;
    @SerializedName("34")
    @Expose
    private String _34;

    public String get22() {
        return _22;
    }

    public void set22(String _22) {
        this._22 = _22;
    }

    public String get34() {
        return _34;
    }

    public void set34(String _34) {
        this._34 = _34;
    }
}
