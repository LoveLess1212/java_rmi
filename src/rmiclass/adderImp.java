/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rmiclass;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
/**
 *
 * @author ADMIN
 */
public class adderImp extends UnicastRemoteObject implements adder{
    public adderImp() throws RemoteException{
        super();
    }
    @Override
    public int add(int n1,int n2) throws RemoteException{
    return n1+n2;
    }
    
}
