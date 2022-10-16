public class FinancialDepartment implements Department {
    private Integer id;
    private String name;
    private Integer budget;

    public FinancialDepartment(Integer id, String name, Integer budget) {
        this.id = id;
        this.name = name;
        this.budget = budget;
    }

    @Override
    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());        
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
        return this.budget;
    }    
}
