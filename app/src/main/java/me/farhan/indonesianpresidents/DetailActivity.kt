package me.farhan.indonesianpresidents

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_detail.*
import me.farhan.indonesianpresidents.model.President

class DetailActivity : AppCompatActivity() {

    companion object {
        val PRESIDENT = "president"
    }

    private lateinit var president: President

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        president = intent.getSerializableExtra(PRESIDENT) as President

        imageView_actionBack.setOnClickListener { onBackPressed() }

        supportActionBar?.title = "${president.name}"
        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        Glide.with(this)
            .load(president.image)
            .into(imageView_imageDetail)
        textView_nameDetail.text = president.name
        textView_bioDetail.text = president.bio
    }
}