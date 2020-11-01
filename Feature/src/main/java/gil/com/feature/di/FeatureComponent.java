package gil.com.feature.di;

import dagger.Subcomponent;
import gil.com.feature.FeatureActivity;

@Subcomponent
public interface FeatureComponent {

    @Subcomponent.Factory
    interface Factory {
        FeatureComponent create();
    }

    void inject(FeatureActivity featureActivity);
}
