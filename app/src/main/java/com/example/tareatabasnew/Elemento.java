package com.example.tareatabasnew;

public class Elemento {
    // Clase modelo para manejar la infor de cada fila o celda
        private String nombre;
        private String categoria;
        private int imagenResId;

        public Elemento(String nombre, String categoria, int imagenResId) {
            this.nombre = nombre;
            this.categoria = categoria;
            this.imagenResId = imagenResId;
        }

        public String getNombre() {
            return nombre;
        }

        public String getCategoria() {
            return categoria;
        }

        public int getImagenResId() {
            return imagenResId;
        }
    }

