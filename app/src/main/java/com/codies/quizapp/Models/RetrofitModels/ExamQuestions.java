package com.codies.quizapp.Models.RetrofitModels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ExamQuestions {
    @SerializedName("ExamId")
    @Expose
    private Integer examId;
    @SerializedName("ExamQuestionNumber")
    @Expose
    private Integer examQuestionNumber;
    @SerializedName("IsLastQuestionAnswered")
    @Expose
    private Boolean isLastQuestionAnswered;
    @SerializedName("ExamObtainedMarks")
    @Expose
    private Integer examObtainedMarks;
    @SerializedName("isSavedInDB")
    @Expose
    private Boolean isSavedInDB;
    @SerializedName("QuestionId")
    @Expose
    private Integer questionId;
    @SerializedName("TopicTitleOfQuestion")
    @Expose
    private String topicTitleOfQuestion;
    @SerializedName("Type")
    @Expose
    private Integer type;
    @SerializedName("Marks")
    @Expose
    private Integer marks;
    @SerializedName("DurationInSeconds")
    @Expose
    private Integer durationInSeconds;
    @SerializedName("PresentedUTCDateTime")
    @Expose
    private String presentedUTCDateTime;
    @SerializedName("SQAnswer")
    @Expose
    private Object sQAnswer;
    @SerializedName("MCQ")
    @Expose
    private MCQ mcq;
    @SerializedName("TrueFale")
    @Expose
    private TrueFalse trueFalse;
    @SerializedName("FiB")
    @Expose
    private FiB fiB;

    public Integer getExamId() {
        return examId;
    }

    public void setExamId(Integer examId) {
        this.examId = examId;
    }

    public Integer getExamQuestionNumber() {
        return examQuestionNumber;
    }

    public void setExamQuestionNumber(Integer examQuestionNumber) {
        this.examQuestionNumber = examQuestionNumber;
    }

    public Boolean getIsLastQuestionAnswered() {
        return isLastQuestionAnswered;
    }

    public void setIsLastQuestionAnswered(Boolean isLastQuestionAnswered) {
        this.isLastQuestionAnswered = isLastQuestionAnswered;
    }

    public Integer getExamObtainedMarks() {
        return examObtainedMarks;
    }

    public void setExamObtainedMarks(Integer examObtainedMarks) {
        this.examObtainedMarks = examObtainedMarks;
    }

    public Boolean getIsSavedInDB() {
        return isSavedInDB;
    }

    public void setIsSavedInDB(Boolean isSavedInDB) {
        this.isSavedInDB = isSavedInDB;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public String getTopicTitleOfQuestion() {
        return topicTitleOfQuestion;
    }

    public void setTopicTitleOfQuestion(String topicTitleOfQuestion) {
        this.topicTitleOfQuestion = topicTitleOfQuestion;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }

    public Integer getDurationInSeconds() {
        return durationInSeconds;
    }

    public void setDurationInSeconds(Integer durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }

    public String getPresentedUTCDateTime() {
        return presentedUTCDateTime;
    }

    public void setPresentedUTCDateTime(String presentedUTCDateTime) {
        this.presentedUTCDateTime = presentedUTCDateTime;
    }

    public Object getSQAnswer() {
        return sQAnswer;
    }

    public void setSQAnswer(Object sQAnswer) {
        this.sQAnswer = sQAnswer;
    }

    public MCQ getMCQ() {
        return mcq;
    }

    public void setMCQ(MCQ mCQ) {
        this.mcq = mCQ;
    }

    public TrueFalse getTrueFale() {
        return trueFalse;
    }

    public void setTrueFale(TrueFalse trueFale) {
        this.trueFalse = trueFalse;
    }

    public FiB getFiB() {
        return fiB;
    }

    public void setFiB(FiB fiB) {
        this.fiB = fiB;
    }
}
