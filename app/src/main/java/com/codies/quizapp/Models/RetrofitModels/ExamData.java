package com.codies.quizapp.Models.RetrofitModels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ExamData {
    @SerializedName("ExamId")
    @Expose
    private Integer examId;
    @SerializedName("ExamTitle")
    @Expose
    private String examTitle;
    @SerializedName("ExaminerId")
    @Expose
    private Integer examinerId;
    @SerializedName("ExaminerName")
    @Expose
    private String examinerName;
    @SerializedName("CreateDate")
    @Expose
    private String createDate;
    @SerializedName("StartDate")
    @Expose
    private String startDate;
    @SerializedName("EndDate")
    @Expose
    private String endDate;
    @SerializedName("Duration")
    @Expose
    private String duration;
    @SerializedName("TotalMarks")
    @Expose
    private Integer totalMarks;
    @SerializedName("ExamStatus")
    @Expose
    private String examStatus;
    @SerializedName("SelectedSubjectId")
    @Expose
    private Integer selectedSubjectId;
    @SerializedName("SelectedSubjectName")
    @Expose
    private String selectedSubjectName;
    @SerializedName("Subjects")
    @Expose
    private Subjects subjects;
    @SerializedName("ExamClasses")
    @Expose
    private ExamClasses examClasses;
    @SerializedName("ExamQuestion")
    @Expose
    private List<ExamQuestions> examQuestions;
    @SerializedName("ExamConfigs")
    @Expose
    private ExamConfigs examConfigs;

    public Integer getExamId() {
        return examId;
    }

    public void setExamId(Integer examId) {
        this.examId = examId;
    }

    public String getExamTitle() {
        return examTitle;
    }

    public void setExamTitle(String examTitle) {
        this.examTitle = examTitle;
    }

    public Integer getExaminerId() {
        return examinerId;
    }

    public void setExaminerId(Integer examinerId) {
        this.examinerId = examinerId;
    }

    public String getExaminerName() {
        return examinerName;
    }

    public void setExaminerName(String examinerName) {
        this.examinerName = examinerName;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Integer getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(Integer totalMarks) {
        this.totalMarks = totalMarks;
    }

    public String getExamStatus() {
        return examStatus;
    }

    public void setExamStatus(String examStatus) {
        this.examStatus = examStatus;
    }

    public Integer getSelectedSubjectId() {
        return selectedSubjectId;
    }

    public void setSelectedSubjectId(Integer selectedSubjectId) {
        this.selectedSubjectId = selectedSubjectId;
    }

    public String getSelectedSubjectName() {
        return selectedSubjectName;
    }

    public void setSelectedSubjectName(String selectedSubjectName) {
        this.selectedSubjectName = selectedSubjectName;
    }

    public Subjects getSubjects() {
        return subjects;
    }

    public void setSubjects(Subjects subjects) {
        this.subjects = subjects;
    }

    public ExamClasses getExamClasses() {
        return examClasses;
    }

    public void setExamClasses(ExamClasses examClasses) {
        this.examClasses = examClasses;
    }

    public List<ExamQuestions> getExamQuestions() {
        return examQuestions;
    }

    public void setExamQuestions(List<ExamQuestions> examQuestions) {
        this.examQuestions = examQuestions;
    }

    public ExamConfigs getExamConfigs() {
        return examConfigs;
    }

    public void setExamConfigs(ExamConfigs examConfigs) {
        this.examConfigs = examConfigs;
    }

}
