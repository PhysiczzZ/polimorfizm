package taxes;

public class usnIncomeMinusExpense extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
        int taxableAmount = debit - credit;
        return taxableAmount > 0 ? (int) (taxableAmount * 0.15) : 0;
    }
}
