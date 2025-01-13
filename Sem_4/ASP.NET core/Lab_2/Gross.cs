using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab_2
{
    internal interface Gross
    {
        void Gross_sal();
    }
    internal class Salary1 
    {
        public double HRA, TA, DA;
        public Salary1(double hRA, double tA, double dA)
        {
            HRA = hRA;
            TA = tA;
            DA = dA;
        }

        public void Disp_sal()
        {
            Console.WriteLine("Displaying Salary Details:");
            Console.WriteLine($"HRA: {HRA}, TA: {TA}, DA: {DA}");
        }
    }
    internal class Employee
    {
        public string Name;
        public int basic_salary;
        public Employee(string Name,int basic_salary)
        {
            this.Name = Name;
            this.basic_salary = basic_salary;
        }
        public void basic_sal()
        {
            Console.WriteLine($"Employee Name: {Name}");
            Console.WriteLine($"Basic Salary: {basic_salary}");
        }
    }
    internal class Payroll : Salary,Gross
    {
        private int basicSalary;
        private string empName;
        public Payroll(string name, int basicSalary, double tA, double dA = 500, double hRA = 2000) : base(hRA, tA, dA)
           
        {
            this.empName = name;
            this.basicSalary = basicSalary;
        }

        public void Gross_sal()
        {
            double grossSalary = basicSalary + HRA + TA + DA;
            Console.WriteLine($"Gross Salary for {empName}: {grossSalary}");
        }
        public void DisplayEmployeeDetails()
        {
            Console.WriteLine($"Employee Name: {empName}");
            Console.WriteLine($"Basic Salary: {basicSalary}");
        }
    }
}
