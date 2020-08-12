package com.codies.quizapp.Models.RoomModels;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Entity(tableName = "true_false_table")
public class TrueFalse {

    @PrimaryKey(autoGenerate = false)
    private Integer examId;
    private Integer trueFalseId;
    private Integer topicId;
    private String topicTitle;
    private Integer difficultyValue;
    private Integer creatorId;
    private String creatorName;
    private String statement;
    private Boolean notDuplicate;
    private Boolean isTrue;
    private Boolean visibilityStatus;
    private Boolean studentAnswer;

    public TrueFalse() {

    }


    @Ignore
    public TrueFalse(Integer examId, Integer trueFalseId, Integer topicId, String topicTitle, Integer difficultyValue, Integer creatorId, String creatorName, String statement, Boolean notDuplicate, Boolean isTrue, Boolean visibilityStatus, Boolean studentAnswer) {
        this.examId = examId;
        this.trueFalseId = trueFalseId;
        this.topicId = topicId;
        this.topicTitle = topicTitle;
        this.difficultyValue = difficultyValue;
        this.creatorId = creatorId;
        this.creatorName = creatorName;
        this.statement = statement;
        this.notDuplicate = notDuplicate;
        this.isTrue = isTrue;
        this.visibilityStatus = visibilityStatus;
        this.studentAnswer = studentAnswer;
    }

    public Integer getExamId() {
        return examId;
    }

    public void setExamId(Integer examId) {
        this.examId = examId;
    }

    public Integer getTrueFalseId() {
        return trueFalseId;
    }

    public void setTrueFalseId(Integer trueFalseId) {
        this.trueFalseId = trueFalseId;
    }

    public Boolean getTrue() {
        return isTrue;
    }

    public void setTrue(Boolean aTrue) {
        isTrue = aTrue;
    }

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

/*    public Boolean getIsTrue() {
        return isTrue;
    }

    public void setIsTrue(Boolean isTrue) {
        this.isTrue = isTrue;
    }*/

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
