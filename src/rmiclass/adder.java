/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rmiclass;

import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 *
 * @author ADMIN
 */
public interface adder extends Remote{
    public int add(int n1, int n2) throws RemoteException;
}
