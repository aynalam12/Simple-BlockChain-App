import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BlockChain {
    private List<Block> chain; 

    public BlockChain() {
        chain = new ArrayList<>(); 
        
        chain.add(new Block(new String[]{"Genesis Block Transaction"}, 0));
    }

    
    public void addBlock(String[] transactions) {
        Block previousBlock = chain.get(chain.size() - 1); 
        chain.add(new Block(transactions, previousBlock.gethashcode())); 
    }

    
    public void displayChain() {
        for (Block block : chain) {
            System.out.println("Block Hash: " + block.gethashcode());
            System.out.println("Transactions: " + Arrays.toString(block.getTransactions()));
            System.out.println("---------------------------"); 
    }
}
}
