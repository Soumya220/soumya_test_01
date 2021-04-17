/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insurance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
//import java.util.Date;
import java.util.Scanner; 


public class PolicyTransaction {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> customersWithPolicy = new ArrayList<>();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public Company createCompany(){
        Company comobj = new Company();
        Address addobj = new Address();
        ContactDetails conobj = new ContactDetails();
        Policy polobj = new Policy();
        
        System.out.print("\nEnter Company Name:");
        String companyName= sc.nextLine();
        comobj.setCompanyName(companyName);
        
        System.out.print("Enter Address Line 1:");
        String addressLine1 = sc.nextLine();
        addobj.setAddressLine1(addressLine1);
        
        System.out.print("Enter Address Line 2:");
        String addressLine2 = sc.nextLine();
        addobj.setAddressLine2(addressLine2);
        
        System.out.print("Enter City:");
        String city = sc.nextLine();
        addobj.setCity(city);
        
        System.out.print("Enter State:");
        String state = sc.nextLine();
        addobj.setState(state);
        
        System.out.print("Enter Country:");
        String country = sc.nextLine();
        addobj.setCountry(country);
        
        System.out.print("Enter Pincode:");
        String pincode = sc.nextLine();
        addobj.setPincode(pincode);
        
        comobj.setComapanyAddress(addobj);
        
        System.out.print("Enter Phone Number:");
        String phone = sc.nextLine();
        conobj.setPhoneNumber(phone);
        
        System.out.print("Enter E-mail Address:");
        String email = sc.nextLine();
        conobj.setEmailAddress(email);
        
        comobj.setCompanyContact(conobj);
        
