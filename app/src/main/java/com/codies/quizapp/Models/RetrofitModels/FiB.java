package com.codies.quizapp.Models.RetrofitModels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class FiB {

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
    @SerializedName("NotDuplicate")
    @Expose
    private boolean notDuplicate;
    @SerializedName("VisibilityStatus")
    @Expose
    private Boolean visibilityStatus;
    @SerializedName("Options")
    @Expose
    private List<OptionForFiB> options = null;
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

    public boolean getNotDuplicate() {
        return notDuplicate;
    }

    public void setNotDuplicate(boolean notDuplicate) {
        this.notDuplicate = notDuplicate;
    }

    public Boolean getVisibilityStatus() {
        return visibilityStatus;
    }

    public void setVisibilityStatus(Boolean visibilityStatus) {
        this.visibilityStatus = visibilityStatus;
    }

    public List<OptionForFiB> getOptions() {
        return options;
    }

    public void setOptions(List<OptionForFiB> options) {
        this.options = options;
    }

    public String getStudentAnswer() {
        return studentAnswer;
    }

    public void setStudentAnswer(String studentAnswer) {
        this.studentAnswer = studentAnswer;
    }

}
