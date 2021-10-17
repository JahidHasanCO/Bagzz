package dev.jahidhasanco.bagzz.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import dev.jahidhasanco.bagzz.R
import dev.jahidhasanco.bagzz.data.model.BagModel

class LatestBagsAdapter (private val bagList: ArrayList<BagModel>, private val context: Context): RecyclerView.Adapter<LatestBagsAdapter.ViewHolder>(){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val productView = LayoutInflater.from(parent.context).inflate(R.layout.single_item_bag,parent,false)
        return ViewHolder(productView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val bag: BagModel = bagList[position]

        holder.nameButton_singleItemBag.text = bag.title

        holder.shopNowButton_singleItemBag.setOnClickListener {
            Toast.makeText(context,"Clicked",Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return bagList.size
    }


    public class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val imageView_singleItemBag: ImageView = itemView.findViewById(R.id.imageView_singleItemBag)
        val nameButton_singleItemBag: TextView = itemView.findViewById(R.id.nameButton_singleItemBag)
        val shopNowButton_singleItemBag: TextView = itemView.findViewById(R.id.shopNowButton_singleItemBag)

    }
}