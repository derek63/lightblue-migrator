package com.redhat.lightblue.migrator;

import java.util.List;

public class MigrationConfiguration {

    private String _id;
    private String configurationName;
    private String consistencyCheckerName;
    private List<String> authorizedHostnames;
    private int threadCount;
    private String migratorClass;
    private String consistencyCheckerClass;
    private boolean overwriteDestinationDocuments = false;
    private List<String> comparisonExclusionPaths;
    private String destinationConfigPath;
    private String destinationServiceURI;
    private String destinationEntityName;
    private String destinationEntityVersion;
    private String sourceConfigPath;
    private List<String> destinationIdentityFields;
    private String sourceServiceURI;
    private String sourceEntityName;
    private String sourceEntityVersion;


    /**
     * Gets the value of _id
     *
     * @return the value of _id
     */
    public final String get_id() {
        return this._id;
    }

    /**
     * Sets the value of _id
     *
     * @param arg_id Value to assign to this._id
     */
    public final void set_id(final String arg_id) {
        this._id = arg_id;
    }

    /**
     * Gets the value of configurationName
     *
     * @return the value of configurationName
     */
    public final String getConfigurationName() {
        return this.configurationName;
    }

    /**
     * Sets the value of configurationName
     *
     * @param argConfigurationName Value to assign to this.configurationName
     */
    public final void setConfigurationName(final String argConfigurationName) {
        this.configurationName = argConfigurationName;
    }

    /**
     * Gets the value of consistencyCheckerName
     *
     * @return the value of consistencyCheckerName
     */
    public final String getConsistencyCheckerName() {
        return this.consistencyCheckerName;
    }

    /**
     * Sets the value of consistencyCheckerName
     *
     * @param argConsistencyCheckerName Value to assign to this.consistencyCheckerName
     */
    public final void setConsistencyCheckerName(final String argConsistencyCheckerName) {
        this.consistencyCheckerName = argConsistencyCheckerName;
    }

    /**
     * Gets the value of threadCount
     *
     * @return the value of threadCount
     */
    public final int getThreadCount() {
        return this.threadCount;
    }

    /**
     * Sets the value of threadCount
     *
     * @param argThreadCount Value to assign to this.threadCount
     */
    public final void setThreadCount(final int argThreadCount) {
        this.threadCount = argThreadCount;
    }

    /**
     * Gets the value of migratorClass
     *
     * @return the value of migratorClass
     */
    public final String getMigratorClass() {
        return this.migratorClass;
    }

    /**
     * Sets the value of migratorClass
     *
     * @param argMigratorClass Value to assign to this.migratorClass
     */
    public final void setMigratorClass(final String argMigratorClass) {
        this.migratorClass = argMigratorClass;
    }

    /**
     * Gets the value of consistencyCheckerClass
     *
     * @return the value of consistencyCheckerClass
     */
    public final String getConsistencyCheckerClass() {
        return this.consistencyCheckerClass;
    }

    /**
     * Sets the value of consistencyCheckerClass
     *
     * @param argConsistencyCheckerClass Value to assign to this.consistencyCheckerClass
     */
    public final void setConsistencyCheckerClass(final String argConsistencyCheckerClass) {
        this.consistencyCheckerClass = argConsistencyCheckerClass;
    }

    public final List<String> getComparisonExclusionPaths() {
        return comparisonExclusionPaths;
    }

    public final void setComparisonExclusionPaths(List<String> s) {
        comparisonExclusionPaths=s;
    }

    /**
     * Gets the value of overwriteDestinationDocuments
     *
     * @return the value of overwriteDestinationDocuments
     */
    public final boolean isOverwriteDestinationDocuments() {
        return this.overwriteDestinationDocuments;
    }

    /**
     * Sets the value of overwriteDestinationDocuments
     *
     * @param argOverwriteDestinationDocuments Value to assign to this.overwriteDestinationDocuments
     */
    public final void setOverwriteDestinationDocuments(final boolean argOverwriteDestinationDocuments) {
        this.overwriteDestinationDocuments = argOverwriteDestinationDocuments;
    }

    /**
     * Gets the value of destinationServiceURI
     *
     * @return the value of destinationServiceURI
     */
    public final String getDestinationServiceURI() {
        return this.destinationServiceURI;
    }

    /**
     * Sets the value of destinationServiceURI
     *
     * @param argDestinationServiceURI Value to assign to this.destinationServiceURI
     */
    public final void setDestinationServiceURI(final String argDestinationServiceURI) {
        this.destinationServiceURI = argDestinationServiceURI;
    }

    /**
     * Gets the value of destinationEntityName
     *
     * @return the value of destinationEntityName
     */
    public final String getDestinationEntityName() {
        return this.destinationEntityName;
    }

