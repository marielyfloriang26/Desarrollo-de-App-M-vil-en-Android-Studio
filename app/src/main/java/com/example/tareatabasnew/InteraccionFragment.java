package com.example.tareatabasnew;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

    public class InteraccionFragment extends Fragment {

        private EditText edtComentario;
        private Button btnMostrar;
        private TextView txtResultado;

        @Nullable
        @Override
        public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.fragment_interaccion, container, false);

            edtComentario = view.findViewById(R.id.edtComentario);
            btnMostrar = view.findViewById(R.id.btnMostrar);
            txtResultado = view.findViewById(R.id.txtResultado);

            btnMostrar.setOnClickListener(v -> {
                String textoIngresado = edtComentario.getText().toString().trim();
                if (!textoIngresado.isEmpty()) {
                    txtResultado.setText("Resultado procesado:\n\"" + textoIngresado + "\"");
                } else {
                    txtResultado.setText("Por favor, ingresa un comentario o búsqueda.");
                }
            });

            return view;
        }
    }

