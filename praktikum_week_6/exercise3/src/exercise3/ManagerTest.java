/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise3;

/**
 *
 * @author alfie
 */
public class ManagerTest {
    public static void main(String[] args) {
        Manager[] mg = new Manager[3];
        mg[0] = new Manager("Antonio Rossi", 2000000, 1, 10, 1989);
        mg[1] = new Manager("Maria Bianchi", 2500000, 1, 12, 1991);
        mg[2] = new Manager("Isabel Vidal", 3000000, 1, 11, 1993);
        Sortable.shell_sort(mg);
        int i;
        for (i = 0; i < 3; i++) mg[i].raiseSalary(5);
        for (i = 0; i < 3; i++) mg[i].print();
    }
}
