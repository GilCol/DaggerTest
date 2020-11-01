package gil.com.feature;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import javax.inject.Inject;
import javax.inject.Named;

import gil.com.feature.di.FeatureComponent;
import gil.com.feature.di.FeatureComponentProvider;

public class FeatureActivity extends AppCompatActivity {

    @Inject
    @Named("Feature")
    String featureString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        FeatureComponent featureComponent = ((FeatureComponentProvider) getApplication())
                .provideFeatureComponent();
        featureComponent.inject(this);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feature);

        TextView textView = findViewById(R.id.feature_text);
        textView.setText(featureString);
    }
}