package com.codies.quizapp.LocatDB;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Entity;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.codies.quizapp.Models.RoomModels.OptionForFiB;

import java.util.List;

@Dao
public interface FibOptionsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(OptionForFiB optionForFiB);

    @Update
    void update(OptionForFiB optionForFiB);

    @Delete
    void delete(OptionForFiB optionForFiB);

    @Query("Delete from option_for_fib_table where examId=:examId")
    void deleteALl(int examId);

    @Query("Select * from option_for_fib_table where examId=:examId and fibId =:fibId")
    LiveData<List<OptionForFiB>> getFibOptions(int examId, int fibId);


}
