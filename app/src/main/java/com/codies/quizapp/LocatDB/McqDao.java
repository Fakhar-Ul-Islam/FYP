package com.codies.quizapp.LocatDB;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.codies.quizapp.Models.RoomModels.MCQ;

import java.util.List;

@Dao
public interface McqDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(MCQ mcq);

    @Update
    void update(MCQ mcq);

    @Delete
    void delete(MCQ mcq);

    @Query("Delete from mcq_table where examId=:examId")
    void deleteAllMcq(int examId);

    @Query("Select * from mcq_table where examId =:examId")
    LiveData<List<MCQ>> getAllMcq(int examId);

}
