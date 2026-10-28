package com.example.tareatabasnew;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

    public class GaleriaFragment extends Fragment {

        private GridView gridView;

        @Nullable
        @Override
        public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.fragment_galeria, container, false);

            gridView = view.findViewById(R.id.gridView);

            List<Elemento> galeria = new ArrayList<>();
            galeria.add(new Elemento("Águila", "Animales", R.drawable.aguila));
            galeria.add(new Elemento("Tigre", "Animales", R.drawable.tigre));
            galeria.add(new Elemento("Delfín", "Animales", R.drawable.delfin));

            CustomAdapter adapter = new CustomAdapter(requireContext(), galeria, R.layout.item_gridview);
            gridView.setAdapter(adapter);

            gridView.setOnItemClickListener((parent, v, position, id) -> {
                Elemento item = galeria.get(position);
                Toast.makeText(requireContext(), "Seleccionaste: " + item.getNombre(), Toast.LENGTH_SHORT).show();
            });

            return view;
        }
    }
