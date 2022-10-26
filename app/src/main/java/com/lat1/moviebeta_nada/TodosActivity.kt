package com.lat1.moviebeta_nada

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.RecyclerView
import com.lat1.moviebeta_nada.data.APIServices
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class TodosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_todos)
        val toolbar: Toolbar = findViewById<View>(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)
        supportActionBar!!.setTitle("Todos List")
        toolbar.setTitleTextColor(getResources().getColor(android.R.color.white))
        val coroutineExceptionHandler = CoroutineExceptionHandler{_, throwable ->
            throwable.printStackTrace()
        }
        val rvTodos = findViewById<RecyclerView>(R.id.lv_history)

        GlobalScope.launch(Dispatchers.Main + coroutineExceptionHandler){
            val resp = retrofitServices().getTodosList()

            if (resp.isSuccessful) {
                val newProductData = resp.body()?.todos
                rvTodos.adapter = TodosAdapter().apply {
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
    }
}