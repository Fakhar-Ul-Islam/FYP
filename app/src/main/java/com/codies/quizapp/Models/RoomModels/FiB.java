package com.codies.quizapp.Models.RoomModels;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import java.util.List;

@Entity(tableName = "fib_table")
public class FiB {

    @PrimaryKey (autoGenerate = false)
    private Integer examId;
    private Integer fibId;
    private Integer topicId;
    private Integer difficultyValue;
    private String topicTitle;
    private Integer creatorId;
    private String creatorName;
    private String statement;
    private Boolean notDuplicate;
    private Boolean visibilityStatus;
    @Ignore
    private List<Option> options = null;
    private String studentAnswer;

    public FiB() {

    }

    public FiB(Integer examId,Integer fibId, Integer topicId, Integer difficultyValue, String topicTitle, Integer creatorId, String creatorName, String statement, Boolean notDuplicate, Boolean visibilityStatus, List<Option> options, String studentAnswer) {
        this.examId = examId;
        this.topicId = topicId;
        this.fibId = fibId;
        this.difficultyValue = difficultyValue;
        this.topicTitle = topicTitle;
        this.creatorId = creatorId;
        this.creatorName = creatorName;
        this.statement = statement;
        this.notDuplicate = notDuplicate;
        this.visibilityStatus = visibilityStatus;
        this.options = options;
        this.studentAnswer = studentAnswer;
    }


    public Integer getFibId() {
        return fibId;
    }

    public void setFibId(Integer fibId) {
        this.fibId = fibId;
    }

    public Integer getExamId() {
        return examId;
    }

    public void setExamId(Integer examId) {
        this.examId = examId;
    }

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

    public Boolean getNotDuplicate() {
        return notDuplicate;
    }

    public void setNotDuplicate(Boolean notDuplicate) {
        this.notDuplicate = notDuplicate;
    }

    public Boolean getVisibilityStatus() {
        return visibilityStatus;
    }

    public void setVisibilityStatus(Boolean visibilityStatus) {
        this.visibilityStatus = visibilityStatus;
    }

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }

    public String getStudentAnswer() {
        return studentAnswer;
    }

    public void setStudentAnswer(String studentAnswer) {
        this.studentAnswer = studentAnswer;
    }

}
