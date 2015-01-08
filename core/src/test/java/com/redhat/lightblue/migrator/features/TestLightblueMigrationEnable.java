package com.redhat.lightblue.migrator.features;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.togglz.junit.TogglzRule;

public class TestLightblueMigrationEnable {

		LightblueMigration lightblueMigration = new LightblueMigration();
	
    @Rule
    public TogglzRule togglzRule = TogglzRule.allDisabled(LightblueMigrationFeatures.class);

    @Test
    public void testReadSourceEntityFeature() {
        togglzRule.enable(LightblueMigrationFeatures.READ_SOURCE_ENTITY);
        Assert.assertTrue(lightblueMigration.shouldReadSourceEntity());
    }

    @Test
    public void testWriteSourecEntityFeature() {
        togglzRule.enable(LightblueMigrationFeatures.WRITE_SOURCE_ENTITY);
        Assert.assertTrue(lightblueMigration.shouldWriteSourceEntity());
    }

    @Test
    public void testReadDestinationEntityFeature() {
        togglzRule.enable(LightblueMigrationFeatures.READ_DESTINATION_ENTITY);
        Assert.assertTrue(lightblueMigration.shouldReadDestinationEntity());
    }

    @Test
    public void testWriteDestinationEntityFeature() {
        togglzRule.enable(LightblueMigrationFeatures.WRITE_DESTINATION_ENTITY);
        Assert.assertTrue(lightblueMigration.shouldWriteDestinationEntity());
    }

    @Test
    public void testReadConsistencyEntityFeature() {
        togglzRule.enable(LightblueMigrationFeatures.READ_CONSISTENCY_ENTITY);
        Assert.assertTrue(lightblueMigration.shouldReadConsistencyEntity());
    }

    @Test
    public void testWriteConsistencyEntityFeature() {
        togglzRule.enable(LightblueMigrationFeatures.WRITE_CONSISTENCY_ENTITY);
        Assert.assertTrue(lightblueMigration.shouldWriteConsistencyEntity());
    }

}
