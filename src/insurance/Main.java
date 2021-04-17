/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insurance;
import java.util.*;
//import java.lang.reflect.*;
/**
 *
 * @author SOUMYA
 */
public class Main {
    public static void main(String[] main) throws Exception{
        Scanner sc = new Scanner(System.in);
        Company comobj = new Company();
        PolicyTransaction obj = new PolicyTransaction();
        while(true){
            System.out.println("Select your choice:\n1.Create Company\n2.Create Policy\n3.Create Customer\n4.Display Customers having policy\n5.Show policies\n6.Assign Policy\n7.Delete policy\n8.Exit");
            int choice = sc.nextInt();
            if(choice == 8)
                break;
            switch(choice){
                case 1: //Method a = PolicyTransaction.class.getDeclaredMethod("createCompany()");
                                    //a.setAccessible(true);
                                    //a.invoke(obj);
                        comobj = obj.createCompany();
                        System.out.println("Company created: \n");
                        break;
                                    
                case 2: //Method b = PolicyTransaction.class.getDeclaredMethod("createPolicy()");
                                    //b.setAccessible(true);
                                    //b.invoke(obj);
                        ArrayList<Policy> policiesInForce = obj.createPolicy();
                        comobj.setPoliciesInForce(policiesInForce);
                        //System.out.println("Policy created: \n" + comobj.getPoliciesInForce().get(0).getPolicyID());
                        break;
                                    
                case 3: //Method c = PolicyTransaction.class.getDeclaredMethod("createCustomers()");
                                    //c.setAccessible(true);
                                    //c.invoke(obj);
                        ArrayList<Customer> customerList = obj.createCustomers();
                        comobj.setCustomers(customerList);
                        break;
                                    
                case 4: //Method d = PolicyTransaction.class.getDeclaredMethod("showCustomerPolicy()");
                                    //d.setAccessible(true);
                                    //d.invoke(obj);
                        obj.showCustomerPolicy(comobj);
                        break;
                        
                case 5: //Method m = PolicyTransaction.class.getDeclaredMethod("showPolicy()");
                        //m.setAccessible(true);
                        //m.invoke(obj);
                        obj.showPolicy(comobj);
                        break;
                        
                case 6: System.out.println("Do you want a policy?\nEnter yes or no");
                        String ch = sc.next();
                        if(ch.equalsIgnoreCase("yes")){
//                            Method n = PolicyTransaction.class.getDeclaredMethod("showPolicy()");
//                            n.setAccessible(true);
//                            n.invoke(obj);
                                obj.showPolicy(comobj);
                                System.out.println("Enter the Policy Id of the policy you want: ");
                                int chosenPolicyID = sc.nextInt();
//                            Method o = PolicyTransaction.class.getDeclaredMethod("assignPolicy()");
//                            o.setAccessible(true);
//                            o.invoke(obj);
                                obj.assignPolicy(comobj, chosenPolicyID);
                        }
                        else
                            break;
                        break;
                        
                case 7: System.out.println("Enter Customer ID");
                        int cusID = sc.nextInt();
                        obj.deletePolicy(comobj, cusID);
                        break;
            }
                        System.out.println();
        }
    }
}
