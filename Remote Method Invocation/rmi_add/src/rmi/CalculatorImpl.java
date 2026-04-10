package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculatorImpl extends UnicastRemoteObject implements Calculator {
    
    public CalculatorImpl() throws RemoteException {
        super();
    }

    @Override
    public int add(int a, int b) { return a + b; }

    @Override
    public int sub(int a, int b) { return a - b; }

    @Override
    public int mul(int a, int b) { return a * b; }

    @Override
    public int div(int a, int b) {
        if (b == 0) throw new ArithmeticException("Cannot divide by zero");
        return a / b;
    }
}