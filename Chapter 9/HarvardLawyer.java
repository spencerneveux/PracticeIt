public class HarvardLawyer extends Lawyer {
    public double getSalary() {
        return super.getSalary() + (.2 * super.getSalary());
    }
    
    public int getVacationDays() {
        return super.getVacationDays() + 3;
    }
    
    public String getVacationForm() {
        String form = "";
        for (int i = 0; i < 4; i++) {
            form += super.getVacationForm();
        }
        return form;
    }
}
