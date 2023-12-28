package com.example.medicare;

import android.os.Bundle;
import android.widget.ImageView;

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
                .title("Wide Range Of Nutritional Products")
                .image(R.drawable.slide1)
                .buttonsColor(R.color.rose)
                .description("Diverse range of fitness products")
                .backgroundColor(R.color.drose)
                .build());
        addSlide(new SlideFragmentBuilder()
                .title("100% Original & Authentic")
                .image(R.drawable.slide2)
                .buttonsColor(R.color.rose)
                .description("Verify your products authenticity")
                .backgroundColor(R.color.drose)
                .build());
        addSlide(new SlideFragmentBuilder()
                .title("Guide to Fit and Healty Lifestyle")
                .image(R.drawable.slide3)
                .buttonsColor(R.color.rose)
                .description("We recommend products for your fitness goals")
                .backgroundColor(R.color.drose)
                .build());
    }
}
