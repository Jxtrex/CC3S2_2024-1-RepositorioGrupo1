package cc3s2.actividadRefactorizacion;

import java.util.ArrayList;
import java.util.List;

class Ejercicio1Refactorizado {
    public class Employee {
        private String name;

        Employee(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public class Department {
        String department;
        List<Employee> Empleados = new ArrayList<>();

        Department(String department) {
            this.department = department;
        }

        public String getDepartment() {
            return department;
        }
        
    }

    public class EmployeeManager {
        List<Employee> Empleados = new ArrayList<>();
        List<Department> Departamentos = new ArrayList<>();

        public void addEmployee(String name, String department) {
            // Instanciamos un objeto Employee("name")
            Employee empleado = new Employee(name);
            Department departamento = new Department(department)
            // Buscamos un objeto Department(department: "department")
            if(Departamentos.contains(departamento))
                {
                // Añadimos un Employee(name : "name") a Department(department: "department")
                Departamentos.get(Departamentos.indexOf(departamento)).Empleados.add(empleado);
                System.out.println("Empleado añadido");
        
                }
            else 
               { 
                System.out.println("No existe el departamento");
                break;
                }    
            }

        public void removeEmployee(String name) {
            // TODO Elimina un empleado
            // Buscamos un objeto Employee(name: "name")
            // FIXME: Falta implementar, interrupción no prevista
            // Eliminamos Employee(name: "name")
            System.out.println("Empleado eliminado");
        }

        public void changeDepartment(String employeeName, String newDepartment) {
            // TODO Cambia un empleado de departamento
            // Buscamos un objeto Employee(name: "employeeName")
            // Buscamos un objeto Department(department: "newDepartment")
            // Movemos Employee(name: "name") a Department(department: "newDepartment")
            System.out.println("Departamento cambiado");
        }

        public void printDepartmentReport(String department) {
            // TODO Imprime un informe del departamento
            // Buscamos Department(department: "department")
            // Usamos el método Department::toString
            System.out.println("Informe del departamento " + department);
        }

        public void printAllDepartments() {
            // TODO Imprime todos los departamentos
            // Iteramos sobre la colección de Department y aplicamos Department::toString
            // para cada elemento
            System.out.println("Lista de todos los departamentos");
        }
    }

}
