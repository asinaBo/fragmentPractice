package com.example.neco2app567fragmenttabpractice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.activityViewModels
import com.example.neco2app567fragmenttabpractice.databinding.FragmentContentBinding
import com.example.neco2app567fragmenttabpractice.databinding.FragmentMainBinding


class MainFragment : Fragment() {
    private val model: MainViewModel by activityViewModels()

    lateinit var binding: FragmentMainBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btMF.setOnClickListener {
            model.plant.value = PlantModel(
              R.drawable.plant0,
                "Рома́шка (лат. Matricária) — род однолетних цветковых растений семейства астровые," +
                        " или сложноцветные (Asteraceae), " +
                        "по современной классификации объединяет около " +
                        "70 видов[4]невысоких пахучих трав[5], цветущих с первого года жизни.",
                "Часто ромашкой (с ботанической точки зрения ошибочно) " +
                        "называют виды растений других родов семейства Астровые, " +
                        "таких как Астра, Гербера, Дороникум, Нивяник, Остеоспермум," +
                        " Пижма, Пупавка, Трёхрёберник, Хризантема," +
                        " для соцветий-корзинок которых характерны краевые язычковые цветки " +
                        "с белыми или другой окраски лепестками и более тёмная центральная часть соцветия." +
                        " Эти соцветия напоминают единый цветок, поэтому называются антодий. Примечательно," +
                        " что в английском языке цветки в виде ромашек называют маргаритками — Daisies[6]."
            )
            (activity as AppCompatActivity).supportFragmentManager.beginTransaction().
            replace(R.id.holder,ContentFragment.newInstance()).commit()


        }
    }
    companion object {

        @JvmStatic
        fun newInstance() = MainFragment()

    }
}