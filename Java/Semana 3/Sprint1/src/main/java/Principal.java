

public class Principal{
        public static void main(String[]args){
            //Creacion de un nuevo empleado
            empleado Empleado1 = new empleado();
            //Modificacion de ejemplo de datos del empleado
            Empleado1.setNombre("Juan");
            Empleado1.setCorreo("juan@gmail.com");
            Empleado1.setEmpresa("MinTIC");
            Empleado1.setRol("Gerente");

            //Captura de datos del empleado

            System.out.println("Nombre: " + Empleado1.getNombre());
            System.out.println("Correo: " + Empleado1.getCorreo());
            System.out.println("Empresa: " + Empleado1.getEmpresa());
            System.out.println("Rol: " + Empleado1.getRol());
        }
    }
