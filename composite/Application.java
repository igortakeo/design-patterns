public class Application {
    public static void main(String[] args) {
        Department financialDepartment = new FinancialDepartment(2, "Financial department", 5000);
        Department salesDepartment = new SalesDepartment(3, "Sales department", 2000);

        HeadDepartment firstDepartment = new HeadDepartment(4, "First department", 9000);
        firstDepartment.addDepartment(financialDepartment);
        firstDepartment.addDepartment(salesDepartment);

        HeadDepartment secondDepartment = new HeadDepartment(5, "Second department", 2000);

        HeadDepartment headDepartment = new HeadDepartment(0, "Head department", 50000);
        headDepartment.addDepartment(firstDepartment);
        headDepartment.addDepartment(secondDepartment);

        headDepartment.printDepartmentName();
        System.out.println(headDepartment.getBudget());
	}
}