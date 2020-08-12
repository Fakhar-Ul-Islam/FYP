package com.codies.quizapp.Models.RoomModels;

public class ExamConfigs {

    private Boolean isSkippingQuestions;
    private Integer negativeMarksOnWrongQuestion;
    private Boolean isQuestionTimeBound;
    private Boolean isExamTimeBound;
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
