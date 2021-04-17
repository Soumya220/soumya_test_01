package insurance;


import insurance.Address;
import java.util.ArrayList;

public class Company {

    /**
     * @return the assignedCustomers
     */
//    public ArrayList<Integer> getAssignedCustomers() {
//        return assignedCustomers;
//    }

    /**
     * @param assignedCustomers the assignedCustomers to set
     */
//    public void setAssignedCustomers(ArrayList<Integer> assignedCustomers) {
//        this.assignedCustomers = assignedCustomers;
//    }
    private String companyName;
    private Address compnayAddress;
    private ContactDetails_1 companyContact;
    private ArrayList<Customer> customers;
    private ArrayList<Policy> policiesInForce;
    private ArrayList<Integer> assignedCustomers;
    /**
     * @return the companyName
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * @param companyName the companyName to set
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * @return the compnayAddress
     */
    public Address getCompnayAddress() {
        return compnayAddress;
    }

    /**
     * @param addobj
     */
    public void setComapanyAddress(Address addobj) {
        this.compnayAddress = addobj;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     * @return the companyContact
     */
    public ContactDetails getCompanyContact() {
        return companyContact;
    }

    /**
     * @param companyContact the companyContact to set
     */
    public void setCompanyContact(ContactDetails companyContact) {
        this.companyContact = companyContact;
    }

    /**
     * @return the customers
     */
    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    /**
     * @param customers the customers to set
     */
    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    /**
     * @return the policies
     */
    public ArrayList<Policy> getPoliciesInForce() {
        return policiesInForce;
    }

    /**
     * @param policies the policies to set
     */
    public void setPoliciesInForce(ArrayList<Policy> policies) {
        this.policiesInForce = policies;
    }

//    void setComapanyAddress(Address addobj) {
//        this.compnayAddress = addobj;
//        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }


}
