package cc3s2.actividadRefactorizacion;

class Ejercicio1Original {
    // Instanciamos una colección dinámica Employee
    // Instanciamos una colección dinámica Department
    public class EmployeeManager {
        public void addEmployee(String name, String department) {
        // Añade un empleado al departamento
            // Instanciamos un objeto Employee("name")
            // Buscamos un objeto Department(department: "department")
            // Añadimos un Employee(name : "name") a Department(department: "department")
            System.out.println("Empleado añadido");
        }

        public void removeEmployee(String name) {
        // Elimina un empleado
            // Buscamos un objeto Employee(name: "name")
            // Eliminamos Employee(name: "name")
            System.out.println("Empleado eliminado");
        }

        public void changeDepartment(String employeeName, String newDepartment) {
        // Cambia un empleado de departamento
            // Buscamos un objeto Employee(name: "employeeName")
            // Buscamos un objeto Department(department: "newDepartment")
            // Movemos Employee(name: "name") a Department(department: "newDepartment")
            System.out.println("Departamento cambiado");
        }

        public void printDepartmentReport(String department) {
        // Imprime un informe del departamento
            // Buscamos Department(department: "department")
            // Usamos el método Department::toString
            System.out.println("Informe del departamento " + department);
        }

        public void printAllDepartments() {
        // Imprime todos los departamentos
            // Iteramos sobre la colección de Department y aplicamos Department::toString
            // para cada elemento
            System.out.println("Lista de todos los departamentos");
        }
    }
}