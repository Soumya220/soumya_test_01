/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insurance;

import java.util.Date;

/**
 *
 * @author SOUMYA
 */
public class Policy {
    private int policyID, minAgeOfOffering, maxAgeOfOffering;
    private String policyName;
    private double premiumAmount, coverageAmount;
    private String expiryDate, launchDate;

    /**
     * @return the policyID
     */
    public int getPolicyID() {
        return policyID;
    }

    /**
     * @param policyID the policyID to set
     */
    public void setPolicyID(int policyID) {
        this.policyID = policyID;
    }

    /**
     * @return the minAgeOfOffering
     */
    public int getMinAgeOfOffering() {
        return minAgeOfOffering;
    }

    /**
     * @param minAgeOfOffering the minAgeOfOffering to set
     */
    public void setMinAgeOfOffering(int minAgeOfOffering) {
        this.minAgeOfOffering = minAgeOfOffering;
    }

    /**
     * @return the maxAgeOfOffering
     */
    public int getMaxAgeOfOffering() {
        return maxAgeOfOffering;
    }

    /**
     * @param maxAgeOfOffering the maxAgeOfOffering to set
     */
    public void setMaxAgeOfOffering(int maxAgeOfOffering) {
        this.maxAgeOfOffering = maxAgeOfOffering;
    }

    /**
     * @return the policyName
     */
    public String getPolicyName() {
        return policyName;
    }

    /**
     * @param policyName the policyName to set
     */
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * @return the premiumAmount
     */
    public double getPremiumAmount() {
        return premiumAmount;
    }

    /**
     * @param premiumAmount the premiumAmount to set
     */
    public void setPremiumAmount(double premiumAmount) {
        this.premiumAmount = premiumAmount;
    }

    /**
     * @return the coverageAmount
     */
    public double getCoverageAmount() {
        return coverageAmount;
    }

    /**
     * @param coverageAmount the coverageAmount to set
     */
    public void setCoverageAmount(double coverageAmount) {
        this.coverageAmount = coverageAmount;
    }

    /**
     * @return the expiryDate
     */
    public String getExpiryDate() {
        return expiryDate;
    }

    /**
     * @param expiryDate the expiryDate to set
     */
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    /**
     * @return the launchDate
     */
    public String getLaunchDate() {
        return launchDate;
    }

    /**
     * @param launchDate the launchDate to set
     */
    public void setLaunchDate(String launchDate) {
        this.launchDate = launchDate;
    }
}
