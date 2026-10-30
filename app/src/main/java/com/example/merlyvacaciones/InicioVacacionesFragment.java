package com.example.merlyvacaciones;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.squareup.picasso.Picasso;
import de.hdodenhof.circleimageview.CircleImageView;

public class InicioVacacionesFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_inicio_vacaciones, container, false);

        CircleImageView imgSanAndres = view.findViewById(R.id.imgSanAndres);
        CircleImageView imgCartagena = view.findViewById(R.id.imgCartagena);
        CircleImageView imgEjeCafetero = view.findViewById(R.id.imgEjeCafetero);
        CircleImageView imgSantaMarta = view.findViewById(R.id.imgSantaMarta);

        Picasso.with(requireContext()).load(R.drawable.san_andres).into(imgSanAndres);
        Picasso.with(requireContext()).load(R.drawable.cartagena).into(imgCartagena);
        Picasso.with(requireContext()).load(R.drawable.eje_cafetero).into(imgEjeCafetero);
        Picasso.with(requireContext()).load(R.drawable.santa_marta).into(imgSantaMarta);

        return view;
    }
}
