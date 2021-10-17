package dev.jahidhasanco.bagzz.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import de.hdodenhof.circleimageview.CircleImageView
import dev.jahidhasanco.bagzz.R


class HomeFragment : Fragment() {

    lateinit var profileImage_homeFrag: CircleImageView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        val toolbar_homeFrag: Toolbar = view.findViewById(R.id.toolbar_homeFrag)
        profileImage_homeFrag = view.findViewById(R.id.profileImage_homeFrag)



        profileImage_homeFrag.setOnClickListener {
            Toast.makeText(context,"Profile Photo clicked",Toast.LENGTH_SHORT).show()
        }

        return view
    }


}