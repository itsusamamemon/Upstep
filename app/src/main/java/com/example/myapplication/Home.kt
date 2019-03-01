package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import android.widget.ImageView
import android.widget.TextView
import com.ishaquehassan.recyclerviewgeneraladapter.RecyclerViewGeneralAdapter
import kotlinx.android.synthetic.main.home.*

class Home : AppCompatActivity() {
    data class livePeople(val img:Int,val name:String)
    data class event(val img:Int)
    data class today(val img:Int)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)

        people_list.adapter= RecyclerViewGeneralAdapter(
            arrayListOf(
livePeople(R.drawable.mg1,"Usama"),
livePeople(R.drawable.mg2,"Faiq"),
livePeople(R.drawable.mg3,"Junaid"),
livePeople(R.drawable.mg4,"ALi"),
livePeople(R.drawable.mg5,"Ishaq"),
livePeople(R.drawable.mg6,"Usman"),
livePeople(R.drawable.mg7,"Luqman"),
livePeople(R.drawable.mg1,"Samad"),
livePeople(R.drawable.mg2,"Baloch"),
livePeople(R.drawable.mg3,"Imran"),
livePeople(R.drawable.mg4,"Zafar"),
livePeople(R.drawable.mg5,"Hasseb")
            ),
            R.layout.people,
            {itemData,viewHolder->

            val myView = viewHolder.itemView
             myView.findViewById<de.hdodenhof.circleimageview.CircleImageView>(R.id.img_people).setImageResource(itemData.img)
               myView.findViewById<TextView>(R.id.name_people).text = itemData.name
            }
        )

    people_list.layoutManager = androidx.recyclerview.widget.LinearLayoutManager(
        this,
        androidx.recyclerview.widget.LinearLayoutManager.HORIZONTAL,
        false
    )


        events_list.adapter=RecyclerViewGeneralAdapter(
            arrayListOf(
                event(R.drawable.bg1),
                event(R.drawable.bg2),
                event(R.drawable.bg3),
                event(R.drawable.bg4),
                event(R.drawable.bg5)

            ),
            R.layout.event,
            {itemData,viewData->
                val itemView = viewData.itemView
                itemView.findViewById<ImageView>(R.id.eventImage).setImageResource(itemData.img)
            }

        )
        events_list.layoutManager = androidx.recyclerview.widget.LinearLayoutManager(
            this,
            androidx.recyclerview.widget.LinearLayoutManager.HORIZONTAL,
            false
        )


        today_list.adapter=RecyclerViewGeneralAdapter(
            arrayListOf(
                today(R.drawable.mm1),
                today(R.drawable.mm2),
                today(R.drawable.mm3),
                today(R.drawable.mm4),
                today(R.drawable.mm5),
                today(R.drawable.mm6)

            ),
            R.layout.today,
            {itemData,viewData->
                val itemView = viewData.itemView
                itemView.findViewById<ImageView>(R.id.todayImage).setImageResource(itemData.img)
            }

        )
        today_list.layoutManager = androidx.recyclerview.widget.LinearLayoutManager(
            this,
            androidx.recyclerview.widget.LinearLayoutManager.HORIZONTAL,
            false
        )


    }






}