    /**
     * Sets the value of destinationEntityName
     *
     * @param argDestinationEntityName Value to assign to this.destinationEntityName
     */
    public final void setDestinationEntityName(final String argDestinationEntityName) {
        this.destinationEntityName = argDestinationEntityName;
    }

    /**
     * Gets the value of destinationEntityVersion
     *
     * @return the value of destinationEntityVersion
     */
    public final String getDestinationEntityVersion() {
        return this.destinationEntityVersion;
    }

    /**
     * Sets the value of destinationEntityVersion
     *
     * @param argDestinationEntityVersion Value to assign to this.destinationEntityVersion
     */
    public final void setDestinationEntityVersion(final String argDestinationEntityVersion) {
        this.destinationEntityVersion = argDestinationEntityVersion;
    }

    /**
     * Gets the value of sourceServiceURI
     *
     * @return the value of sourceServiceURI
     */
    public final String getSourceServiceURI() {
        return this.sourceServiceURI;
    }

    /**
     * Sets the value of sourceServiceURI
     *
     * @param argSourceServiceURI Value to assign to this.sourceServiceURI
     */
    public final void setSourceServiceURI(final String argSourceServiceURI) {
        this.sourceServiceURI = argSourceServiceURI;
    }

    /**
     * Gets the value of sourceEntityName
     *
     * @return the value of sourceEntityName
     */
    public final String getSourceEntityName() {
        return this.sourceEntityName;
    }

    /**
     * Sets the value of sourceEntityName
     *
     * @param argSourceEntityName Value to assign to this.sourceEntityName
     */
    public final void setSourceEntityName(final String argSourceEntityName) {
        this.sourceEntityName = argSourceEntityName;
    }

    /**
     * Gets the value of sourceEntityVersion
     *
     * @return the value of sourceEntityVersion
     */
    public final String getSourceEntityVersion() {
        return this.sourceEntityVersion;
    }

    /**
     * Sets the value of sourceEntityVersion
     *
     * @param argSourceEntityVersion Value to assign to this.sourceEntityVersion
     */
    public final void setSourceEntityVersion(final String argSourceEntityVersion) {
        this.sourceEntityVersion = argSourceEntityVersion;
    }

    public final List<String> getDestinationIdentityFields() {
        return destinationIdentityFields;
    }

    public final void setDestinationIdentityFields(List<String> s) {
        destinationIdentityFields=s;
    }

    /**
     * Gets the value of destinationConfigPath
     *
     * @return the value of destinationConfigPath
     */
    public final String getDestinationConfigPath() {
        return this.destinationConfigPath;
    }

    /**
     * Sets the value of destinationConfigPath
     *
     * @param argDestinationConfigPath Value to assign to this.destinationConfigPath
     */
    public final void setDestinationConfigPath(final String argDestinationConfigPath) {
        this.destinationConfigPath = argDestinationConfigPath;
    }

    /**
     * Gets the value of sourceConfigPath
     *
     * @return the value of sourceConfigPath
     */
    public final String getSourceConfigPath() {
        return this.sourceConfigPath;
    }

    /**
     * Sets the value of sourceConfigPath
     *
     * @param argSourceConfigPath Value to assign to this.sourceConfigPath
     */
    public final void setSourceConfigPath(final String argSourceConfigPath) {
        this.sourceConfigPath = argSourceConfigPath;
    }
    
    @Override
    public String toString() {
        final int sbSize = 1000;
        final String variableSeparator = "  ";
        final StringBuffer sb = new StringBuffer(sbSize);

        sb.append("_id=").append(_id);
        sb.append(variableSeparator);
        sb.append("configurationName=").append(configurationName);
        sb.append(variableSeparator);
        sb.append("consistencyCheckerName=").append(consistencyCheckerName);
        sb.append(variableSeparator);
        sb.append("threadCount=").append(threadCount);
        sb.append(variableSeparator);
        sb.append("migratorClass=").append(migratorClass);
        sb.append(variableSeparator);
        sb.append("consistencyCheckerClass=").append(consistencyCheckerClass);
        sb.append(variableSeparator);
        sb.append("overwriteDestinationDocuments=").append(overwriteDestinationDocuments);
        sb.append(variableSeparator);
        sb.append("destinationServiceURI=").append(destinationServiceURI);
        sb.append(variableSeparator);
        sb.append("destinationEntityName=").append(destinationEntityName);
        sb.append(variableSeparator);
        sb.append("destinationEntityVersion=").append(destinationEntityVersion);
        sb.append(variableSeparator);
        sb.append("sourceServiceURI=").append(sourceServiceURI);
        sb.append(variableSeparator);
        sb.append("sourceEntityName=").append(sourceEntityName);
        sb.append(variableSeparator);
        sb.append("sourceEntityVersion=").append(sourceEntityVersion);

        return sb.toString();
    }
}
