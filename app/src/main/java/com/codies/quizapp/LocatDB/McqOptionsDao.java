package com.codies.quizapp.LocatDB;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.codies.quizapp.Models.RoomModels.OptionForMCQ;

import java.util.List;

@Dao
public interface McqOptionsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(OptionForMCQ optionForMCQ);

    @Update
    void update(OptionForMCQ optionForMCQ);

    @Delete
    void delete(OptionForMCQ optionForMCQ);

    @Query("Delete from option_for_mcq_table where examId=:examId")
    void deleteAll(int examId);

    @Query("Select * from option_for_mcq_table where examId=:examId and mcqId=:mcqId")
    LiveData<List<OptionForMCQ>> getAllOptions(int examId, int mcqId);
}
