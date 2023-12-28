package com.example.medicare;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import io.github.dreierf.materialintroscreen.MaterialIntroActivity;
import io.github.dreierf.materialintroscreen.SlideFragment;
import io.github.dreierf.materialintroscreen.SlideFragmentBuilder;

public class IntroActivity extends MaterialIntroActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addSlide(new SlideFragmentBuilder()
                .title("Mradul")
                .image(R.drawable.passport)
                .buttonsColor(R.color.drose)
                .backgroundColor(R.color.rose)
                .build());
        addSlide(new SlideFragmentBuilder()
                .title("Sanya")
                .image(R.drawable.sanyaa)
                .buttonsColor(R.color.drose)
                .backgroundColor(R.color.rose)
                .build());
        addSlide(new SlideFragmentBuilder()
                .title("Manav")
                .image(R.drawable.menev)
                .buttonsColor(R.color.drose)
                .backgroundColor(R.color.rose)
                .build());
    }
}
