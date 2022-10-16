import java.util.ArrayList;
import java.util.List;

public class HeadDepartment implements Department {
    private Integer id;
    private String name;
    private Integer budget;
    private List<Department> childDepartments;

    public HeadDepartment(Integer id, String name, Integer budget) {
        this.id = id;
        this.name = name;
        this.budget = budget;
        this.childDepartments = new ArrayList<>();
    }

    @Override
    public void printDepartmentName() {
        System.out.println(this.name);
        childDepartments.forEach(Department::printDepartmentName);
    }

    public void addDepartment(Department department) {
        childDepartments.add(department);
    }

    public void removeDepartment(Department department){
        childDepartments.remove(department);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Integer getBudget() {
        Integer sum = this.budget;
        for (Department department : childDepartments) {
            sum += department.getBudget();
        }
        
        return sum;
    }    
}
