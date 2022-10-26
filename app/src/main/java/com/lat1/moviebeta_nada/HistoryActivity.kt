package com.lat1.moviebeta_nada

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.Gson
import com.lat1.moviebeta_nada.data.APIServices
import com.lat1.moviebeta_nada.history.*
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class HistoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)
        val toolbar: Toolbar = findViewById<View>(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)
        supportActionBar!!.setTitle("History List")
        toolbar.setTitleTextColor(getResources().getColor(android.R.color.white))
        val coroutineExceptionHandler = CoroutineExceptionHandler{_, throwable ->
            throwable.printStackTrace()
        }
        val rvHistory = findViewById<RecyclerView>(R.id.lv_history)

         GlobalScope.launch(Dispatchers.Main + coroutineExceptionHandler){
            val resp = retrofitServices().getTodosList()

            if (resp.isSuccessful) {
                val newProductData = resp.body()?.todos
                rvHistory.adapter = TodosAdapter().apply {
                    setNewItem(newProductData.orEmpty())
                }
            }
        }
    }
    fun retrofitServices(): APIServices {
        return Retrofit
            .Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("https://dummyjson.com/")
            .build()
            .create(APIServices::class.java)
//        val contentt = assets
//            .open("products.json")
//            .bufferedReader()
//            .use { it.readText() }

        //parse JSON
//        val pagingData = Gson().fromJson(contentt, Product::class.java)

        //setup Adapter

//        val historyAdapter = HistoryListAdapter()
        //UNUSED historylistadapter.

//        val historyList = arrayListOf<ProductsItem>()
//        pagingData.products?.forEach {
//            historyList.add(Product(it?.description, it?.id, false))
//        }
//        historyAdapter.setNewItem(pagingData.products as ArrayList<ProductsItem>)

//        val rvHistory = findViewById<RecyclerView>(R.id.lv_history)
//        rvHistory.adapter=historyAdapter
    }
}