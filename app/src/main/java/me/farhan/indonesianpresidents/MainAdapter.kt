package me.farhan.indonesianpresidents

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import me.farhan.indonesianpresidents.model.President

/**
 * @author farhan
 * created at at 13:43 on 07/03/21.
 */
class MainAdapter(private val context: Context) :
    ListAdapter<President, MainAdapter.ViewHolder>(DiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_president, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class ViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {

        val image = view.findViewById<ImageView>(R.id.imageView_president)
        val name = view.findViewById<TextView>(R.id.textView_name)
        val bio = view.findViewById<TextView>(R.id.textView_bio)
        val root = view.findViewById<CardView>(R.id.cardView_root)

        fun bind(president: President) {
            Glide.with(view)
                .load(president.image)
                .into(image)

            name.text = president.name
            bio.text = president.bio

            root.setOnClickListener {
                val intent = Intent(context, DetailActivity::class.java)
                intent.putExtra(DetailActivity.PRESIDENT, president)
                context.startActivity(intent)
            }
        }
    }
}

class DiffCallback : DiffUtil.ItemCallback<President>() {
    override fun areItemsTheSame(oldItem: President, newItem: President): Boolean =
        oldItem == newItem

    override fun areContentsTheSame(oldItem: President, newItem: President): Boolean =
        oldItem.name == newItem.name
}