import java.util.Arrays;

public class Block {
    private String[] transactions; 
    private int hashcode; 
    private int previoushc; 

    public Block(String[] t, int phc) { 
        transactions = t;
        previoushc = phc;
        hashcode = calculationhash();
    }

    public int calculationhash() {
        return Arrays.hashCode(transactions) + previoushc; 
    }

    public int gethashcode() { 
        return hashcode;
    }

    public String[] getTransactions() { 
        return transactions;
    }
}
