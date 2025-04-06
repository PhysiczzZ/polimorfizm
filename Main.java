import taxes.usnIncome;
import taxes.usnIncomeMinusExpense;

public class Main {
    public static void main(String[] args) {
        //УСН доходы
        Company company1 = new Company("ООО 'Нетология'", new usnIncome());
        company1.shiftMoney(126000);
        company1.shiftMoney(-21000);
        company1.payTaxes();

        //УСН доходы минус расходы
        company1.setTaxSystem(new usnIncomeMinusExpense());
        company1.shiftMoney(126000);
        company1.shiftMoney(-50000);
        company1.payTaxes();
    }
}

