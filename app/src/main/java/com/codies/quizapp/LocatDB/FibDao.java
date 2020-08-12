package com.codies.quizapp.LocatDB;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.codies.quizapp.Models.RoomModels.FiB;

import java.util.List;

@Dao
public interface FibDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(FiB fiB);

    @Update
    void update(FiB fiB);

    @Delete
    void delete(FiB fiB);

    @Query("DELETE from fib_table where examId=:examId")
    void deleteAll(int examId);

    @Query("SELECT * from fib_table where examId=:examId")
    LiveData<List<FiB>> getFib(int examId);
}
