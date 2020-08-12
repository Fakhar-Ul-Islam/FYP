package com.codies.quizapp.Models.RetrofitModels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ExamConfigs {
    @SerializedName("isSkippingQuestions")
    @Expose
    private Boolean isSkippingQuestions;
    @SerializedName("NegativeMarksOnWrongQuestion")
    @Expose
    private Integer negativeMarksOnWrongQuestion;
    @SerializedName("isQuestionTimeBound")
    @Expose
    private Boolean isQuestionTimeBound;
    @SerializedName("isExamTimeBound")
    @Expose
    private Boolean isExamTimeBound;
    @SerializedName("isDetailedResultsPublic")
    @Expose
    private Boolean isDetailedResultsPublic;

    public Boolean getIsSkippingQuestions() {
        return isSkippingQuestions;
    }

    public void setIsSkippingQuestions(Boolean isSkippingQuestions) {
        this.isSkippingQuestions = isSkippingQuestions;
    }

    public Integer getNegativeMarksOnWrongQuestion() {
        return negativeMarksOnWrongQuestion;
    }

    public void setNegativeMarksOnWrongQuestion(Integer negativeMarksOnWrongQuestion) {
        this.negativeMarksOnWrongQuestion = negativeMarksOnWrongQuestion;
    }

    public Boolean getIsQuestionTimeBound() {
        return isQuestionTimeBound;
    }

    public void setIsQuestionTimeBound(Boolean isQuestionTimeBound) {
        this.isQuestionTimeBound = isQuestionTimeBound;
    }

    public Boolean getIsExamTimeBound() {
        return isExamTimeBound;
    }

    public void setIsExamTimeBound(Boolean isExamTimeBound) {
        this.isExamTimeBound = isExamTimeBound;
    }

    public Boolean getIsDetailedResultsPublic() {
        return isDetailedResultsPublic;
    }

    public void setIsDetailedResultsPublic(Boolean isDetailedResultsPublic) {
        this.isDetailedResultsPublic = isDetailedResultsPublic;
    }
}
