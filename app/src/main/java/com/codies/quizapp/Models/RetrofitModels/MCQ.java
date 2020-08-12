package com.codies.quizapp.Models.RetrofitModels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MCQ {
    @SerializedName("TopicId")
    @Expose
    private Integer topicId;
    @SerializedName("DifficultyValue")
    @Expose
    private Integer difficultyValue;
    @SerializedName("TopicTitle")
    @Expose
    private String topicTitle;
    @SerializedName("CreatorId")
    @Expose
    private Integer creatorId;
    @SerializedName("CreatorName")
    @Expose
    private String creatorName;
    @SerializedName("Statement")
    @Expose
    private String statement;
    @SerializedName("BasedOnPassage")
    @Expose
    private String basedOnPassage;
    @SerializedName("isAttemptedInExam")
    @Expose
    private Boolean isAttemptedInExam;
    @SerializedName("Options")
    @Expose
    private List<OptionForMCQ> options = null;
    @SerializedName("StudentAnswer")
    @Expose
    private String studentAnswer;

    public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    public Integer getDifficultyValue() {
        return difficultyValue;
    }

    public void setDifficultyValue(Integer difficultyValue) {
        this.difficultyValue = difficultyValue;
    }

    public String getTopicTitle() {
        return topicTitle;
    }

    public void setTopicTitle(String topicTitle) {
        this.topicTitle = topicTitle;
    }

    public Integer getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }

    public String getBasedOnPassage() {
        return basedOnPassage;
    }

    public void setBasedOnPassage(String basedOnPassage) {
        this.basedOnPassage = basedOnPassage;
    }

    public Boolean getIsAttemptedInExam() {
        return isAttemptedInExam;
    }

    public void setIsAttemptedInExam(Boolean isAttemptedInExam) {
        this.isAttemptedInExam = isAttemptedInExam;
    }

    public List<OptionForMCQ> getOptions() {
        return options;
    }

    public void setOptions(List<OptionForMCQ> options) {
        this.options = options;
    }

    public String getStudentAnswer() {
        return studentAnswer;
    }

    public void setStudentAnswer(String studentAnswer) {
        this.studentAnswer = studentAnswer;
    }

    @Override
    public String toString() {
        return "MCQ{" +
                "topicId=" + topicId +
                ", difficultyValue=" + difficultyValue +
                ", topicTitle='" + topicTitle + '\'' +
                ", creatorId=" + creatorId +
                ", creatorName='" + creatorName + '\'' +
                ", statement='" + statement + '\'' +
                ", basedOnPassage=" + basedOnPassage +
                ", isAttemptedInExam=" + isAttemptedInExam +
                ", options=" + options.get(0).getOptionId() +
                ", studentAnswer=" + studentAnswer +
                '}';
    }
}
