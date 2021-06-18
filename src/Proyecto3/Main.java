/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ol196
 */
public class Main {

    public static void main(String[] args) {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        List<Cliente> cliente = new ArrayList<>();

        int opc = 100;
        while (opc != 0) {

            System.out.println("1) Agregar Clientes");
            System.out.println("2) Eliminar clientes");
            System.out.println("3) Buscar cliente");
            System.out.println("4) Mostrar clientes");
            System.out.println("0) salir");
            System.out.print("Elige una opcion:");
            opc = sc.nextInt();

            switch (opc) {
                case 1:

                    try {

                        Cliente clientes = new Cliente();
                        System.out.println("Agrege un cliente");

                        System.out.print("ID:");
                        clientes.setIdCliente(sc.nextInt());
                        System.out.print("Nombre del cliente:");
                        clientes.setNombre(bf.readLine());
                        System.out.print("Edad del cliente:");
                        clientes.setEdad(sc.nextInt());
                        System.out.print("Correo eletronico:");
                        clientes.setCorreo(bf.readLine());
                        System.out.print("Numero Telefonico:");
                        clientes.setTelefono(bf.readLine());
                        cliente.add(clientes);
                        for (int i = 0; i < cliente.size(); i++) {
                        }
                    } catch (Exception e) {
                        System.out.println("xd");
                    }

                    break;
                case 2:
                    try {
                        Cliente clientes = new Cliente();
                        Cliente opc4 = new Cliente();
                        System.out.println("Nombre a eliminar");
                        opc4.setNombre(bf.readLine());
                        for (Cliente c : cliente) {

                            if (c.getNombre().equals(opc4.getNombre())) {
                                System.out.println("Lo encontramos");
                                System.out.println("id: " + c.getIdCliente());
                                System.out.println("Nombre:" + c.getNombre());
                                System.out.println("Edad: " + c.getEdad());
                                System.out.println("Correo eletronico:" + c.getCorreo());
                                System.out.println("Telefono:" + c.getTelefono());
                                System.out.println("Se a borrado el usuario");
                                cliente.remove(c);
                                for (int i = 0; i < cliente.size(); i++) {
                                }
                            } else {
                                System.out.println("no se encontro el nombre");
                            }
                        }

                    } catch (Exception e) {

                    }

                    break;
                case 3:
                    try {
                        System.out.println("Buscar cliente");

                        Cliente opc3 = new Cliente();
                        System.out.println("Ingresa el nombre a buscar");
                        opc3.setNombre(bf.readLine());
                        for (Cliente c : cliente) {
                            if (c.getNombre().equals(opc3.getNombre())) {
                                System.out.println("Lo encontramos");
                                System.out.println("id: " + c.getIdCliente());
                                System.out.println("Nombre:" + c.getNombre());
                                System.out.println("Edad: " + c.getEdad());
                                System.out.println("Correo eletronico:" + c.getCorreo());
                                System.out.println("Telefono:" + c.getTelefono());

                            }

                        }

                    } catch (Exception e) {
                        System.out.println("no se encontro el nombre ");

                    }
                    break;
                case 4:
                    System.out.println("Listado de  Clientes");
                    System.out.println("tamaño de la lista:" + cliente.size());
                    for (Cliente c : cliente) {
                        System.out.println("id: " + c.getIdCliente());
                        System.out.println("Nombre: " + c.getNombre());
                        System.out.println("Edad:" + c.getEdad());
                        System.out.println("Correo: " + c.getCorreo());
                        System.out.println("Telefono:" + c.getTelefono());

                    }
                    break;
                case 0:
                    System.out.println("Cerraste Systema");
                    break;

            }

        }
    }
}
