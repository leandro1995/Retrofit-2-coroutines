package com.leandro1995.retrofit2coroutines.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.leandro1995.retrofit2coroutines.R
import com.leandro1995.retrofit2coroutines.model.User
import kotlinx.android.synthetic.main.item_user.view.*

class UserAdapter constructor(private val userList: MutableList<User>) :
    RecyclerView.Adapter<UserAdapter.UserHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserHolder {
        return UserHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_user, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: UserHolder, position: Int) {
        holder.itemView.userIdText.text = "id: ${userList[position].userId}"
        holder.itemView.idText.text = "userId: ${userList[position].id}"
        holder.itemView.titleText.text = "title: ${userList[position].title}"
        holder.itemView.bodyText.text = "body: ${userList[position].body}"
    }

    class UserHolder constructor(view: View) : RecyclerView.ViewHolder(view)
}