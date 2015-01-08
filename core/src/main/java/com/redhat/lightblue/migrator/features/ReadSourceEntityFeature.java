package com.redhat.lightblue.migrator.features;

import org.togglz.core.Feature;
import org.togglz.core.annotation.EnabledByDefault;
import org.togglz.core.annotation.Label;
import org.togglz.core.context.FeatureContext;

public class ReadSourceEntityFeature implements Feature {

    @EnabledByDefault
    @Label("Read Source Entity")
    private String readSourceEntity;
    
    public boolean isActive() {
        return FeatureContext.getFeatureManager().isActive(this);
    }

    @Override
    public String name() {
      return "READ_SOURCE_ENTITY";
    }
}
