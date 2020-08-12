package com.codies.quizapp.LocatDB;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.codies.quizapp.Models.RoomModels.ExamData;

import java.util.List;

@Dao
public interface ExamDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(ExamData examData);

    @Update
    void update(ExamData examData);

    @Delete
    void delete(ExamData examData);

    @Query("DELETE from exam_data_table")
    void deleteAll();

    @Query("SELECT * from exam_data_table")
    LiveData<List<ExamData>> getAllExamData();
}
