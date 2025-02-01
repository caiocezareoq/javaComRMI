package com.example;

import java.rmi.Remote;
import java.rmi.RemoteException;

// Interface remota que será usada para o RMI
public interface Hello extends Remote {
    String sayHello(String name) throws RemoteException;
}
