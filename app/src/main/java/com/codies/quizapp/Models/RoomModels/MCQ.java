package com.codies.quizapp.Models.RoomModels;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import com.codies.quizapp.Models.Question;

import java.util.List;

@Entity(tableName = "mcq_table")
public class MCQ extends Question {

    @PrimaryKey(autoGenerate = false)
    private Integer examId;
    private Integer mcqId;
    private Integer topicId;
    private Integer difficultyValue;
    private String topicTitle;
    private Integer creatorId;
    private String creatorName;
    private String statement;
    private String basedOnPassage;
    private Boolean isAttemptedInExam;
    @Ignore
    private List<com.codies.quizapp.Models.RoomModels.OptionForMCQ> options = null;
    private String studentAnswer;

    public MCQ() {

    }

    public MCQ(Integer examId, Integer mcqId, Integer topicId, Integer difficultyValue, String topicTitle, Integer creatorId, String creatorName, String statement, String basedOnPassage, Boolean isAttemptedInExam, List<OptionForMCQ> options, String studentAnswer) {
        this.examId = examId;
        this.mcqId = mcqId;
        this.topicId = topicId;
        this.difficultyValue = difficultyValue;
        this.topicTitle = topicTitle;
        this.creatorId = creatorId;
        this.creatorName = creatorName;
        this.statement = statement;
        this.basedOnPassage = basedOnPassage;
        this.isAttemptedInExam = isAttemptedInExam;
        this.options = options;
        this.studentAnswer = studentAnswer;
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

    public Boolean getAttemptedInExam() {
        return isAttemptedInExam;
    }

    public void setAttemptedInExam(Boolean attemptedInExam) {
        isAttemptedInExam = attemptedInExam;
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

    public String getBasedOnPassage() {
        return basedOnPassage;
    }

    public void setBasedOnPassage(String basedOnPassage) {
        this.basedOnPassage = basedOnPassage;
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
