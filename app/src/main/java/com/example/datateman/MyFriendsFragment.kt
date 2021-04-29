package com.example.datateman

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_my_friend.*

class MyFriendsFragment : Fragment() {
    lateinit var listTeman:ArrayList<MyFriend>

    private fun simulasiDataTeman() {
        listTeman= ArrayList()
        listTeman.add(MyFriend(nama = "Wahyu Pranata", jkel = "Laki-laki", email = "wahyu_stimata@gmail.com",
            telp = "0856-0676-0953", alamat = "Jabung,Kab.Malang")
        )
        listTeman.add(MyFriend(nama = "Jaka Dwi", jkel = "Laki-laki", email = "jaka_stimata@gmail.com",
            telp = "0838-4869-1855", alamat = "Blimbing,Malang")
        )
        listTeman.add(MyFriend(nama = "Andi Surya", jkel = "Laki-laki", email = "andi_stimata@gmail.com",
            telp = "0881-0367-45214", alamat = "Kota Batu")
        )
        listTeman.add(MyFriend(nama = "Widhi Pranata", jkel = "Laki-laki", email = "widhi_stimata@gmail.com",
            telp = "0895-0421-4727", alamat = "Lawang,Kab.Malang")
        )
        listTeman.add(MyFriend(nama = "Muhammad Adib", jkel = "Laki-laki", email = "adib_stimata@gmail.com",
            telp = "0813-2243-8149", alamat = "Ciliwung,Malang")
        )
    }
    private fun tampilTeman(){
        rv_listMyFriends.layoutManager=LinearLayoutManager(activity)
        rv_listMyFriends.adapter=MyFriendAdapter(activity!!, listTeman)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_friend , container , false)
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        simulasiDataTeman()
        tampilTeman()
    }

    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }
}
