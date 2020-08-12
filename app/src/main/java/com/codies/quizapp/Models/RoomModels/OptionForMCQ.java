package com.codies.quizapp.Models.RoomModels;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Entity(tableName = "option_for_mcq_table")
public class OptionForMCQ {

    private Integer examId;
    private Integer mcqId;

    private String option;
    private Boolean isCorrectOption;
    @PrimaryKey(autoGenerate = false)
    private Integer optionId;

    public OptionForMCQ() {

    }

    public OptionForMCQ(Integer examId, Integer mcqId, String option, Boolean isCorrectOption, Integer optionId) {
        this.examId = examId;
        this.mcqId = mcqId;
        this.option = option;
        this.isCorrectOption = isCorrectOption;
        this.optionId = optionId;
    }

    public Integer getExamId() {
        return examId;
    }

    public void setExamId(Integer examId) {
        this.examId = examId;
    }

    public Integer getMcqId() {
        return mcqId;
    }

    public void setMcqId(Integer mcqId) {
        this.mcqId = mcqId;
    }

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
