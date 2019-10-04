package com.gebeya.fetan.framework;

import android.os.Bundle;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.room.Room;

import com.gebeya.fetan.R;
import com.gebeya.fetan.data.AppDatabase;
import com.gebeya.fetan.framework.base.BaseActivity;
import com.gebeya.fetan.framework.util.Const;

import butterknife.BindView;
import butterknife.OnClick;

public class AddRunActivity extends BaseActivity {

    private AppDatabase db;

    @BindView(R.id.addRunDistanceEditText)
    EditText distanceEditText;



    EditText timeEditText;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_run);



      db = Room.databaseBuilder(
              this,
              AppDatabase.class,
              Const.DATABASE_NAME
      ).build();
    }
    @OnClick(R.id.addRunSaveButton)
    public void SaveRun()
    {
        toast("Run saved");
    }
}