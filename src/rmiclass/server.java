/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rmiclass;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author ADMIN
 */
public class server{
    public static void main(String args[]){
        try{
    Registry reg = LocateRegistry.createRegistry(4444);
    reg.rebind("AddService",new adderImp());
    System.out.println("Server is ready...");
        }
    catch(RemoteException e){
        System.out.println("Exception"+e);
            }
}    
}
