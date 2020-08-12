package com.codies.quizapp.LocatDB;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.codies.quizapp.Models.RoomModels.ExamData;
import com.codies.quizapp.Models.RoomModels.ExamQuestion;
import com.codies.quizapp.Models.RoomModels.FiB;
import com.codies.quizapp.Models.RoomModels.MCQ;
import com.codies.quizapp.Models.RoomModels.OptionForFiB;
import com.codies.quizapp.Models.RoomModels.OptionForMCQ;
import com.codies.quizapp.Models.RoomModels.TrueFalse;

@Database(entities = {ExamData.class, FiB.class, TrueFalse.class, MCQ.class, OptionForFiB.class, OptionForMCQ.class}, version = 8)
public abstract class LocalDatabase extends RoomDatabase {

    public static LocalDatabase localDatabase;

    public abstract ExamDAO examDAO();

    public abstract FibDao fibDao();

    public abstract TrueFalseDAO trueFalseDAO();

    public abstract McqDao mcqDao();

    public abstract McqOptionsDao mcqOptionsDao();

    public abstract FibOptionsDao fibOptionsDao();

    public static synchronized LocalDatabase getLocalDatabase(Context context) {
        if (localDatabase == null) {
            localDatabase = Room.databaseBuilder(context.getApplicationContext(), LocalDatabase.class, "local_quiz_db")
                    .addCallback(callback)
                    .fallbackToDestructiveMigration()
                    .build();

        }
        return localDatabase;
    }

    private static RoomDatabase.Callback callback = new RoomDatabase.Callback(){
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);
//            new PopulateDatabase(studentDatabase).execute();
        }

        @Override
        public void onOpen(@NonNull SupportSQLiteDatabase db) {
            super.onOpen(db);
//            new PopulateDatabase(studentDatabase).execute();
        }
    };
}
