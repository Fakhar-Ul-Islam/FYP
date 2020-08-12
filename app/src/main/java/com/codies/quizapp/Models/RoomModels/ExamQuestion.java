package com.codies.quizapp.Models.RoomModels;

import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "exam_questions_table")
public class ExamQuestion {

    @PrimaryKey(autoGenerate = false)
    private Integer examId;

    private Integer examQuestionNumber;
    private Boolean isLastQuestionAnswered;
    private Integer examObtainedMarks;
    private Boolean isSavedInDB;
    private Integer questionId;
    private String topicTitleOfQuestion;
    private Integer type;
    private Integer marks;
    private Integer durationInSeconds;
    private String presentedUTCDateTime;
    @Ignore
    private Object sQAnswer;
    @Embedded
    private MCQ mCQ;
    @Embedded
    private TrueFalse trueFalse;
    @Embedded
    private FiB fiB;

    public ExamQuestion() {

    }

  /*  public ExamQuestion(Integer examId, Integer examQuestionNumber, Boolean isLastQuestionAnswered, Integer examObtainedMarks, Boolean isSavedInDB, Integer questionId, String topicTitleOfQuestion, Integer type, Integer marks, Integer durationInSeconds, String presentedUTCDateTime, Object sQAnswer, MCQ mCQ, TrueFalse trueFalse, FiB fiB) {
        this.examId = examId;
        this.examQuestionNumber = examQuestionNumber;
        this.isLastQuestionAnswered = isLastQuestionAnswered;
        this.examObtainedMarks = examObtainedMarks;
        this.isSavedInDB = isSavedInDB;
        this.questionId = questionId;
        this.topicTitleOfQuestion = topicTitleOfQuestion;
        this.type = type;
        this.marks = marks;
        this.durationInSeconds = durationInSeconds;
        this.presentedUTCDateTime = presentedUTCDateTime;
        this.sQAnswer = sQAnswer;
        this.mCQ = mCQ;
        this.trueFalse = trueFalse;
        this.fiB = fiB;
    }*/

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
        return mCQ;
    }

    public void setMCQ(MCQ mCQ) {
        this.mCQ = mCQ;
    }

    public TrueFalse getTrueFalse() {
        return trueFalse;
    }

    public void setTrueFalse(TrueFalse trueFalse) {
        this.trueFalse = trueFalse;
    }

    public FiB getFiB() {
        return fiB;
    }

    public void setFiB(FiB fiB) {
        this.fiB = fiB;
    }
}
