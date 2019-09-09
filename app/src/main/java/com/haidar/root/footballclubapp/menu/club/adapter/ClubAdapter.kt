package com.haidar.root.footballclubapp.menu.club.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.haidar.root.footballclubapp.R
import com.haidar.root.footballclubapp.menu.club.models.ClubModel
import com.haidar.root.footballclubapp.menu.club.views.ClubItem
import com.haidar.root.footballclubapp.menu.detailclub.views.ClubDetailActivity
import com.squareup.picasso.Picasso
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.startActivity

class ClubAdapter(val context: Context, var list: ArrayList<ClubModel> = arrayListOf()) :
    RecyclerView.Adapter<ClubAdapter.ClubViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClubViewHolder {
        return ClubViewHolder(ClubItem().createView(AnkoContext.create(parent.context, parent)))
    }

    override fun onBindViewHolder(holder: ClubViewHolder, position: Int) {
        val club = list[position]
        holder.tvName.text = club.name

        (club.logo.isNotEmpty())
        Picasso.get()
            .load(club.logo)
            .placeholder(R.mipmap.ic_launcher)
            .error(R.color.colorError)
            .resize(100, 100)
            .into(holder.ivLogo)

        holder.itemView.setOnClickListener {
            context.startActivity<ClubDetailActivity>("club" to club)
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class ClubViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(ClubItem.nameId)
        var ivLogo: ImageView = itemView.findViewById(ClubItem.logoId)
    }
}