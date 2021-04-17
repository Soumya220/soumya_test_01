/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insurance;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author SOUMYA
 */
public class Customer {
    
    private String customerName, occupation, gender;
    private int customerID, age;
    private Address customerAddress;
    private ContactDetails contactDetails;
    private double annualIncome;
    private Policy assignedPolicy;

    /**
     * @return the customerName
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * @param customerName the customerName to set
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * @return the occupation
     */
    public String getOccupation() {
        return occupation;
    }

    /**
     * @param occupation the occupation to set
     */
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the customerID
     */
    public int getCustomerID() {
        return customerID;
    }

    /**
     * @param customerID the customerID to set
     */
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the customerAddress
     */
    public Address getCustomerAddress() {
        return customerAddress;
    }

    /**
     * @param customerAddress the customerAddress to set
     */
    public void setCustomerAddress(Address customerAddress) {
        this.customerAddress = customerAddress;
    }

    /**
     * @return the contactDetails
     */
    public ContactDetails getContactDetails() {
        return contactDetails;
    }

    /**
     * @param contactDetails the contactDetails to set
     */
    public void setContactDetails(ContactDetails contactDetails) {
        this.contactDetails = contactDetails;
    }

    /**
     * @return the annualIncome
     */
    public double getAnnualIncome() {
        return annualIncome;
    }

    /**
     * @param annualIncome the annualIncome to set
     */
    public void setAnnualIncome(double annualIncome) {
        this.annualIncome = annualIncome;
    }

    /**
     * @return the assignedPolicy
     */
    public Policy getAssignedPolicy() {
        return assignedPolicy;
    }

    /**
     * @param assignedPolicy the assignedPolicy to set
     */
    public void setAssignedPolicy(Policy assignedPolicy) {
        this.assignedPolicy = assignedPolicy;
    }
}
