package com.codies.quizapp.Models.RetrofitModels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TrueFalse {
    @SerializedName("TopicId")
    @Expose
    private Integer topicId;
    @SerializedName("TopicTitle")
    @Expose
    private String topicTitle;
    @SerializedName("DifficultyValue")
    @Expose
    private Integer difficultyValue;
    @SerializedName("CreatorId")
    @Expose
    private Integer creatorId;
    @SerializedName("CreatorName")
    @Expose
    private String creatorName;
    @SerializedName("Statement")
    @Expose
    private String statement;
    @SerializedName("NotDuplicate")
    @Expose
    private Boolean notDuplicate;
    @SerializedName("IsTrue")
    @Expose
    private Boolean isTrue;
    @SerializedName("VisibilityStatus")
    @Expose
    private Boolean visibilityStatus;
    @SerializedName("StudentAnswer")
    @Expose
    private Boolean studentAnswer;

    public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    public String getTopicTitle() {
        return topicTitle;
    }

    public void setTopicTitle(String topicTitle) {
        this.topicTitle = topicTitle;
    }

    public Integer getDifficultyValue() {
        return difficultyValue;
    }

    public void setDifficultyValue(Integer difficultyValue) {
        this.difficultyValue = difficultyValue;
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

    public Boolean getNotDuplicate() {
        return notDuplicate;
    }

    public void setNotDuplicate(Boolean notDuplicate) {
        this.notDuplicate = notDuplicate;
    }

    public Boolean getIsTrue() {
        return isTrue;
    }

    public void setIsTrue(Boolean isTrue) {
        this.isTrue = isTrue;
    }

    public Boolean getVisibilityStatus() {
        return visibilityStatus;
    }

    public void setVisibilityStatus(Boolean visibilityStatus) {
        this.visibilityStatus = visibilityStatus;
    }

    public Boolean getStudentAnswer() {
        return studentAnswer;
    }

    public void setStudentAnswer(Boolean studentAnswer) {
        this.studentAnswer = studentAnswer;
    }
}
