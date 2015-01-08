package com.redhat.lightblue.migrator.features;

public class LightblueMigration {

		LightblueMigrationConfiguration lightblueMigrationConfig;
	
		public LightblueMigration() {
			
		}
		
		public LightblueMigration(LightblueMigrationConfiguration lightblueMigrationConfig) {
			this.lightblueMigrationConfig = lightblueMigrationConfig;
		}
	
    public boolean shouldReadSourceEntity() {
        return LightblueMigrationFeatures.READ_SOURCE_ENTITY.isActive();
    }

    public boolean shouldWriteSourceEntity() {
        return LightblueMigrationFeatures.WRITE_SOURCE_ENTITY.isActive();
    }

    public boolean shouldReadDestinationEntity() {
        return LightblueMigrationFeatures.READ_DESTINATION_ENTITY.isActive();
    }

    public boolean shouldWriteDestinationEntity() {
        return LightblueMigrationFeatures.WRITE_DESTINATION_ENTITY.isActive();
    }

    public boolean shouldReadConsistencyEntity() {
        return LightblueMigrationFeatures.READ_CONSISTENCY_ENTITY.isActive();
    }

    public boolean shouldWriteConsistencyEntity() {
        return LightblueMigrationFeatures.WRITE_CONSISTENCY_ENTITY.isActive();
    }

}
