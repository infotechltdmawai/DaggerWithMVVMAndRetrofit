package com.mawai.daggerwithmvvmandretrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mawai.daggerwithmvvmandretrofit.models.LoginModel
import com.mawai.daggerwithmvvmandretrofit.models.UnitModel
import com.mawai.daggerwithmvvmandretrofit.paging.LoaderAdapter
import com.mawai.daggerwithmvvmandretrofit.paging.QuotePagingAdapter
import com.mawai.daggerwithmvvmandretrofit.response.UnitResponse
import com.mawai.daggerwithmvvmandretrofit.viewmodels.QuoteViewModel
import dagger.hilt.android.AndroidEntryPoint
import java.nio.file.Paths.get
import java.security.Key
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    lateinit var quoteViewModel: QuoteViewModel
    lateinit var recyclerView: RecyclerView
    lateinit var adapter: QuotePagingAdapter

//    lateinit var mainViewModel: MainViewModel
//
//    @Inject
//    lateinit var mainViewModelFactory: MainViewModelFactory
//
//    private val products: TextView
//        get() = findViewById(R.id.products)
//
//    private val login: Button
//        get() = findViewById(R.id.btn_login)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.quoteList)

        quoteViewModel = ViewModelProvider(this).get(QuoteViewModel::class.java)

        adapter = QuotePagingAdapter()

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = adapter.withLoadStateHeaderAndFooter(
            header = LoaderAdapter(),
            footer = LoaderAdapter()
        )


        quoteViewModel.list.observe(this,Observer{
            adapter.submitData(lifecycle,it)
        })

//        (application as FakerApplication).applicationComponent.inject(this)
//
//        val map = (application as FakerApplication).applicationComponent.getMap()
//
//        mainViewModel = ViewModelProvider(this,mainViewModelFactory).get(MainViewModel::class.java)

//        login.setOnClickListener(View.OnClickListener {
//            val loginModel = LoginModel("10001","ADMIN","123")
//            getLogin(loginModel)
//        })



//        getUnitList()

    }

//    private fun getUnitList() {
//        mainViewModel.productLiveData.observe(this, Observer{
//                products.text = it.joinToString { x -> x.title + "\n\n"  }
////                var unitModel = ArrayList<UnitModel>()
////                unitModel = it.data as ArrayList<UnitModel>
////
////                unitModel.forEach { e->
////                    products.text = e.name + "\n\n"
////                }
////                it.data?.let {
////                    it1 -> unitModel.addAll(it1)
////                }
////                it.data?.forEach { e ->
////                    products.text = e.name
////                }
////                Toast.makeText(this, "  " + it.message, Toast.LENGTH_SHORT).show()
////            }else{
////                Toast.makeText(this, "  " + it.message, Toast.LENGTH_SHORT).show()
////            }
//
//        })
//
//    }

//    private fun getLogin(loginModel: LoginModel) {
//        mainViewModel.callGetLoginDetail(loginModel).observe(this, Observer(){
//            if (it != null) {
//                if (it.status==true) {
//
//                    Toast.makeText(this, "  " + it.message, Toast.LENGTH_SHORT).show()
//                }else{
//                    Toast.makeText(this, "  " + it.message, Toast.LENGTH_SHORT).show()
//                }
//            }
////           products.text = it.data { x -> x.title + "\n\n"  }
//        })
//
//    }
}