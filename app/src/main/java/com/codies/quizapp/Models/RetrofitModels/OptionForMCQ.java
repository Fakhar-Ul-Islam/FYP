package com.codies.quizapp.Models.RetrofitModels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OptionForMCQ {
    @SerializedName("Option")
    @Expose
    private String option;
    @SerializedName("IsCorrectOption")
    @Expose
    private Boolean isCorrectOption;
    @SerializedName("OptionId")
    @Expose
    private Integer optionId;

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public Boolean getIsCorrectOption() {
        return isCorrectOption;
    }

    public void setIsCorrectOption(Boolean isCorrectOption) {
        this.isCorrectOption = isCorrectOption;
    }

    public Integer getOptionId() {
        return optionId;
    }

    public void setOptionId(Integer optionId) {
        this.optionId = optionId;
    }
}
