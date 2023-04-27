/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rmiclass;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
/**
 *
 * @author ADMIN
 */
public class client {
    public static void main(String args[]){
        client c = new client();
        c.connectRemote();
    }
    private void connectRemote() {
        try{
            Registry reg = LocateRegistry.getRegistry("localhost",4444);
            adder ad = (adder) reg.lookup("AddService");
            int n1= 87;
            int n2 =92;
            int result = ad.add(n1,n2);
            System.out.println("Addition is: "+ result);
        }
        catch(NotBoundException|RemoteException e){
            System.out.println("Exception: "+e);
        }
    }
}
