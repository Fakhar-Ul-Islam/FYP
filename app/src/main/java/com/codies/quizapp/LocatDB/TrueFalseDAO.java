package com.codies.quizapp.LocatDB;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.codies.quizapp.Models.RoomModels.TrueFalse;

import java.util.List;

@Dao
public interface TrueFalseDAO {


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(TrueFalse trueFalse);

    @Update
    void update(TrueFalse trueFalse);

    @Delete
    void delete(TrueFalse trueFalse);

    @Query("DELETE from true_false_table where examId=:examId")
    void deleteAll(int examId);

    @Query("SELECT * from true_false_table where examId =:examId")
    LiveData<List<TrueFalse>> getTrueFalse(int examId);
}
