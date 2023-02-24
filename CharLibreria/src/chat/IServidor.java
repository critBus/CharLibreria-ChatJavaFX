/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Rene
 */
public interface IServidor extends Remote{
    public int autenticar(String nombre)throws RemoteException;
    public int agregar(String nombre,int Sesion )throws RemoteException;
    public void enviar(String mensaje,int SesionDe,int SesionA)throws RemoteException;
    public List<Mensaje> recibir(int Sesion )throws RemoteException;
    public void  limpiarBuffer(int Sesion) throws RemoteException ;
}
