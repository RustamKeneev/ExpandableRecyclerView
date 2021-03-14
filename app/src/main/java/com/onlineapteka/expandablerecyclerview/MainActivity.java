package com.onlineapteka.expandablerecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ProductAdapter productAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Company> companies = new ArrayList<>();

        ArrayList<Product> producties = new ArrayList<>();
        producties.add(new Product("Pharmacy"));
        producties.add(new Product("Clinic"));
        producties.add(new Product("Laboratory"));
        producties.add(new Product("Doctors"));
        Company company= new Company("OnlineApteka",producties);
        companies.add(company);

        ArrayList<Product> google = new ArrayList<>();
        google.add(new Product("Google AdSence"));
        google.add(new Product("Google Drive"));
        google.add(new Product("Google Mail"));
        google.add(new Product("Google Doc"));
        Company companyGoogle = new Company("Google",google);
        companies.add(companyGoogle);

        productAdapter = new ProductAdapter(companies);
        recyclerView.setAdapter(productAdapter);







    }
}