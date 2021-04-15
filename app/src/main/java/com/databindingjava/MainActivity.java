package com.databindingjava;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.databindingjava.adapter.UserAdapter;
import com.databindingjava.databinding.ActivityMainBinding;
import com.databindingjava.model.User;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initializeRecyclerView();

    }

    private void initializeRecyclerView(){
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        UserAdapter userAdapter = new UserAdapter(getUserList());
        binding.rvUser.setLayoutManager(layoutManager);
        binding.rvUser.setAdapter(userAdapter);

    }

    private ArrayList<User> getUserList() {
        ArrayList<User> arrayList = new ArrayList();
        arrayList.add(new User(null,26,true,"https://tse1.mm.bing.net/th?id=OIP.wUSpebPuiejRYxfaSZAZegHaGA&pid=Api&rs=1&c=1&qlt=95&w=153&h=124"));
        arrayList.add(new User("Ramesh",50,false,"https://tse1.mm.bing.net/th?id=OIP.Paw8b5ftKsRvpmJQWXpkFgHaGg&pid=Api&rs=1&c=1&qlt=95&w=136&h=119"));
        arrayList.add(new User("Akash",40,true,"https://tse3.explicit.bing.net/th?id=OIP.HtpX1mpMUMjkCdeVIiMCqwHaHa&pid=Api&P=0&w=300&h=300"));
        arrayList.add(new User("Sudeep",45,false,"https://tse3.mm.bing.net/th?id=OIP.-gIOAOj6Lq-sgbQfVh_C2gHaF7&pid=Api&P=0&w=204&h=164"));
        arrayList.add(new User("Anand",32,true,"https://tse1.mm.bing.net/th?id=OIP.RkrhiFGxdnt1nJIQMfDTSQHaOG&pid=Api&P=0&w=300&h=300"));
        arrayList.add(new User("aravind",25,false,"https://tse3.mm.bing.net/th?id=OIP.Z1TUI8dDSB1j7p4Wd3cfKgHaEo&pid=Api&P=0&w=249&h=157"));
        arrayList.add(new User("Bala",53,true,"https://tse4.mm.bing.net/th?id=OIP.qvrfN79VuWHz1RxxVg7v4gHaEZ&pid=Api&P=0&w=263&h=157"));
        return arrayList;
    }
}