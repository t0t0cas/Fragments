package pt.ipt.dama.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    // create the object of type 'fragment' to use
    lateinit var f1: MyFragment
    lateinit var f2: MyFragment
    lateinit var f3: MyFragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // initialize the fragments
        f1 = MyFragment.newInstance("fragment", "one")
        f2 = MyFragment.newInstance("fragment", "two")
        f3 = MyFragment.newInstance("fragment", "three")

        val fragmentTransaction=supportFragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.fragment1, f1)
        fragmentTransaction.add(R.id.fragment2, f2)
        fragmentTransaction.add(R.id.fragment3, f3)
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()

    }
}