        return(comobj);
    }
    public ArrayList<Customer> createCustomers() throws IOException {
        ArrayList<Customer> listOfCustomers = new ArrayList<>();
        
        System.out.println("Enter number of customers you want to register: ");
        int numCustomers = sc.nextInt();
        while(numCustomers-- > 0){
            Customer cus = new Customer();
            Address addobj = new Address();
            ContactDetails conobj = new ContactDetails();
            
            System.out.println();
            
            System.out.print("Enter Customer Name:");
            //String customerName= sc.nextLine();
            cus.setCustomerName(br.readLine());
            
            System.out.print("Enter Customer ID: ");
            int customerID = sc.nextInt();
            cus.setCustomerID(customerID);
            
            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            cus.setAge(age);
            
            System.out.print("Enter Occupation: ");
            String occupation = br.readLine();
            cus.setOccupation(occupation);
            
            System.out.print("Enter Gender: ");
            String gender = sc.next();
            cus.setGender(gender);
            
            System.out.print("Enter Address Line 1:");
            String addressLine1 = br.readLine();
            addobj.setAddressLine1(addressLine1);
            
            System.out.print("Enter Address Line 2: ");
            String addressLine2 = br.readLine();
            addobj.setAddressLine2(addressLine2);
            
            System.out.print("Enter City: ");
            String city = br.readLine();
            addobj.setCity(city);
            
            System.out.print("Enter State: ");
            String state = br.readLine();
            addobj.setState(state);
            
            System.out.print("Enter Country: ");
            String country = br.readLine();
            addobj.setCountry(country);
            
            System.out.print("Enter Pin Code: ");
            String pin = br.readLine();
            addobj.setPincode(pin);
            
            cus.setCustomerAddress(addobj);
            
            System.out.print("Enter Phone Number: ");
            String phone = br.readLine();
            conobj.setPhoneNumber(phone);
            
            System.out.print("Enter E-mail Address: ");
            String email = br.readLine();
            conobj.setEmailAddress(email);
            
            cus.setContactDetails(conobj);
            
            System.out.print("Enter Annual Income: ");
            double annualIncome = sc.nextDouble();
            cus.setAnnualIncome(annualIncome);
            
            listOfCustomers.add(cus);
        }
        
        return(listOfCustomers);
    }
    public ArrayList<Policy> createPolicy() throws IOException{
        ArrayList<Policy> listOfPolicies = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter number of policies you want to create: ");
        int numPolicy = sc.nextInt();
        
        for(int i = 1 ; i <= numPolicy ; i++){
            Policy pol = new Policy();
            
            System.out.print("\nEnter details of Policy " + i + ": \n");
            
            System.out.print("Enter Policy Name: ");
            String policyName = br.readLine();
            pol.setPolicyName(policyName);
            
            System.out.print("Enter Policy ID: ");
            int policyID = sc.nextInt();
            pol.setPolicyID(policyID);
            
            System.out.print("Enter Launch Date: ");
            String launchDate = sc.next();
            pol.setLaunchDate(launchDate);
            
            System.out.print("Enter Premium Amount: ");
            double premiumAmount = sc.nextDouble();
            pol.setPremiumAmount(premiumAmount);
            
            System.out.print("Enter Coverage Amount: ");
            double coverageAmount = sc.nextDouble();
            pol.setCoverageAmount(coverageAmount);
            
            System.out.print("Enter Min Age Of Offering: ");
            int minAgeOfOffering = sc.nextInt();
            pol.setMinAgeOfOffering(minAgeOfOffering);
            
            System.out.print("Enter Max Age Of Offering: ");
            int maxAgeOfOffering = sc.nextInt();
            pol.setMaxAgeOfOffering(maxAgeOfOffering);
            
            System.out.print("Enter Expiry Date: ");
            String expiryDate = sc.next();
            pol.setExpiryDate(expiryDate);
            
            listOfPolicies.add(pol);
        }
        
        return(listOfPolicies);
    }
    public void showPolicy(Company com){
        ArrayList<Policy> policiesInForce = com.getPoliciesInForce();
        System.out.println("\nPolicies In Force: ");
        Iterator<Policy> itr = policiesInForce.iterator();
        while(itr.hasNext()){
            Policy currPolicy = (Policy)itr.next();
            System.out.println("Policy ID: " + currPolicy.getPolicyID());
            System.out.println("Policy Name: " + currPolicy.getPolicyName());
            System.out.println("Premium Amount: " + currPolicy.getPremiumAmount());
            System.out.println("Coverage Amount: " + currPolicy.getCoverageAmount());
            System.out.println("Launch Date: " + currPolicy.getLaunchDate());
            System.out.println("Expiry Date: " + currPolicy.getExpiryDate());
            System.out.println("Min Age Of Offering: " + currPolicy.getMinAgeOfOffering());
            System.out.println("Max Age Of Offering: " + currPolicy.getMaxAgeOfOffering());
            System.out.println();
        }
    }
    /**
     *
     * @param com
     * @param chosenPolicyID
     * @return
     */
    public boolean assignPolicy(Company com, int chosenPolicyID){
        Customer customerList = com.getCustomers();
        
        System.out.println("Enter Customer ID: ");
        int myID = sc.nextInt();
        Iterator itr = com.getPoliciesInForce().iterator();
        while(itr.hasNext()){
            Policy currPolicy = (Policy) itr.next();
            if(currPolicy.getPolicyID() == chosenPolicyID){
                Iterator it = customerList.iterator();
                while(it.hasNext()){
                    Customer currCustomer = (Customer)it.next();
                    if(myID == currCustomer.getCustomerID()){
                        customersWithPolicy.add(currCustomer.getCustomerID());
                        System.out.println("Policy successfully assigned");
                        return(true);
                    }
                }
            }
        }
        return(false);
    }
    public boolean deletePolicy(Company com, int customerID){
        int id;
        Iterator<Customer> itr = com.getCustomers().iterator();
        while(itr.hasNext())
            if(itr.next().getCustomerID() == customerID)
                itr.next().setAssignedPolicy(null);
        Iterator it = customersWithPolicy.iterator();
        while(it.hasNext()){
            id = (int) it.next();
            if(id == customerID) 
                it.remove();
        }
        return false;
    }
    public void showCustomerPolicy(Company com){
        Iterator itr = customersWithPolicy.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());
        
    }
}
