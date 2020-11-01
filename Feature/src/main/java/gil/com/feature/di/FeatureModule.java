package gil.com.feature.di;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module(subcomponents = FeatureComponent.class)
public class FeatureModule {

    @Provides
    @Named("Feature")
    public String provideFeatureString() {
        return "Provide feature String";
    }
}
