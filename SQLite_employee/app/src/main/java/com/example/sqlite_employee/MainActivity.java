package com.example.sqlite_employee;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    DatabaseHelper myDb;
    EditText editId,editFname,editLname,editPhn,editEmail,editJt,editDept,editLoc;
    Button btnAdd;
    Button btnView;
    Button btnDel;
    Button btnUpdate;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myDb = new DatabaseHelper(this);

        editId = (EditText)findViewById(R.id.id);
        editFname = (EditText)findViewById(R.id.fname);
        editLname = (EditText)findViewById(R.id.lname);
        editPhn = (EditText)findViewById(R.id.phn);
        editEmail = (EditText)findViewById(R.id.email);
        editJt = (EditText)findViewById(R.id.jt);
        editDept = (EditText)findViewById(R.id.dept);
        editLoc = (EditText)findViewById(R.id.loc);
        btnAdd = (Button)findViewById(R.id.btnAdd);
        btnView = (Button)findViewById(R.id.btnView);
        btnDel = (Button)findViewById(R.id.btnDel);
        btnUpdate = (Button)findViewById(R.id.btnUpdate);
        AddData();
        viewAll();
        deletedata();
        Updatedata();

    }

    public void Updatedata()
    {
        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isUpdate =  myDb.updatedata(editId.getText().toString(),editFname.getText().toString(),editLname.getText().toString(),editPhn.getText().toString(),editEmail.getText().toString(),editJt.getText().toString(),editDept.getText().toString(),editLoc.getText().toString());
                if(isUpdate==true)
                {
                    Toast.makeText(MainActivity.this, "Data Updated", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Data not Updated", Toast.LENGTH_SHORT).show();
                }


            }
        });
    }


    public void deletedata()
    {
        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer deleted_rows = myDb.deletedata(editId.getText().toString());
                if(deleted_rows>0)
                {
                    Toast.makeText(MainActivity.this, "Data deleted", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Data not found in database", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }


    public void AddData()
    {
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isInserted = myDb.insertData(editFname.getText().toString(),editLname.getText().toString(),editPhn.getText().toString(),editEmail.getText().toString(),editJt.getText().toString(),editDept.getText().toString(),editLoc.getText().toString());
                if (isInserted)
                {
                    Toast.makeText(MainActivity.this, "Data inserted", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Data not inserted", Toast.LENGTH_SHORT).show();
                }
                // After data added successfully, plain text area gets null value
                editFname.setText("");
                editLname.setText("");
                editPhn.setText("");
                editEmail.setText("");
                editJt.setText("");
                editDept.setText("");
                editLoc.setText("");
            }
        });
    }

    public void viewAll()
    {
        btnView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor res= myDb.getAllData();
                if(res.getCount() == 0)
                {
                    showMessage("Error","Nothing found");
                    return;
                }
                StringBuilder buffer = new StringBuilder();
                while (res.moveToNext())
                {
                    buffer.append("ID : ").append(res.getString(0)).append("\n");
                    buffer.append("First_Name : ").append(res.getString(1)).append("\n");
                    buffer.append("Last_Name : ").append(res.getString(2)).append("\n");
                    buffer.append("Phone : ").append(res.getString(3)).append("\n");
                    buffer.append("E_mail : ").append(res.getString(4)).append("\n");
                    buffer.append("Job_title : ").append(res.getString(5)).append("\n");
                    buffer.append("Department : ").append(res.getString(6)).append("\n");
                    buffer.append("Location : ").append(res.getString(7)).append("\n\n");

                }
                showMessage("Data",buffer.toString());

            }
        });
    }

    public void showMessage(String title, String Message)
    {
        AlertDialog.Builder b = new AlertDialog.Builder(this);
        b.setCancelable(true);
        b.setTitle(title);
        b.setMessage(Message);
        b.show();

    }
}