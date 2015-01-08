package com.redhat.lightblue.migrator.features;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.togglz.junit.TogglzRule;

public class TestLightblueMigrationDisable {

		LightblueMigration lightblueMigration = new LightblueMigration();
	
    @Rule
    public TogglzRule togglzRule = TogglzRule.allEnabled(LightblueMigrationFeatures.class);

    @Test
    public void testReadSourceEntityFeature() {
        togglzRule.disable(LightblueMigrationFeatures.READ_SOURCE_ENTITY);
        Assert.assertFalse(lightblueMigration.shouldReadSourceEntity());
    }

    @Test
    public void testWriteSourceEntityFeature() {
        togglzRule.disable(LightblueMigrationFeatures.WRITE_SOURCE_ENTITY);
        Assert.assertFalse(lightblueMigration.shouldWriteSourceEntity());
    }

    @Test
    public void testReadDestinationEntityFeature() {
        togglzRule.disable(LightblueMigrationFeatures.READ_DESTINATION_ENTITY);
        Assert.assertFalse(lightblueMigration.shouldReadDestinationEntity());
    }

    @Test
    public void testWriteDestinationEntityFeature() {
        togglzRule.disable(LightblueMigrationFeatures.WRITE_DESTINATION_ENTITY);
        Assert.assertFalse(lightblueMigration.shouldWriteDestinationEntity());
    }

    @Test
    public void testReadConsistencyEntityFeature() {
        togglzRule.disable(LightblueMigrationFeatures.READ_CONSISTENCY_ENTITY);
        Assert.assertFalse(lightblueMigration.shouldReadConsistencyEntity());
    }

    @Test
    public void testWriteConsistencyEntityFeature() {
        togglzRule.disable(LightblueMigrationFeatures.WRITE_CONSISTENCY_ENTITY);
        Assert.assertFalse(lightblueMigration.shouldWriteConsistencyEntity());
    }

}
