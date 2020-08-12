package com.codies.quizapp.Models.RoomModels;

import androidx.core.content.pm.PermissionInfoCompat;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Entity(tableName = "option_for_fib_table")
public class OptionForFiB {


    private Integer examId;
    private Integer fibId;

    private String answer;
    @PrimaryKey (autoGenerate = false)
    private Integer fillInBlankId;


    public OptionForFiB() {

    }

    public OptionForFiB(Integer examId, Integer fibId, String answer, Integer fillInBlankId) {
        this.examId = examId;
        this.fibId = fibId;
        this.answer = answer;
        this.fillInBlankId = fillInBlankId;
    }

    public Integer getExamId() {
        return examId;
    }

    public void setExamId(Integer examId) {
        this.examId = examId;
    }

    public Integer getFibId() {
        return fibId;
    }

    public void setFibId(Integer fibId) {
        this.fibId = fibId;
    }

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
