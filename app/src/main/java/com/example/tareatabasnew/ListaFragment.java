package com.example.tareatabasnew;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

    public class ListaFragment extends Fragment {

        private Spinner spinnerCategorias;
        private ListView listView;
        private List<Elemento> todosLosElementos;
        private List<Elemento> elementosFiltrados;
        private CustomAdapter adapter;

        @Nullable
        @Override
        public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.fragment_lista, container, false);

            spinnerCategorias = view.findViewById(R.id.spinnerCategorias);
            listView = view.findViewById(R.id.listViewConImagenes);

            cargarDatosEstaticos();

            // Llena el Spinner con las categorias disponibles
            String[] categorias = {"Todos", "Playas", "Montañas", "Ciudades"};
            ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<>(requireContext(),
                    android.R.layout.simple_spinner_dropdown_item, categorias);
            spinnerCategorias.setAdapter(spinnerAdapter);

            elementosFiltrados = new ArrayList<>(todosLosElementos);
            adapter = new CustomAdapter(requireContext(), elementosFiltrados, R.layout.item_listview);
            listView.setAdapter(adapter);

            // Listener para filtrar el ListView al seleccionar en el Spinner
            spinnerCategorias.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    String categoriaSeleccionada = categorias[position];
                    filtrarPorCategoria(categoriaSeleccionada);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {}
            });

            return view;
        }

        private void cargarDatosEstaticos() {
            todosLosElementos = new ArrayList<>();
            todosLosElementos.add(new Elemento("Playa Bávaro", "Playas", R.drawable.playa_bavaro));
            todosLosElementos.add(new Elemento("Pico Duarte", "Montañas", R.drawable.pico_duarte));
            todosLosElementos.add(new Elemento("Zona Colonial", "Ciudades", R.drawable.zona_colonial));
            todosLosElementos.add(new Elemento("Playa Rincón", "Playas", R.drawable.playa_rincon));
            todosLosElementos.add(new Elemento("Valle Nuevo", "Montañas", R.drawable.valle_nuevo));
        }

        private void filtrarPorCategoria(String categoria) {
            elementosFiltrados.clear();
            if (categoria.equals("Todos")) {
                elementosFiltrados.addAll(todosLosElementos);
            } else {
                for (Elemento item : todosLosElementos) {
                    if (item.getCategoria().equalsIgnoreCase(categoria)) {
                        elementosFiltrados.add(item);
                    }
                }
            }
            adapter.notifyDataSetChanged();
        }
    }
