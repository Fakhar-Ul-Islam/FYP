package com.codies.quizapp.Utils;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.codies.quizapp.Models.RoomModels.ExamData;
import com.codies.quizapp.R;

import java.util.ArrayList;
import java.util.List;

public class QuizzesAdapter extends RecyclerView.Adapter<QuizzesAdapter.QuizzesHolder> {
    public static final String TAG = "QuizAdapter";
    List<ExamData> quizzes;
    QuizOnClickListener quizOnClickListener;

    public QuizzesAdapter(QuizOnClickListener quizOnClickListener) {
        this.quizOnClickListener = quizOnClickListener;
        quizzes = new ArrayList<>();
    }

    public void setQuizzes(List<ExamData> quizzes) {
        this.quizzes = quizzes;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public QuizzesHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.quizes_cv, parent, false);
        QuizzesHolder holder = new QuizzesHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull QuizzesHolder holder, int position) {
        ExamData examData = quizzes.get(position);
        holder.quizNameTV.setText(examData.getExamTitle());
        holder.quizEndDateTV.setText(examData.getEndDate());
        holder.quizCategory.setText(examData.getExaminerName());
        holder.quizTotalMarks.setText(String.valueOf(examData.getTotalMarks()));

    }

    @Override
    public int getItemCount() {
        return quizzes.size();
    }

    public class QuizzesHolder extends RecyclerView.ViewHolder{

        TextView quizNameTV;
        TextView quizEndDateTV;
        TextView quizCategory;
        TextView quizTotalMarks;

        public QuizzesHolder(@NonNull View itemView) {
            super(itemView);
            quizNameTV = itemView.findViewById(R.id.quizNameTVQuizesCV);
            quizEndDateTV = itemView.findViewById(R.id.lastDateTVQuizesCV);
            quizCategory = itemView.findViewById(R.id.categoryTVQuizesCV);
            quizTotalMarks = itemView.findViewById(R.id.totalMarksTVQuizesCV);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (quizOnClickListener != null) {
                        int position = getAdapterPosition();
                        quizOnClickListener.onClick(position);
                    }
                }
            });

        }

    }
}
