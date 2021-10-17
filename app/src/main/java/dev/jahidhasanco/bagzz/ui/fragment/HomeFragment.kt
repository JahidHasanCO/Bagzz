package dev.jahidhasanco.bagzz.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView
import dev.jahidhasanco.bagzz.R
import dev.jahidhasanco.bagzz.data.model.BagModel
import dev.jahidhasanco.bagzz.ui.adapter.LatestBagsAdapter


class HomeFragment : Fragment() {

    lateinit var profileImage_homeFrag: CircleImageView
    lateinit var latestBags_homeFrag: RecyclerView
    lateinit var latestBagsAdapter: LatestBagsAdapter
    lateinit var latestBags : ArrayList<BagModel>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        val toolbar_homeFrag: Toolbar = view.findViewById(R.id.toolbar_homeFrag)
        profileImage_homeFrag = view.findViewById(R.id.profileImage_homeFrag)
        latestBags_homeFrag = view.findViewById(R.id.latestBags_homeFrag)

        latestBags = arrayListOf()

        latestBags.add(BagModel(1,"Artsy",1))
        latestBags.add(BagModel(1,"Berkely",1))
        latestBags.add(BagModel(1,"Capucinus",1))
        latestBags.add(BagModel(1,"Monogram",1))
        latestBags.add(BagModel(1,"Artsy",1))
        latestBags.add(BagModel(1,"Berkely",1))
        latestBags.add(BagModel(1,"Capucinus",1))
        latestBags.add(BagModel(1,"Monogram",1))
        latestBags.add(BagModel(1,"Artsy",1))
        latestBags.add(BagModel(1,"Berkely",1))
        latestBags.add(BagModel(1,"Capucinus",1))
        latestBags.add(BagModel(1,"Monogram",1))
        latestBags.add(BagModel(1,"Artsy",1))
        latestBags.add(BagModel(1,"Berkely",1))
        latestBags.add(BagModel(1,"Capucinus",1))
        latestBags.add(BagModel(1,"Monogram",1))
        latestBags.add(BagModel(1,"Artsy",1))
        latestBags.add(BagModel(1,"Berkely",1))
        latestBags.add(BagModel(1,"Capucinus",1))
        latestBags.add(BagModel(1,"Monogram",1))


        latestBagsAdapter = LatestBagsAdapter(latestBags,requireContext())

        latestBags_homeFrag.apply {
            adapter = latestBagsAdapter
            layoutManager = GridLayoutManager(context,2)
            setHasFixedSize(true)
        }

        profileImage_homeFrag.setOnClickListener {
            Toast.makeText(context,"Profile Photo clicked",Toast.LENGTH_SHORT).show()
        }

        return view
    }


}