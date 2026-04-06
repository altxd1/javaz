import java.util.Scanner;


public class employee {
    private String name;
    private String prenom;
    private  int anne;
    private  double salary;

    public employee(String name, String prenom, int anne, double salary) {
        this.name = name;
        this.prenom = prenom;
        this.anne = anne;
        this.salary = salary;
    }

    public void afficher(){
        System.out.println("name: "+name);
        System.out.println("prenom: "+prenom);
        System.out.println("anne: "+anne);
        System.out.println("salary: "+salary);
    }
   
    public double getanne() {
        return anne;
    }
    public double getSalary() {
        return salary;
    }

    public void saisie(){
        try (Scanner gg = new Scanner(System.in)) {
            System.out.println("Enter name: ");
            name = gg.nextLine();
            System.out.println("Enter prenom: ");
            prenom = gg.nextLine();
            System.out.println("Enter anne: ");
            anne = gg.nextInt();
            System.out.println("Enter salary: ");
            salary = gg.nextDouble();
        }
    }
    public void saisie2(){
        try (Scanner gg = new Scanner(System.in)) {
            System.out.println("Enter name: ");
            name = gg.nextLine();
            System.out.println("Enter prenom: ");
            prenom = gg.nextLine();
        }catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }


        
    }

    public void setSalary(double s) {
        this.salary = s;
    }

    public static void main(String[] args) {
        employee e1 = new employee("Ali", "A", 2018, 3000);
        employee e2 = new employee("Sara", "B", 2022, 2500);
        employee e3 = new employee("Yassine", "C", 2015, 4200);

        employee[] employees = {e1, e2, e3};
        departement d1 = new departement("IT", "Chef1", employees);

        departement[] departements = {d1};
        entreprise ent = new entreprise(departements);

        ent.Depassement();

        System.out.println("Employees with salary greater than department average:");
        employee[] result = ent.getDepassements();
        for (employee e : result) {
            e.afficher();
            System.out.println("---");
        }
    }
   
}




class departement  {
    private employee[] emp;
    private String nom_debt;
    private String Chef_dept;

    public departement(String nom_debt, String Chef_dept, employee[] emp) {
        this.nom_debt = nom_debt;
        this.Chef_dept = Chef_dept;
        this.emp = emp;
    }
    public double salair_moyen(){
        double sum = 0;
        for (employee e : emp) {
            sum += e.getSalary();
        }
        double moy = sum / emp.length;
        System.out.println("Le salaire moyen est: " + moy);
        return moy;
}

    public employee[] getEmp(){
        return emp;
    }

    public void setEmp(employee[] emp) {
        this.emp = emp;
    }

    public void Augmentation(){
        for (employee e: emp){
            if (2026 - e.getanne() > 3) {
                e.setSalary(e.getSalary() + 500);
            }
        }
    }
}


class entreprise {
    private departement[] didi;
    private employee[] depassements;

    public entreprise(departement[] didi) {
        this.didi = didi;
    }

    public void Depassement() {
        int count = 0;
        for (departement d : didi) {
            double moy = d.salair_moyen();
            for (employee e : d.getEmp()) {
                if (e.getSalary() > moy) {
                    count++;
                }
            }
        }

        depassements = new employee[count];
        int i = 0;
        for (departement d : didi) {
            double moy = d.salair_moyen();
            for (employee e : d.getEmp()) {
                if (e.getSalary() > moy) {
                    depassements[i] = e;
                    i++;
                }
            }
        }
    }

    public employee[] getDepassements() {
        return depassements;
    }

    public void suppression(employee e) {
        if (depassements == null) {
            return;
        }

        for (departement d : didi) {
            double moy = d.salair_moyen();
            if (e.getSalary() > moy && 2026 - e.getanne() < 2) {
                int count = 0;
                for (employee current : depassements) {
                    if (current != e) {
                        count++;
                    }
                }

                employee[] updated = new employee[count];
                int i = 0;
                for (employee current : depassements) {
                    if (current != e) {
                        updated[i] = current;
                        i++;
                    }
                }

                depassements = updated;
                return;
            }
        }
    }
}