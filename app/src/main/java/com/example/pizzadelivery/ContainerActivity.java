package com.example.pizzadelivery;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;
import android.widget.GridLayout;
import android.widget.LinearLayout;

import com.example.pizzadelivery.adapter.PictureAdapterRecyclerView;
import com.example.pizzadelivery.model.ItemsCardview;

import java.util.ArrayList;
import java.util.List;

public class ContainerActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private PictureAdapterRecyclerView adapter;
    private List<ItemsCardview> item;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        initViews();
        initValues();

    }
    private void initViews(){
        recyclerView = findViewById(R.id.recycleViewList);
    }

    private void initValues(){
        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
        item=getItems();
        adapter=new PictureAdapterRecyclerView(item);
        recyclerView.setAdapter(adapter);
    }

    private  List<ItemsCardview> getItems(){
        List<ItemsCardview> itemsCardviews=new ArrayList<>();
        itemsCardviews.add(new ItemsCardview("Americana \uD83C\uDDFA\uD83C\uDDF8","¡La Pizza preferida de los chicos! Jamón y queso mozzarella.",R.drawable.americana));
        itemsCardviews.add(new ItemsCardview("Vegetariana \uD83E\uDD6C","Exquisita combinación de champiñones, aceitunas verdes, pimientos verdes, cebolla roja y queso mozzarella.",R.drawable.vegetariana));
        itemsCardviews.add(new ItemsCardview("Pepperoni \uD83D\uDD34","Sabor incomparable de pepperoni americano y queso mozzarella.",R.drawable.pepperoni));
        itemsCardviews.add(new ItemsCardview("Meat Lovers 🥩","¡Un festín de carnes! Pepperoni americano, salchicha italiana, carne de res, carne decerdo, rebanadas de Jamón y queso mozzarella.",R.drawable.meat_lovers));
        itemsCardviews.add(new ItemsCardview("Mozzarella \uD83E\uDDC0","Para los amantes del queso una deliciosa pizza con nuestro queso mozzarella gratinado.",R.drawable.mozzarella));
        itemsCardviews.add(new ItemsCardview("Continental \uD83C\uDF0E","Deliciosa mixtura de Jamón, champiñones, cebolla roja y queso mozzarella.",R.drawable.continental));

    return itemsCardviews;
    }
}