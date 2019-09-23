package com.xander.kiwipda.ViewModel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.xander.kiwipda.GlobalApp;
import com.xander.kiwipda.R;
import com.xander.kiwipda.ViewModel.Adapters.ProductAdapter;

public class NewCommandActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_command);
        SetViewInfo();
    }

    public void btnAddProduct_Click(View target) {
        Intent myIntent = new Intent(this, ProductTypesActivity.class);
        this.startActivity(myIntent);
    }

    private void SetViewInfo(){
        TextView textViewNewCommandInfo = findViewById(R.id.TextViewNewCommandInfo);
        textViewNewCommandInfo.setText(GlobalApp.Business.SelectedEmployee.GetName() + " / " + GlobalApp.Business.SelectedTable.GetName() + " / " + "Nueva Comanda");
    }

    private void LoadListViewCommandDetails() {


    }

}
