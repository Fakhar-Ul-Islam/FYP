package com.codies.quizapp.Models.RetrofitModels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OptionForFiB {
    @SerializedName("Answer")
    @Expose
    private String answer;
    @SerializedName("FillInBlankId")
    @Expose
    private Integer fillInBlankId;

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Integer getFillInBlankId() {
        return fillInBlankId;
    }

    public void setFillInBlankId(Integer fillInBlankId) {
        this.fillInBlankId = fillInBlankId;
    }
}
