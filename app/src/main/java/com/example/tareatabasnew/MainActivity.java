package com.example.tareatabasnew;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.tareatabasnew.databinding.ActivityMainBinding;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ViewPagerAdapter adapter = new ViewPagerAdapter(this);
        binding.viewPager.setAdapter(adapter);

        // Conecta el TabLayout con el ViewPager2
        new TabLayoutMediator(binding.tabLayout, binding.viewPager,
                (tab, position) -> {
                    switch (position) {
                        case 0: tab.setText("Lugares (List)"); break;
                        case 1: tab.setText("Animales (Grid)"); break;
                        case 2: tab.setText("Búsqueda (Text)"); break;
                    }
                }
        ).attach();
    }

    // Adaptador interno para gestionar el cambio de fragments
    private static class ViewPagerAdapter extends FragmentStateAdapter {
        public ViewPagerAdapter(@NonNull FragmentActivity fa) {
            super(fa);
        }

        @NonNull
        @Override
        public Fragment createFragment(int position) {
            switch (position) {
                case 0: return new ListaFragment();
                case 1: return new GaleriaFragment();
                case 2: return new InteraccionFragment();
                default: return new ListaFragment();
            }
        }

        @Override
        public int getItemCount() {
            return 3;
        }
    }
}